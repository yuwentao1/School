package com.shoocl.ywt.login.seriver.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shoocl.ywt.login.entity.P_jaTable;
import com.shoocl.ywt.login.entity.User;
import com.shoocl.ywt.login.mapper.UserMapper;
import com.shoocl.ywt.login.seriver.userSeriver;

@Service
public class userSeriverImpl implements userSeriver{

	@Autowired
	private UserMapper mapper;
	
	@Override
	public User query(String username) {
		// TODO Auto-generated method stub
		return mapper.query(username);
	}

	@Override
	public List<String> jurisdiction(int pa_id) {
		// TODO Auto-generated method stub
		return mapper.jurisdiction(pa_id);
	}

}
