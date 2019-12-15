package com.gm.sample;

import java.util.Arrays;
import java.util.List;

public class Optional {

	public static void main(String[] args) {
		List<String> companyNames= Arrays.asList("paypal","oracle", " ","mocrosoft"," ","apple");
		java.util.Optional<List<String>> listOptional=java.util.Optional.ofNullable(companyNames);
		
		if (listOptional.isPresent()) {
			System.out.println("Presented");
		} else {
			System.out.println("not present");
		}
		
		//to get list size
		int size= listOptional.map(List::size).orElse(0);
		System.out.println(size);
		
		//print from list
		listOptional.get().forEach(companyName -> System.out.println(companyName));
		
		java.util.Optional<List<Integer>> numsOptional = java.util.Optional.ofNullable(Arrays.asList(new Integer("5"), 7 , 8, 9));
		
		System.out.println(numsOptional.get().stream().reduce(0, (a, b) -> a+b));

	}

	
	}


