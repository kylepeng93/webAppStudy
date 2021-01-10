package com.linux4fun.validator;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import com.linux4fun.entity.Employee;

public class EmployeeFormValidator implements Validator {

	@Override
	public boolean supports(Class<?> clazz) {
		// 验证是否是Employee的实例对象
		return Employee.class.equals(clazz);
	}

	@Override
	public void validate(Object target, Errors errors) {
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "id", "id.required");
		Employee employee = (Employee) target;
		
		if (employee.getId() <= 0) {
			errors.rejectValue("id", "negativeValue", new Object[] {"'id'"}, "id必须大于0");
		}
		// 验证名字为必须项
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "name", "name.required");
		// 验证角色为必须项
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "role", "role.required");
	}
	

}
