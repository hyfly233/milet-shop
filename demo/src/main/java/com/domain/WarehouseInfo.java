package com.domain;

import java.util.Date;
import lombok.Builder;
import lombok.Data;

/**
    * 仓库信息表
    */
@Data
@Builder
public class WarehouseInfo {
    /**
    * 仓库ID
    */
    private Short wId;

    /**
    * 仓库编码
    */
    private String warehouseSn;

    /**
    * 仓库名称
    */
    private String warehoustName;

    /**
    * 仓库电话
    */
    private String warehousePhone;

    /**
    * 仓库联系人
    */
    private String contact;

    /**
    * 省
    */
    private Short province;

    /**
    * 市
    */
    private Short city;

    /**
    * 区
    */
    private Short distrct;

    /**
    * 仓库地址
    */
    private String address;

    /**
    * 仓库状态：0禁用，1启用
    */
    private Byte warehouseStatus;

    /**
    * 最后修改时间
    */
    private Date modifiedTime;
}