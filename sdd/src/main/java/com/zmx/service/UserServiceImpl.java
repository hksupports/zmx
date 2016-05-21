package com.zmx.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zmx.dao.HomeDao;
import com.zmx.dao.UserDao;
import com.zmx.domain.THome;
import com.zmx.domain.TUser;

@Service
@Transactional
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDao userDao;
	@Autowired
	private HomeDao homeDao;
	
	@Override
	public void saveUser(TUser user) {
		userDao.save(user);
	}

	@Override
	public void saveHome(THome home) {
		homeDao.save(home);
	}

	@Override
	public void saveHomes(List<THome> lst) {
		homeDao.save(lst);
	}

	@Override
	public List find() {
		return userDao.findA();
	}

}
