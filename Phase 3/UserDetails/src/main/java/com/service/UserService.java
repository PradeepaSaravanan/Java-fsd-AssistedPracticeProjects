	package com.service;

	import java.util.List;

	import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.stereotype.Service;

	import com.bean.User;
	import com.dao.UserDao;

	@Service
	public class UserService {

		@Autowired
		UserDao userDao;
		
		public String storeUser(User user) {
			 if(userDao.storeUser(user)>0){
				return "User details stored successfully";
			}else {
				return "User details didn't store";
			}
		}
		
		public String updateUser(User user) {
			if(userDao.updateUser(user)>0) {
				return "success";
			}else {
				return "failure";
			}
		}
		
		
		public String searchUser(int id) {
			User p = userDao.searchUser(id);
			if(p==null) {
				return "failure";
			}else {
				return p.toString();
			}
		}
		
	}
