package com.mapper;

import com.domain.CustomerPointLog;

public interface CustomerPointLogMapper {
    int deleteByPrimaryKey(Integer pointId);

    int insert(CustomerPointLog record);

    int insertSelective(CustomerPointLog record);

    CustomerPointLog selectByPrimaryKey(Integer pointId);

    int updateByPrimaryKeySelective(CustomerPointLog record);

    int updateByPrimaryKey(CustomerPointLog record);
}