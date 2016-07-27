package com.aspsvc.advice;

//import org.springframework.cache.Cache.ValueWrapper;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.http.HttpStatus;

import com.aspose.words.UnsupportedFileFormatException;
import com.aspsvc.utils.ValueWrapper;

@ControllerAdvice	
public class AsposeAdviceController
{
	 @ExceptionHandler({IllegalArgumentException.class , UnsupportedFileFormatException.class})
	 @ResponseStatus(HttpStatus.BAD_REQUEST)
	 @ResponseBody
	 public ValueWrapper processRunTimeException(Exception ex)
	 {
		 ValueWrapper err = new ValueWrapper();
		 err.setId("102");
		 err.setValue(ex.getMessage());
		 return err;
	 }
}
