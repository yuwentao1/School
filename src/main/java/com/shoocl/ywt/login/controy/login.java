package com.shoocl.ywt.login.controy;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
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
	
	@RequestMapping("login")
	@ResponseBody
	public String select(String username,String password,String tion1,HttpServletRequest res){
		System.out.println(username);
		System.out.println(password);
		System.out.println(tion1);
		 UsernamePasswordToken usernamePasswordToken=new UsernamePasswordToken(username,password,tion1);
	        Subject subject = SecurityUtils.getSubject();
	        try {
	            subject.login(usernamePasswordToken);   //完成登录
	            User user=(User) subject.getPrincipal();
	            res.getSession().setAttribute("username", user);
	            return "y";
	        } catch(Exception e) {
	            return "n";//返回登录页面
	        }
	}
	@RequestMapping("a")
	@ResponseBody
	public String select(){
		
		return "asd";
	}
}
