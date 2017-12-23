package com.smart.luobo.service.impl;

import com.smart.luobo.dao.IdeaUserMapper;
import com.smart.luobo.dao.IndexDao;
import com.smart.luobo.dao.UserDao;
import com.smart.luobo.entity.IdeaUser;
import com.smart.luobo.service.IndexService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class IndexServiceImpl implements IndexService {

    @Resource
    private IndexDao indexDao;

    @Resource
    private UserDao userDao;

    @Resource
    private IdeaUserMapper ideaUserMapper;

    @Override
    public String sayHello(String param) {
        return "indexService:" + indexDao.sayHello(param);
    }

    @Override
    public List<IdeaUser> queryAllUser() {
        return userDao.queryAllUser();
    }

    @Override
    public void insertUser(IdeaUser ideaUser) {
        userDao.insertUser(ideaUser);
    }

    @Override
    public void updateUserBySerilno(IdeaUser ideaUser) {
        userDao.updateUserBySerilno(ideaUser);
    }
}
