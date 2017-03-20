package com.xlinyu.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xlinyu.model.User;
import com.xlinyu.service.IUserService;

@Controller
@RequestMapping("/users")
public class UserController {

	@Resource
	private IUserService userService;
	
	@GetMapping(value = {"", "/"})
	public String users(){
		List<User> users = userService.getAllUser();
		System.out.println(users.size());
		for(User u:users){
			System.out.println(u);
		}
		return "users";
	}
}
