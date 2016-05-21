package com.zmx.service;

import java.util.List;

import com.zmx.domain.THome;
import com.zmx.domain.TUser;

public interface UserService {

	void saveUser(TUser user);
	
	void saveHome(THome home);
	
	void saveHomes(List<THome> lst);
	
	List find();
}
