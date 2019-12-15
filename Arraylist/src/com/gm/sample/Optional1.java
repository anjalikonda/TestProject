package com.gm.sample;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Optional1 {

	public static void main(String[] args) 
	{
		List<String>fruitnames =null;// Arrays.asList("BANANA"," ","MANGO"," ","GRAPE","PEAR","ORANGE");
		Optional<List<String>>listOptional=Optional.ofNullable(fruitnames);
		
		if(listOptional.isPresent())
			System.out.println("presented");
		else
			System.out.println("not presented");
		
		//to get the list size
		int size=listOptional.map(List::size).orElse(0);
		System.out.println(size);
		//print from the list
		listOptional.get().forEach(fnames->System.out.println(fnames));
		
		//how to sum a list of integers with streams.
		List<Integer>integers=Arrays.asList(2,5,6,7);
		Optional<List<Integer>>listOptional2=Optional.ofNullable(integers);
		//System.out.println(listOptional2.get().stream().reduce(0, (a, b) -> a+b));
		
		System.out.println(listOptional2.get().stream().reduce(0, (a,b)->a+b));
			
		
		
		
		
		}
		
		

	}


