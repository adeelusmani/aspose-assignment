package com.aspsvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class WelcomeController 
{
	@RequestMapping(value="/index",method = RequestMethod.GET)
	 public String loginPage() 
	 {
		
		 return "doUpload2";
//		 ModelAndView mv = new ModelAndView("login");
//		 mv.addObject("users", new AppUsersWrapper());
		 //return mv;//new ModelAndView("login", "users", new AppUsersWrapper());//message);
		 
	 }
	 
	
	@RequestMapping(value="/test",method = RequestMethod.GET)
	 public String createteTestPage() 
	 {
		 return "test";
//		 ModelAndView mv = new ModelAndView("login");
//		 mv.addObject("users", new AppUsersWrapper());
		 //return mv;//new ModelAndView("login", "users", new AppUsersWrapper());//message);
		 
	 }
	
	 

}
