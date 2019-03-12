package com.shoocl.utis.shiro;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.springframework.beans.factory.annotation.Autowired;

import com.shoocl.ywt.login.entity.P_authority;
import com.shoocl.ywt.login.entity.P_jaTable;
import com.shoocl.ywt.login.entity.P_jurtion;
import com.shoocl.ywt.login.entity.User;
import com.shoocl.ywt.login.seriver.userSeriver;

public class AuthRealm extends AuthorizingRealm{
    @Autowired
    private userSeriver userService;

	@Override
	protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principals) {
		System.out.println("--------------------------------");
		 User user=(User) principals.fromRealm(this.getClass().getName()).iterator().next();//获取session中的用户
	        List<String> roles1=new ArrayList<String>();
	        List<String> auth=new ArrayList<String>();
	        P_jurtion jur = user.getJur();
	        //判断权限不为空
	        if(jur!=null && !jur.equals("")) {
	                int pid = jur.getPid();
	                System.out.println(jur.getPname());
	                roles1.add(jur.getPname());
	                List<String> list= userService.jurisdiction(pid);
	                for (String p_jaTable : list) {
							auth.add(p_jaTable);
					}
	            }
	        SimpleAuthorizationInfo info=new SimpleAuthorizationInfo();
	        info.addRoles(roles1);//设置角色权限
	        info.addRoles(auth);//设置角色权限下的小细节
	        return info;

	}
	//认证
	@Override
	protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {
	    UsernamePasswordToken utoken=(UsernamePasswordToken) token;//获取用户输入的token
	    String username = utoken.getUsername();
	    //获取用户表所有信息
	    User user = userService.query(username);
	    return new SimpleAuthenticationInfo(user, user.getPassword(),this.getClass().getName());//放入shiro.调用CredentialsMatcher
	}

}