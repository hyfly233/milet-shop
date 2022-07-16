package com.mapper;

import com.domain.CustomerAddr;

public interface CustomerAddrMapper {
    int deleteByPrimaryKey(Integer customerAddrId);

    int insert(CustomerAddr record);

    int insertSelective(CustomerAddr record);

    CustomerAddr selectByPrimaryKey(Integer customerAddrId);

    int updateByPrimaryKeySelective(CustomerAddr record);

    int updateByPrimaryKey(CustomerAddr record);
}