package com.shoocl.ywt.login.seriver;

import java.util.List;

import com.shoocl.ywt.login.entity.P_jaTable;
import com.shoocl.ywt.login.entity.User;

public interface userSeriver {
	/**
	 * 查询用户
	 * @return 放回用户
	 */
	public User query(String username);
	
	/**
	 * 查询权限
	 * @return 权限名字细民
	 */
	public List<String> jurisdiction(int pa_id);
}
