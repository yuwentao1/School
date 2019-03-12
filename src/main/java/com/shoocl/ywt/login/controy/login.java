package com.shoocl.ywt.login.controy;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.shoocl.ywt.login.entity.User;
import com.shoocl.ywt.login.mapper.UserMapper;
import com.shoocl.ywt.login.seriver.userSeriver;

@Controller
public class login {

	@Autowired
	private userSeriver user;
	
	@RequestMapping("se")
	@ResponseBody
	public String select(String username){
		System.out.println(user);
		List<String> u= user.jurisdiction(1);
		for (String string : u) {
			System.out.println(string);
		}
		return null;
	}
}
