package com.shoocl.ywt.login.entity;
/**
 * 用户实体类
 * @author 禹文涛
 *
 */
public class User {
	private int id;
	private String uname;
	private String password;
	private String sex;
	private String ientitycard;
	private String datebirth;
	private P_jurtion jur;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getIentitycard() {
		return ientitycard;
	}
	public void setIentitycard(String ientitycard) {
		this.ientitycard = ientitycard;
	}
	public String getDatebirth() {
		return datebirth;
	}
	public void setDatebirth(String datebirth) {
		this.datebirth = datebirth;
	}
	public P_jurtion getJur() {
		return jur;
	}
	public void setJur(P_jurtion jur) {
		this.jur = jur;
	}
}
