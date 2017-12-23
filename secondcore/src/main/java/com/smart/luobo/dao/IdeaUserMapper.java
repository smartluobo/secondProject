package com.smart.luobo.dao;

import com.smart.luobo.entity.IdeaUser;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Repository
@Mapper
public interface IdeaUserMapper {
    void deleteByPrimaryKey(Integer id);

    void insertIdeaUser(IdeaUser record);

    IdeaUser selectByPrimaryKey(Integer id);

    void updateByPrimaryKeySelective(IdeaUser record);
}