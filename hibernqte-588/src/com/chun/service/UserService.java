package com.chun.service;
import java.util.List;
import com.chun.dao.CustomerDAO;
import com.chun.po.Customer;
public class UserService {
	public boolean login(Customer loginUser) {
		String account=loginUser.getAccount();
		String password=loginUser.getPassword();
		String hql="from Customer as user where account='"+account+"'and password='"+password+"' ";
		CustomerDAO dao=new CustomerDAO();
		List list =dao.findByHql(hql);
		if(list.isEmpty())
			return false;
		else 
			return true;
		
	}

}
