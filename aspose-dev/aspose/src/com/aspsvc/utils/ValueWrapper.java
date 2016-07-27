package com.aspsvc.utils;

import javax.xml.bind.annotation.XmlRootElement;
import org.codehaus.jackson.map.annotate.JsonSerialize;



@XmlRootElement
@JsonSerialize(include=JsonSerialize.Inclusion.NON_NULL)
public class ValueWrapper 
{
	
	private String id;
	private String value;
	
	public ValueWrapper(){}
	
	public ValueWrapper(String idVal,String val)
	{
		id=idVal;
		value=val;
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}

}
