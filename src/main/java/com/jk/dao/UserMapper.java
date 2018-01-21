package com.jk.dao;


import com.jk.model.User;

import java.util.List;

public interface UserMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);

    List<User> queryUser();

//	List<User> queryUser(String aa);
//
//	User selectuser(String id);
}