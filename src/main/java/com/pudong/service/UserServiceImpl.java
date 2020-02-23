/**
 * 
 */
package com.pudong.service;

import java.util.List;

import javax.annotation.Resource;
import javax.xml.ws.ServiceMode;

import org.springframework.stereotype.Service;

import com.pudong.mapper.UserMapper;
import com.pudong.pojo.User;

@Service
public class UserServiceImpl implements UserService{
	
	@Resource
	private UserMapper userMapper;

	@Override
	public List<User> show() {
		
		return userMapper.selectAll();
	}
	
	
}
