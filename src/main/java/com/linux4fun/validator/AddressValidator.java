package com.linux4fun.validator;

import org.springframework.util.StringUtils;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import com.linux4fun.entity.AddressPojo;

public class AddressValidator implements Validator {

	@Override
	public boolean supports(Class<?> clazz) {
		return AddressPojo.class.equals(clazz);
	}

	@Override
	public void validate(Object obj, Errors e) {
		ValidationUtils.rejectIfEmpty(e, "country", "country.empty");
		AddressPojo address = (AddressPojo) obj;
		
		if (StringUtils.isEmpty(address.getProvince())) {
			e.rejectValue("province", "省份不能为空！");
		}
	}
	
}
