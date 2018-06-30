package com.chun.action;

import com.chun.po.Customer;
import com.chun.service.UserService;

public class UserAction {
	private Customer loginUser;
	public Customer getLoginUser() {
		return loginUser;
	}
	public void setLoginUser(Customer loginUser) {
		this.loginUser=loginUser;
	}
	public String login() {
		UserService userServ=new UserService();
		if(userServ.login(loginUser)) {
			return "success";
		}
		else
			return "failed";
	}

}
