package com.yiwen.mall.dao.mapper;

import com.yiwen.mall.dao.model.UmsAdminLoginLog;
import org.springframework.stereotype.Repository;

@Repository
public interface UmsAdminLoginLogMapper {
    int deleteByPrimaryKey(Long id);

    int insert(UmsAdminLoginLog record);

    int insertSelective(UmsAdminLoginLog record);

    UmsAdminLoginLog selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(UmsAdminLoginLog record);

    int updateByPrimaryKey(UmsAdminLoginLog record);
}
