package com.springapp.mvc.controller;

import com.springapp.mvc.mapper.UserMapper;
import com.springapp.mvc.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/")
public class HelloController {
	@Autowired
	private UserMapper userDao;
	@RequestMapping(method = RequestMethod.GET)
	public String printWelcome(ModelMap model) {
		User user = userDao.findById(4);
		model.addAttribute("message", user.getName()+ "," + user.getPassword());
		return "hello";
	}
}