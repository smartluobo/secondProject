package com.smart.luobo.service.idea.impl;

import com.smart.luobo.dao.IdeaUserMapper;
import com.smart.luobo.entity.IdeaUser;
import com.smart.luobo.service.idea.IdeaUserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class IdeaUserServiceImpl implements IdeaUserService {

    @Resource
    private IdeaUserMapper ideaUserMapper;
    @Override
    public void deleteByPrimaryKey(Integer id) {
        ideaUserMapper.deleteByPrimaryKey(id);
    }

    @Override
    public void insertIdeaUser(IdeaUser record) {
        ideaUserMapper.insertIdeaUser(record);
    }

    @Override
    public IdeaUser selectByPrimaryKey(Integer id) {
        return ideaUserMapper.selectByPrimaryKey(id);
    }

    @Override
    public void updateByPrimaryKeySelective(IdeaUser record) {
        ideaUserMapper.updateByPrimaryKeySelective(record);
    }
}
