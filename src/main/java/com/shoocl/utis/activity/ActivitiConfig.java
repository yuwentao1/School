package com.shoocl.utis.activity;

import org.activiti.engine.ProcessEngine;
import org.activiti.engine.ProcessEngineConfiguration;
import org.springframework.context.annotation.Configuration;

/**
 * activit自动生成
 * @author 禹文涛
 *
 */
@Configuration
public class ActivitiConfig {
	//读取activiti.cfg.xml生成ProcessEngineConfiguration对象
	private ProcessEngineConfiguration processEngineConfiguration = ProcessEngineConfiguration.createProcessEngineConfigurationFromResource("activiti.cfg.xml");

	/**
	 * 创建生成表
	 * @return 名字
	 */
	public String Automatic(){
		ProcessEngine processEngine = processEngineConfiguration.buildProcessEngine();
		System.out.println("自动生成25张表：");
		return processEngine.getName();
	}
}
