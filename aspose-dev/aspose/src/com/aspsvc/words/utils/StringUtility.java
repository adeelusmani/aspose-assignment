package com.aspsvc.words.utils;

public class StringUtility 
{
	public static String getSafeStr(String s)
	{
		try
		{
			if(s!=null)
				return s.trim();
			return "";
		}
		catch(Exception e)
		{
			return "";
		}
	}

}
