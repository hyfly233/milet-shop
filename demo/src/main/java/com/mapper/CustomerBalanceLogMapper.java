package com.mapper;

import com.domain.CustomerBalanceLog;

public interface CustomerBalanceLogMapper {
    int deleteByPrimaryKey(Integer balanceId);

    int insert(CustomerBalanceLog record);

    int insertSelective(CustomerBalanceLog record);

    CustomerBalanceLog selectByPrimaryKey(Integer balanceId);

    int updateByPrimaryKeySelective(CustomerBalanceLog record);

    int updateByPrimaryKey(CustomerBalanceLog record);
}