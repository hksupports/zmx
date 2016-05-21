package com.zmx.domain;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="t_user")
public class TUser implements Serializable{

	private static final long serialVersionUID = 1L;
	private Integer id;
	private String username;
	private String sex;
	private Integer age;
	
	private Set<THome> homes;
	
	@OneToMany(
	   cascade=CascadeType.ALL,
	   fetch=FetchType.LAZY
	)
	@JoinColumn(name="id")
	public Set<THome> getHomes() {
		return homes;
	}
	
	public void setHomes(Set<THome> homes) {
		this.homes = homes;
	}
	@Id
	@GeneratedValue
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	
	
}
