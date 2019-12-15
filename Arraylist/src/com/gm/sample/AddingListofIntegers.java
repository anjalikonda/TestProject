package com.gm.sample;

import java.util.ArrayList;

public class AddingListofIntegers {

	public static void main(String[] args)
	{
		ArrayList<Integer>aList=new ArrayList<Integer>(10);
		
		  
		
		  for (int i=1;i<=10;i++) 
		  { 
			  aList.add(i); 
		      //System.out.println(aList.get(i-1));
		  }
		  
		  System.out.println(aList);
		 
	}

}
