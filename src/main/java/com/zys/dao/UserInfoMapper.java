package com.zys.dao;

import com.zys.entitys.UserInfo;

public interface UserInfoMapper {
    /**
     * 根据ID删除
     * @mbggenerated
     */
    int deleteByPrimaryKey(Long userId);

    /**
     * 添加
     * @mbggenerated
     */
    int insert(UserInfo record);

    /**
     * 添加时排除空值
     * @mbggenerated
     */
    int insertSelective(UserInfo record);

    /**
     * 查询是否存在
     * @mbggenerated
     */
    UserInfo selectByPrimaryKey(Long userId);

    /**
     * 更新时排除空值
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(UserInfo record);

    /**
     * 更新，根据主键更新
     * @mbggenerated
     */
    int updateByPrimaryKey(UserInfo record);
}