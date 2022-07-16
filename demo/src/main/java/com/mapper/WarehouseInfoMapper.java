package com.mapper;

import com.domain.WarehouseInfo;

public interface WarehouseInfoMapper {
    int deleteByPrimaryKey(Short wId);

    int insert(WarehouseInfo record);

    int insertSelective(WarehouseInfo record);

    WarehouseInfo selectByPrimaryKey(Short wId);

    int updateByPrimaryKeySelective(WarehouseInfo record);

    int updateByPrimaryKey(WarehouseInfo record);
}