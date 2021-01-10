package com.linux4fun.validator;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import org.springframework.stereotype.Component;

import com.linux4fun.annotation.Phone;

public class PhoneValidator implements ConstraintValidator<Phone, String> {
	
	

	@Override
	public void initialize(Phone phone) {

	}

	@Override
	public boolean isValid(String phoneNo, ConstraintValidatorContext ctx) {
		if (phoneNo == null) {
			return false;
		}
		if (phoneNo.matches("\\d{11}")) return true;
		else return false;
	}

}
