package com.factory;

public class ObjectCreation 
{
	public Os getInstance(String s)
	{
		if(s.equals("open"))
			return new Android();
		else if(s.equals("close"))
			return  new IOS();
		else
		return  new Microsoft();
		
		
	}

}
