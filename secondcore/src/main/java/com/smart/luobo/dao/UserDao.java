package com.smart.luobo.dao;

import com.smart.luobo.entity.IdeaUser;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface UserDao {

    List<IdeaUser> queryAllUser();

    void updateUserBySerilno(IdeaUser ideaUser);

    void insertUser(IdeaUser ideaUser);
}
