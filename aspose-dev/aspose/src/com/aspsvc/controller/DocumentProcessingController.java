package com.aspsvc.controller;


import java.io.ByteArrayInputStream;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

import com.aspsvc.words.utils.*;
import com.aspose.words.ProtectionType;
import com.aspsvc.service.DocumentProcessingService;
import com.aspsvc.utils.ValueWrapper;

@RestController
public class DocumentProcessingController 
{
	@Autowired
	DocumentProcessingService documentProcessingService=null;
	
	@RequestMapping(value = "/words/{name}/protection", method = RequestMethod.GET, 
			produces = "application/json")
    public ValueWrapper getProtectionType(@PathVariable String name, 
    		HttpServletResponse response) throws Exception 
	{
		String protectionStr = this.documentProcessingService.getProtectionType(name);		
		return new ValueWrapper("Protection Type",protectionStr);
    }  

	@RequestMapping(value = "/words/{name}/protection", method = RequestMethod.POST)
    public ValueWrapper protectDocument(@PathVariable String name, 
    		@RequestParam CommonsMultipartFile fileUpload,
    		@RequestParam String protectionType,String password , HttpServletResponse response) throws Exception 
	{
		//String path=System.getProperty("catalina.home");
		//String uri=context.getRealPath();
		 this.documentProcessingService.protectDocument(fileUpload,
				protectionType, password,name);
		
		//DocumentProcessingUtility.downloadDocument(fileUpload, "DOCX", inStream, response,name);
				
		System.out.println("Saving file: " + fileUpload.getOriginalFilename());
		
        return new ValueWrapper("1","Document uploaded successfully.");
    }  
	
	@RequestMapping(value = "/words/convert", method = RequestMethod.PUT)
    public ValueWrapper handleFileUpload( @RequestParam CommonsMultipartFile fileUpload,@RequestParam String cmbFormat ,
           HttpServletResponse response) throws Exception 
	{
		ByteArrayInputStream inStream = this.documentProcessingService.convertDocumentToRequiredStream(fileUpload, cmbFormat);
		
		DocumentProcessingUtility.downloadDocument(fileUpload, cmbFormat, inStream, response,"");
				
		System.out.println("Saving file: " + fileUpload.getOriginalFilename());
        return new ValueWrapper("1","Success");//"Success";
    }  
	
	
	
}
