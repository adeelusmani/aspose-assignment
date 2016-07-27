package com.asposeclient.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class WelcomeController 
{
	
	
	@RequestMapping(value="/convert",method = RequestMethod.GET)
	 public String createteDocConvertPage() 
	 {
		 return "docConvert";

	 }
	
	@RequestMapping(value="/protect",method = RequestMethod.GET)
	 public String createProtectDocumentPage() 
	 {
		 return "docProtect";

	 }
	
	@RequestMapping(value="/getType",method = RequestMethod.GET)
	 public String getProtectionType() 
	 {
		 return "protectionType";

	 }
	
	 

}
