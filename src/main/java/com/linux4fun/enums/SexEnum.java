package com.linux4fun.enums;


public enum SexEnum {
	MAN("1", "男人"),
	WOMAN("2","女人");
	
	private String type;
	
	private String name;
	
	SexEnum(String type, String name) {
		this.type = type;
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public String getName() {
		return name;
	}

}
