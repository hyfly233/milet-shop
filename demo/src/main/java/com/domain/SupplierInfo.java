package com.domain;

import java.util.Date;
import lombok.Builder;
import lombok.Data;

/**
    * 供应商信息表
    */
@Data
@Builder
public class SupplierInfo {
    /**
    * 供应商ID
    */
    private Integer supplierId;

    /**
    * 供应商编码
    */
    private String supplierCode;

    /**
    * 供应商名称
    */
    private String supplierName;

    /**
    * 供应商类型：1.自营，2.平台
    */
    private Byte supplierType;

    /**
    * 供应商联系人
    */
    private String linkMan;

    /**
    * 联系电话
    */
    private String phoneNumber;

    /**
    * 供应商开户银行名称
    */
    private String bankName;

    /**
    * 银行账号
    */
    private String bankAccount;

    /**
    * 供应商地址
    */
    private String address;

    /**
    * 状态：0禁止，1启用
    */
    private Byte supplierStatus;

    /**
    * 最后修改时间
    */
    private Date modifiedTime;
}