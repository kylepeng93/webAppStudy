package com.linux4fun.validator;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import com.linux4fun.entity.AddressPojo;
import com.linux4fun.entity.PersonPojo;

public class PersonValidator implements Validator {
	
	private final Validator addressValidator;
	
	public PersonValidator(Validator addressValidator) {
		if (addressValidator == null ) {
			throw new IllegalArgumentException("地址验证器不能为空");
		}
		if (!addressValidator.supports(AddressPojo.class)) {
			throw new IllegalArgumentException("地址参数无效！");
		}
		this.addressValidator = addressValidator;
	}

	@Override
	public boolean supports(Class<?> clazz) {
		return PersonPojo.class.equals(clazz);
	}

	@Override
	public void validate(Object obj, Errors e) {
		ValidationUtils.rejectIfEmpty(e, "name", "name.empty");
		PersonPojo person = (PersonPojo) obj;
			if (person.getAge() < 0) {
				e.rejectValue("age", "年龄不能小于0");
			} else if (person.getAge() > 100) {
				e.rejectValue("age", "年龄太大");
			}
			
			try {
				e.pushNestedPath("address");
				ValidationUtils.invokeValidator(this.addressValidator, person.getAddress(), e);
			} finally {
				e.popNestedPath();
			}
			
	}
}
