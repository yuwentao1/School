package com.shoocl.ywt;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class login {
	@RequestMapping("login")
	@ResponseBody
	public String login() {
		return "傻逼";
	}
}
