package com.shoocl.ywt.login.entity;

import java.util.List;

public class P_jaTable {
	private int id;
	private List<P_jurtion> listj;
	private List<P_authority> lista;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public List<P_jurtion> getListj() {
		return listj;
	}
	public void setListj(List<P_jurtion> listj) {
		this.listj = listj;
	}
	public List<P_authority> getLista() {
		return lista;
	}
	public void setLista(List<P_authority> lista) {
		this.lista = lista;
	}

}
