package com.gm.sample;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Optional2 {

	public static void main(String[] args) 
	{
		List<String>flowernames=Arrays.asList("jasmine", " ","rose"," lily","chrysanthimum");
		Optional<List<String>>listOptional=Optional.ofNullable(flowernames);
		if (listOptional.isPresent()) {
			System.out.println("presented");
			
		}
		else {
			System.out.println("not presented");
		}
		
		//get the list size
		int size= listOptional.map(List::size).orElse(0);
		System.out.println(size);
		//print the list
	listOptional.get().forEach(flowers->System.out.println(flowers));
	
	//adding list of integers by streams
	
	List<Integer>integers=Arrays.asList(5,7,8,9);
	Optional<List<Integer>>numOptional=Optional.ofNullable(integers);
	
	System.out.println(numOptional.get().stream().reduce(0,(a,b)->a+b));
	

	}

}
