package com.spring;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class SecondController {

	@RequestMapping("/contact")
	public String showFrom()
	{
		return "Contact";
	}
	
	/*
	 * @RequestMapping(path="/processfrom",method = RequestMethod.POST) public
	 * String HandlFrom(HttpServletRequest req) { String email =
	 * req.getParameter("email"); System.out.println("User email is "+email);
	 * 
	 * return ""; }
	 */
	
	@RequestMapping(path="/processfrom",method = RequestMethod.POST)
	public String HandlFrom(
			@RequestParam("email") String email,
			@RequestParam("name") String name,
			@RequestParam("pass") String pass,
			Model model)
	{
		
		System.out.println("User Email"+email);
		System.out.println("User Email"+name);
		System.out.println("User Email"+pass);
		
		model.addAttribute("email", email);
		model.addAttribute("name", name);
		model.addAttribute("pass",pass);
		return "success";
	}
}
