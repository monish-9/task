package com.phone;

import com.factory.ObjectCreation;
import com.factory.Os;

public class FactoryMain {

	public static void main(String[] args)
	{
		ObjectCreation oc=new ObjectCreation();
		Os o=oc.getInstance("close");
		o.spec();
	}

}
