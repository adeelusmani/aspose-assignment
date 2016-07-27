package com.aspsvc.service;

import java.io.ByteArrayInputStream;
import java.io.IOException;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

import com.aspose.words.Document;
import com.aspose.words.ProtectionType;
import com.aspsvc.words.utils.DocumentProcessingUtility;

@Service("documentProcessingService")
public class DocumentProcessingServiceImpl implements DocumentProcessingService 
{
	@Value("${save_path}")
    private String documentRootPath;

	@Override
	public ByteArrayInputStream convertDocumentToRequiredStream(CommonsMultipartFile fileUpload, String format) 
			throws IOException, Exception,IllegalArgumentException
	{
		
		
		String contents=fileUpload.getContentType();
		if(!contents.equalsIgnoreCase("application/msword")&& 
				!contents.equalsIgnoreCase("application/vnd.openxmlformats-officedocument.wordprocessingml.document"))
			throw new IllegalArgumentException("Please select word documents with .doc or .docx extension");
		return DocumentProcessingUtility.convertDocumentToRequiredStream(fileUpload, format);
	}

	
	@Override
	public String getProtectionType(String fileName)
			throws IOException, IllegalArgumentException, Exception {
		// TODO Auto-generated method stub
		fileName=DocumentProcessingUtility.appendDocExctensionToDocument(fileName);
		fileName=documentRootPath+"\\"+ fileName;
		if(!DocumentProcessingUtility.fileAlreadyExistsOnServer(fileName))
		{
			throw new IllegalArgumentException("No document exists with specified name.");
		}
		Document doc = new Document(fileName);
		int protection=doc.getProtectionType();
		return ProtectionType.toString(protection);
		
	}

	@Override
	public void protectDocument(CommonsMultipartFile fileUpload, String protectionType, String password,
			String fileName) throws IOException, IllegalArgumentException, Exception {
		// TODO Auto-generated method stub
		fileName=DocumentProcessingUtility.appendDocExctensionToDocument(fileName);
		fileName=documentRootPath+"\\"+ fileName;
		if(DocumentProcessingUtility.fileAlreadyExistsOnServer(fileName))
		{
			throw new IllegalArgumentException("File with the specified name already exixtys on server. Please specify a different one.");
		}
		DocumentProcessingUtility.protectDocument(fileUpload, fileName, protectionType, password);
		
		
	}

}
