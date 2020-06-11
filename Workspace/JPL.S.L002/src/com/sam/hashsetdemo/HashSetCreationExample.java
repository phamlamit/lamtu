package com.sam.hashsetdemo;

import java.util.HashSet;
import java.util.Set;

public class HashSetCreationExample {
	public void createHashSet() {
		System.out.println("CreateHashSet() !!!!");
		
		Set<String> brands = new HashSet<>();
		
		brands.add("Wilson");
		brands.add("Nike");
		brands.add("Volve");
		brands.add("IBM");
		brands.add("IBM");
		
		int nOfElements = brands.size();
		
		System.out.format("The set contains %d elements " , nOfElements);
		System.out.println(brands);
	}

}
