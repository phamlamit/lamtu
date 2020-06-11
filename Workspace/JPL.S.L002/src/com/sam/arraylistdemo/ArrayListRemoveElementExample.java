package com.sam.arraylistdemo;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class ArrayListRemoveElementExample {
	
	public void removeElements() {
		System.out.println("removeElements() !!!!");
		
		List<String> programLanguages = new ArrayList<>();
		programLanguages.add("C");
		programLanguages.add("C++");
		programLanguages.add("Java");
		programLanguages.add("Kotlin");
		programLanguages.add("Python");
		programLanguages.add("Perl");
		programLanguages.add("Ruby");
		
		System.out.println("Initial List : " + programLanguages);
		
		programLanguages.remove(5);
		System.out.println("After remove(5) : " + programLanguages);
		
		List<String> scriptingLanguages = new ArrayList<>();
		scriptingLanguages.add("Python");
		scriptingLanguages.add("Ruby");
		scriptingLanguages.add("Perl");
		
		programLanguages.removeAll(scriptingLanguages);
		System.out.println("After remove All(scriptingLanguages) : " + programLanguages);
		
		programLanguages.removeIf(new Predicate<String>() {
			@Override
			public boolean test(String s) {
				return s.startsWith("C");
			}
		});
		
		System.out.println("After removing all elements that start with \"C\": " + programLanguages);
		
		programLanguages.clear();
		System.out.println("After clear() : " + programLanguages);
	}

}
