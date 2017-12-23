package com.smart.luobo.service.idea;

import com.smart.luobo.entity.IdeaUser;

public interface IdeaUserService {

    void deleteByPrimaryKey(Integer id);

    void insertIdeaUser(IdeaUser record);

    IdeaUser selectByPrimaryKey(Integer id);

    void updateByPrimaryKeySelective(IdeaUser record);
}
