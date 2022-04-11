package com.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.demo.model.User;

@Controller
public class MainController {

	@GetMapping("")
	public String getLoggged(Model model)
	{
		User user=new User();
		model.addAttribute(user);
		return "login";
		
	}
	@PostMapping("connect")
	public String login(User user)
	{
		if(user.getLogin().equals("admin")&& user.getMdp().equals("password"))
		
		return "Profile";
		else
			return "erreur";
	}
	
	
}
