package com.jk.controller;

import com.jk.model.User;
import com.jk.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("user")
public class UserController {

	@Autowired
	private UserService userService;

	@RequestMapping("querylist")
	@ResponseBody
	public List<User> userlist(){
		List<User> list=userService.queryUser();
		System.err.println(list);
		return list;
	}
}
