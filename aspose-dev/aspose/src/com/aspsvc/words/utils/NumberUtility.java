package com.aspsvc.words.utils;

public class NumberUtility 
{
	
	public static int getSafeInt(String s,int alternate)
	{
		try
		{
			return Integer.parseInt(StringUtility.getSafeStr(s));
		}
		catch(Exception e)
		{
			return alternate;
		}
	}

}
