package com.gm.sample;

import java.util.Optional;

public class UsingOptional1 {

	public static void main(String[] args) {
		String [] str = new String[5];
		str [2]= "Java classes are going slowly";
		
		Optional<String>value =Optional.of(str[2]);
		System.out.println(value.get());
		
		System.out.println(value.isPresent());
		
		 

	}

}
