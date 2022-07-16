package com.mapper;

import com.domain.WarehouseProduct;

public interface WarehouseProductMapper {
    int deleteByPrimaryKey(Integer wpId);

    int insert(WarehouseProduct record);

    int insertSelective(WarehouseProduct record);

    WarehouseProduct selectByPrimaryKey(Integer wpId);

    int updateByPrimaryKeySelective(WarehouseProduct record);

    int updateByPrimaryKey(WarehouseProduct record);
}