package com.sam.arraylistdemo;

public class TestArrayListDemoclass {
	public static void main(String[] args) {
		ArrayListCreationExample elementCreation = new ArrayListCreationExample();
		ArrayListAccessElementExample elementAccess = new ArrayListAccessElementExample();
		ArrayListRemoveElementExample elementRemove = new ArrayListRemoveElementExample();
		elementCreation.createArrayList();
		elementAccess.acessElement();
		elementRemove.removeElements();
	}

}
