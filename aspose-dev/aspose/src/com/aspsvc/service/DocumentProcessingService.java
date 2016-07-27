package com.aspsvc.service;

import java.io.ByteArrayInputStream;
import java.io.IOException;

import org.springframework.web.multipart.commons.CommonsMultipartFile;



public interface DocumentProcessingService 
{
	
	public ByteArrayInputStream convertDocumentToRequiredStream(CommonsMultipartFile fileUpload,
			String format)throws IOException,IllegalArgumentException, Exception;
	
	
	
	public void protectDocument(CommonsMultipartFile fileUpload,String protectionType,
			String password,String name)throws IOException,IllegalArgumentException, Exception;
	
	public String getProtectionType(String fileName)throws IOException,IllegalArgumentException, Exception;

}
