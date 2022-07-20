package com.hyfly.milet.shop.common.utils;

import com.hyfly.milet.shop.common.annotation.SensitiveField;
import com.hyfly.milet.shop.common.enums.SensitiveEnum;
import lombok.extern.slf4j.Slf4j;

import java.lang.reflect.Field;
import java.util.Collections;
import java.util.Objects;

/**
 * 敏感信息处理工具类
 *
 * @author taoYan
 * @date 2022/4/20 18:01
 **/
@Slf4j
public class SensitiveInfoUtil {
    public static Object handlerObject(Object obj, boolean isEncode) throws IllegalAccessException {

        // TODO: 2022/7/20 判断该Object是否是一个对象
        if (Objects.isNull(obj)) {
            return obj;
        }

        Field[] fields = obj.getClass().getDeclaredFields();

        for (Field field : fields) {
            boolean isSensitiveField = field.isAnnotationPresent(SensitiveField.class);
            if (isSensitiveField) {
                if (field.getType().isAssignableFrom(String.class)) {
                    field.setAccessible(true);

                    String value = (String) field.get(obj);
                    if (value == null || "".equals(value)) {
                        continue;
                    }

                    SensitiveField sf = field.getAnnotation(SensitiveField.class);

                    if (isEncode) {
                        // 加密
                        value = SensitiveInfoUtil.encode(value, sf.type());
                    } else {
                        if (sf.type().equals(SensitiveEnum.ENCODE)) {
                            // 解密
                            value = SensitiveInfoUtil.decode(value);
                        }
                    }
                    field.set(obj, value);
                }
            }
        }

        return obj;
    }

    public static String encode(String value, SensitiveEnum type) {
        String result;
        switch (type) {
            case ENCODE:
                try {
                    result = AesEncryptUtil.encrypt(value);
                } catch (Exception exception) {
                    log.error("数据加密错误", exception.getMessage());
                    result = value;
                }
                break;
            case CHINESE_NAME:
                result = chineseName(value);
                break;
            case ID_CARD:
                result = idCardNum(value);
                break;
            case FIXED_PHONE:
                result = fixedPhone(value);
                break;
            case MOBILE_PHONE:
                result = mobilePhone(value);
                break;
            case ADDRESS:
                result = address(value, 3);
                break;
            case EMAIL:
                result = email(value);
                break;
            case BANK_CARD:
                result = bankCard(value);
                break;
            default:
                result = value;
        }
        return result;
    }

    public static String decode(String value) {
        String result = null;
        try {
            result = AesEncryptUtil.desEncrypt(value);
        } catch (Exception exception) {
            log.warn("数据解密错误，原数据:" + value);
        }
        //解决debug模式下，加解密失效导致中文被解密变成空的问题
        return result;
    }

    /**
     * [中文姓名] 只显示第一个汉字，其他隐藏为2个星号
     *
     * @param fullName 全名
     * @return <例子：李**>
     */
    private static String chineseName(String fullName) {

        return formatRight(fullName, 1);
    }

    /**
     * [中文姓名] 只显示第一个汉字，其他隐藏为2个星号
     *
     * @param familyName 姓
     * @param firstName  名
     * @return <例子：李**>
     */
    private static String chineseName(String familyName, String firstName) {
        return chineseName(familyName + firstName);
    }

    /**
     * [身份证号] 显示最后四位，其他隐藏。共计18位或者15位。
     *
     * @param id 身份证号
     * @return <例子：*************5762>
     */
    private static String idCardNum(String id) {
        return formatLeft(id, 4);

    }

    /**
     * [固定电话] 后四位，其他隐藏
     *
     * @param num 固定电话
     * @return <例子：****1234>
     */
    private static String fixedPhone(String num) {
        return formatLeft(num, 4);
    }

    /**
     * [手机号码] 前三位，后四位，其他隐藏
     *
     * @param num 手机号码
     * @return <例子:138******1234>
     */
    private static String mobilePhone(String num) {
        int len = num.length();
        if (len < 11) {
            return num;
        }
        return formatBetween(num, 3, 4);
    }

    /**
     * [地址] 只显示到地区，不显示详细地址；我们要对个人信息增强保护
     *
     * @param address       地址
     * @param sensitiveSize 敏感信息长度
     * @return <例子：北京市海淀区****>
     */
    private static String address(String address, int sensitiveSize) {
        int len = address.length();
        if (len < sensitiveSize) {
            return address;
        }
        return formatRight(address, sensitiveSize);
    }

    /**
     * [电子邮箱] 邮箱前缀仅显示第一个字母，前缀其他隐藏，用星号代替，@及后面的地址显示
     *
     * @param email 电子邮箱
     * @return <例子:g**@163.com>
     */
    private static String email(String email) {
        int index = email.indexOf("@");
        if (index <= 1) {
            return email;
        }
        String begin = email.substring(0, 1);
        String end = email.substring(index);
        String stars = "**";
        return begin + stars + end;
    }

    /**
     * [银行卡号] 前六位，后四位，其他用星号隐藏每位1个星号
     *
     * @param cardNum 银行卡号
     * @return <例子:6222600**********1234>
     */
    private static String bankCard(String cardNum) {
        return formatBetween(cardNum, 6, 4);
    }

    /**
     * [公司开户银行联号] 公司开户银行联行号,显示前两位，其他用星号隐藏，每位1个星号
     *
     * @param code 公司开户银行联号
     * @return <例子:12********>
     */
    private static String cnapsCode(String code) {
        return formatRight(code, 2);
    }


    /**
     * 将右边的格式化成*
     *
     * @param str            字符串
     * @param reservedLength 保留长度
     * @return 格式化后的字符串
     */
    private static String formatRight(String str, int reservedLength) {
        String name = str.substring(0, reservedLength);
        String stars = String.join("", Collections.nCopies(str.length() - reservedLength, "*"));
        return name + stars;
    }

    /**
     * 将左边的格式化成*
     *
     * @param str            字符串
     * @param reservedLength 保留长度
     * @return 格式化后的字符串
     */
    private static String formatLeft(String str, int reservedLength) {
        int len = str.length();
        String show = str.substring(len - reservedLength);
        String stars = String.join("", Collections.nCopies(len - reservedLength, "*"));
        return stars + show;
    }

    /**
     * 将中间的格式化成*
     *
     * @param str      字符串
     * @param beginLen 开始保留长度
     * @param endLen   结尾保留长度
     * @return 格式化后的字符串
     */
    private static String formatBetween(String str, int beginLen, int endLen) {
        int len = str.length();
        String begin = str.substring(0, beginLen);
        String end = str.substring(len - endLen);
        String stars = String.join("", Collections.nCopies(len - beginLen - endLen, "*"));
        return begin + stars + end;
    }
}