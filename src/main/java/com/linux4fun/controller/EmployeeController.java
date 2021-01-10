package com.linux4fun.controller;


import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.Validator;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.linux4fun.entity.Employee;
import com.linux4fun.exception.BusinessException;

@Controller
public class EmployeeController {
		private static final Logger logger = LoggerFactory.getLogger(EmployeeController.class);
		
		private Map<Integer, Employee> emps = null;
		
		public EmployeeController() {
			emps = new HashMap<Integer, Employee>();
		}
		
		@Autowired
		@Qualifier("employeeValidator")
		private Validator validator;
		
		@InitBinder
		public void initBinder(WebDataBinder binder) {
			binder.setValidator(validator);
		}
		
		@ModelAttribute("employee")
		public Employee createEmployee() {
			return new Employee();
		}
		
		@GetMapping("/emp/save")
		public String saveEmployeePage(Model model) {
			return "empSave";
		}
		
		@PostMapping("/emp/save.do")
		public String saveEmployeeAction (@ModelAttribute("employee") @Validated Employee employee, 
				BindingResult bindingResult, Model model) {
			if (bindingResult.hasErrors()) {
				logger.info(bindingResult.getAllErrors().stream().map(s -> s.toString()).collect(Collectors.joining("、")));
//				throw new BusinessException("员工信息验证失败，请重新输入！");
				return "empSave";
			}
			logger.info("保存成功！");
			model.addAttribute("emp", employee);
			emps.put(employee.getId(), employee);
			return "empSaveSuccess";
		}

}
