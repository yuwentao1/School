package com.shoocl.ywt.login.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.shoocl.ywt.login.entity.P_jaTable;
import com.shoocl.ywt.login.entity.User;
/**
 * 用户查询
 * @author 禹文涛
 *
 */
public interface UserMapper {
	/**
	 * 查询用户
	 * @return 放回用户
	 */
	public User query(@Param("username")String username);
	
	public List<User> aa();
	
	/**
	 * 查询权限
	 * @return 权限名字细民
	 */
	public List<String> jurisdiction(@Param("pj_id")int pj_id);
}
