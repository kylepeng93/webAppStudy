package com.linux4fun.controller;

import java.util.HashMap;
import java.util.Map;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.Validator;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.PostMapping;

import com.linux4fun.entity.Customer;
import com.linux4fun.exception.BusinessException;

@Controller
public class CustomerController {

	private static final Logger logger = LoggerFactory.getLogger(CustomerController.class);
	
	private Map<String, Customer> customers = null;
	
	public CustomerController(){
		customers = new HashMap<String, Customer>();
	}
	
	@GetMapping("/cust/save")
	public String saveCustomerPage(Model model) {
		logger.info("Returning custSave.jsp page");
		model.addAttribute("customer", new Customer());
		return "custSave";
	}
	
	/**
	 * 保存客户信息
	 * @param customer
	 * @param bindResult
	 * @param model
	 * @return 如果验证通过，则跳转到保存成功的页面，否则，抛出异常
	 */
	@PostMapping("/cust/save.do")
	public String saveCustomerAction(@Valid Customer customer, BindingResult bindResult, Model model) {
		if (bindResult.hasErrors()) {
//			throw new BusinessException("客户信息验证失败，请重新输入");
			return "custSave";
		}
		logger.info("客户信息保存成功！");
		model.addAttribute("customer", customer);
		customers.put(customer.getEmail(), customer);
		return "custSaveSuccess";
	}
}
