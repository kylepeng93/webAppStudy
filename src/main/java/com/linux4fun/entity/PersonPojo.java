package com.linux4fun.entity;

import com.linux4fun.enums.SexEnum;

/**
 * 人的信息pojo
 * @author pengkai
 *
 */
public class PersonPojo {
	
	private int id;
	
	private String name;
	
	private int age;
	
	private String email;
	
	private SexEnum sex;
	
	private AddressPojo address;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public SexEnum getSex() {
		return sex;
	}

	public void setSex(SexEnum sex) {
		this.sex = sex;
	}

	public AddressPojo getAddress() {
		return address;
	}

	public void setAddress(AddressPojo address) {
		this.address = address;
	}
	
}
