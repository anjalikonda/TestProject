package com.gm.sample;

import java.util.ArrayList;

public class ArrylistExample {

	public static void main(String[] args) 
	{
		ArrayList<String>namesList=new ArrayList<String>();
		namesList.add("Alex");
		namesList.add("Anjali");
		namesList.add("Nandu");
		namesList.add("Ajay");
		namesList.add("Alex");
		
		
		System.out.println(namesList);
		
		//namesList.remove(0);
		//System.out.println(namesList);
		
		//namesList.remove("Ajay");
		//System.out.println(namesList);
		
		//namesList.removeAll(namesList);
		//System.out.println(namesList);
		
		//namesList.removeIf(name-> name.contentEquals("Alex"));
		//System.out.println(namesList);
		
		namesList.remove("Alex");
		System.out.println(namesList);
		
		
		
		
		
		

	}

}
