package com.linux4fun.entity;

/**
 * 家庭地址POJO
 * @author pengkai
 */
public class AddressPojo {
	
	/**
	 * 国家
	 */
	private String country;
	
	/**
	 * 省份
	 */
	private String province;
	
	/**
	 * 城市
	 */
	private String city;
	
	/**
	 * 街道 
	 */
	private String street;
	
	/**
	 * 小区
	 */
	private String department;
	
	/**
	 * 门牌号
	 */
	private String 	houseNo;

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getProvince() {
		return province;
	}

	public void setProvince(String province) {
		this.province = province;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getHouseNo() {
		return houseNo;
	}

	public void setHouseNumber(String houseNo) {
		this.houseNo= houseNo;
	}

	

}
