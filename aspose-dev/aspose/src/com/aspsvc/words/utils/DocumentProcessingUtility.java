package com.aspsvc.words.utils;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

import javax.servlet.http.HttpServletResponse;

import org.springframework.web.multipart.commons.CommonsMultipartFile;

import com.aspose.words.Document;
import com.aspose.words.ProtectionType;
import com.aspose.words.SaveFormat;

public class DocumentProcessingUtility 
{
	
	public static boolean fileAlreadyExistsOnServer(String fileName)
	{
		File f=new File(fileName);
		return f.exists() && !f.isDirectory();
	}
	
	
	
	public static void protectDocument(CommonsMultipartFile fileUpload,String fileName,
			String protectionType,String password) 
			throws IOException, Exception
	{
		// TODO Auto-generated method stub
		Document doc = new Document(fileUpload.getInputStream());
		//int protection=doc.getProtectionType();
		int proctectionTypeIntVal=ProtectionType.fromName(protectionType);
		doc.protect(proctectionTypeIntVal,password);
		ByteArrayOutputStream outStream = new ByteArrayOutputStream();
		// Save the document to stream.
		doc.save(outStream,SaveFormat.DOCX );
		
		
		// Convert the document to byte form.
		byte[] docBytes = outStream.toByteArray();
		File file = new File(fileName);

		FileOutputStream  fop = new FileOutputStream(file);
		fop.write(docBytes);
		fop.close();
		

		// The bytes are now ready to be stored/transmitted.

		// Now reverse the steps to load the bytes back into a document object.
		//ByteArrayInputStream inStream = new ByteArrayInputStream(docBytes);     
 
		//return inStream;
	}
		
	public static ByteArrayInputStream convertDocumentToRequiredStream(CommonsMultipartFile fileUpload, String format) 
			throws IOException, Exception
	{
		// TODO Auto-generated method stub
		Document doc = new Document(fileUpload.getInputStream());
		ByteArrayOutputStream outStream = new ByteArrayOutputStream();
		// Save the document to stream.
		doc.save(outStream,SaveFormat.fromName(format) );
		// Convert the document to byte form.
		byte[] docBytes = outStream.toByteArray();

		// The bytes are now ready to be stored/transmitted.

		// Now reverse the steps to load the bytes back into a document object.
		ByteArrayInputStream inStream = new ByteArrayInputStream(docBytes);     
 
		return inStream;
	}
	
	public static void downloadDocument(CommonsMultipartFile fileUpload,String format,
				ByteArrayInputStream inStream, HttpServletResponse response,String fileName) throws IOException,Exception
	{
		String mimeType ="application/"+format;
	
	    System.out.println("MIME type IS: " + mimeType);
		
	    // set content attributes for the response
	    response.setContentType(mimeType);
	   // response.setContentLength((int) inStream);
	
	    // set headers for the response
	    String headerKey = "Content-Disposition";
	    if(StringUtility.getSafeStr(fileName).equals(""))
	    {
	    	fileName=fileUpload.getOriginalFilename().substring(0,fileUpload.getOriginalFilename().indexOf('.'));
	    }
	    if(fileName.indexOf('.')>0)
	    {
	    	fileName=fileName.substring(0, fileName.indexOf('.'));
	    }
	    String headerValue = String.format("attachment; filename=\"%s\"",
	    		fileName+"."+format);
	    response.setHeader(headerKey, headerValue);
	
	    // get output stream of the response
	    OutputStream outStreamResp = response.getOutputStream();
	
	    byte[] buffer = new byte[AspSvcConstants.BUFFER_SIZE];//[ BUFFER_SIZE];
	    int bytesRead = -1;
	
	    // write bytes read from the input stream into the output stream
	    while ((bytesRead = inStream.read(buffer)) != -1) {
	    	outStreamResp.write(buffer, 0, bytesRead);
	    }
	
	    inStream.close();
	    outStreamResp.close();
	}
	
	////////////////////////////////////////////////////////////////////////////
	
	public static String appendDocExctensionToDocument(String fileName)
	{
		String arr[]=fileName.split("\\.");
		if(arr.length>0)
		{
			String extension=arr[arr.length-1].toUpperCase();
			if(!extension.equals("DOC")&& !extension.equals("DOCX"))
			{
				
				fileName=fileName+".DOCX";
				
			}
		}
		return fileName;
	}

	
	
}	
	
