package com.zmx.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.zmx.domain.TUser;

public interface UserDao extends CrudRepository<TUser,Integer>{

	@Query("select u from TUser u")
	List findA();
}
