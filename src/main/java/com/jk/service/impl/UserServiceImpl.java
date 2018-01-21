package com.jk.service.impl;

import com.jk.dao.UserMapper;
import com.jk.model.User;
import com.jk.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

//import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private UserMapper userMapper;
    public List<User> queryUser() {
        return userMapper.queryUser();
    }


//
//	@Autowired
//	private UserMapper userMapper;
//
//	public List<User> queryUser(String aa) {
//		return userMapper.queryUser(aa);
//	}
//
//	public User selectuser(String id) {
//		return null;
//	}
}

