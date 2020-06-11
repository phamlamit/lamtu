package com.sam.arraylistdemo;

import java.util.ArrayList;
import java.util.List;

public class ArrayListAccessElementExample {
	
	public void acessElement() {
		System.out.println("accessElement() !!!!!");
		
		List<String> topCompanies = new ArrayList<>();
		System.out.println("Is the topCompanies list emtpy? : " + topCompanies.isEmpty());
		
		topCompanies.add("Google");
		topCompanies.add("Apple");
		topCompanies.add("Microsoft");
		topCompanies.add("Amazon");
		topCompanies.add("Facebook");
		
		System.out.println("Here are the top " + topCompanies.size() + " companies in the world");
		System.out.println(topCompanies);
		
		String bestCompany = topCompanies.get(0);
		String secondBestCompany = topCompanies.get(1);
		String lastCompany = topCompanies.get(topCompanies.size()-1);
		
		System.out.println("Best Company : " + bestCompany);
		System.out.println("Second best company : " + secondBestCompany);
		System.out.println("Last company in list : " + lastCompany);
		
		topCompanies.set(2, "Walmart");
		System.out.println("Modified top companies list : " + topCompanies);
	}

}