package com.chun.po;

import java.io.Serializable;

public class Customer implements Serializable {
	private static final long serialVersionUID = 1L;
	private int customerid;
	private String account;
	private String password;
	private String name;
	private String sex;
	private String phone;
	public Customer() {
		
	}
	public Customer (int customerid) {
		this.customerid=customerid;
		
	}
	public Customer(int customerid,String account,String name,String password,String sex,String phone ) {
		this.customerid=customerid;
		this.account=account;
		this.name=name;
		this.sex=sex;
		this.password=password;
		this.phone=phone;
	}
	public int getCustomerid() {
		return customerid;
	}
	public void setCustomerid(int customerid) {
		this.customerid = customerid;
	}
	public String getAccount() {
		return account;
	}
	public void setAccount(String account) {
		this.account = account;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}

}
