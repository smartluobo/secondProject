package com.smart.luobo.service;

import com.smart.luobo.entity.IdeaUser;

import java.util.List;

public interface IndexService {

    String sayHello(String param);

    List<IdeaUser> queryAllUser();

    void insertUser(IdeaUser ideaUser);

    void updateUserBySerilno(IdeaUser ideaUser);
}
