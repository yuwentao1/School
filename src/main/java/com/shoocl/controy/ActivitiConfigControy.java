package com.shoocl.controy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.shoocl.utis.activity.ActivitiConfig;

@Controller
public class ActivitiConfigControy {

	@Autowired
	private ActivitiConfig act;
	
	@RequestMapping("activiti")
	@ResponseBody
	public String addact(){
		String name= act.Automatic();
		System.out.println(name);
		return "成功";
	}
}
