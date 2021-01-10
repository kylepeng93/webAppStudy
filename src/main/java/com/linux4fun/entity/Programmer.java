package com.linux4fun.entity;

public class Programmer extends PersonPojo {
	/**
	 * 编程语言
	 */
	private String languageSkill;
	
	/**
	 * 岗位
	 */
	private String career;
	
	/**
	 * 职级
	 */
	private String jobLevel;
	
	/**
	 * 薪水
	 */
	private Double salary;

	public String getLanguageSkill() {
		return languageSkill;
	}

	public void setLanguageSkill(String languageSkill) {
		this.languageSkill = languageSkill;
	}

	public String getCareer() {
		return career;
	}

	public void setCareer(String career) {
		this.career = career;
	}

	public String getJobLevel() {
		return jobLevel;
	}

	public void setJobLevel(String jobLevel) {
		this.jobLevel = jobLevel;
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}
}
