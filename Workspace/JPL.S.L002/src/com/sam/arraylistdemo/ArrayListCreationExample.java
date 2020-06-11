package com.sam.arraylistdemo;

import java.util.ArrayList;
import java.util.List;

public class ArrayListCreationExample {
	public void createArrayList() {
		System.out.println("createArrayList() !!!");

		List<String> animals = new ArrayList<>();
		animals.add("Lion");
		animals.add("Tiger");
		animals.add("Cat");
		animals.add("Dog");

		System.out.println(animals);

		animals.add(2, "Elephant");
		System.out.println(animals);
	}

	public void createArrayListFromCollection() {
		List<Integer> firstFivePrimeNumbers = new ArrayList<>();
		firstFivePrimeNumbers.add(2);
		firstFivePrimeNumbers.add(3);
		firstFivePrimeNumbers.add(5);
		firstFivePrimeNumbers.add(7);
		firstFivePrimeNumbers.add(11);

		List<Integer> firstTenPrimeNumbers = new ArrayList<>(firstFivePrimeNumbers);

		List<Integer> nextFivePrimeNumbers = new ArrayList<>();
		nextFivePrimeNumbers.add(13);
		nextFivePrimeNumbers.add(17);
		nextFivePrimeNumbers.add(19);
		nextFivePrimeNumbers.add(23);
		nextFivePrimeNumbers.add(29);

		firstTenPrimeNumbers.addAll(nextFivePrimeNumbers);
		System.out.println(firstTenPrimeNumbers);

	}
}
