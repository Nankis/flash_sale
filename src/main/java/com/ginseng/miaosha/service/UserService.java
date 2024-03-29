package com.ginseng.miaosha.service;

import com.ginseng.miaosha.dao.UserDao;
import com.ginseng.miaosha.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UserService {
	@Autowired
	UserDao userDao;
	public User getById(int id) {
		return userDao.getById(id);
	}
	
	//使用事务
	@Transactional
	public boolean tx() {
		User user=new User();
		user.setId(3);
		user.setName("ginseng");
		userDao.insert(user);
		
		User user1=new User();
		user1.setId(1);
		user1.setName("ginseng2");
		userDao.insert(user1);			//这里出问题则回滚
		
		return true;
	}
}
