package com.xlinyu.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.xlinyu.dao.UserMapper;
import com.xlinyu.model.User;
import com.xlinyu.service.IUserService;

@Service
public class UserService implements IUserService {

	@Resource
	private UserMapper userMapper;

	@Override
	public List<User> getAllUser() {
		return userMapper.getAllUser();
	}

}
