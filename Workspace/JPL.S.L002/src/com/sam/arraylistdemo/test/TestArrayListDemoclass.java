package com.sam.arraylistdemo.test;

import com.sam.arraylistdemo.ArrayListAccessElementExample;
import com.sam.arraylistdemo.ArrayListCreationExample;
import com.sam.arraylistdemo.ArrayListRemoveElementExample;

public class TestArrayListDemoclass {
	public static void main(String[] args) {
		ArrayListCreationExample elementCreation = new ArrayListCreationExample();
		ArrayListAccessElementExample elementAccess = new ArrayListAccessElementExample();
		ArrayListRemoveElementExample elementRemove = new ArrayListRemoveElementExample();
		//elementCreation.createArrayList();
		//elementCreation.createArrayListFromCollection();
		//elementAccess.acessElement();
		elementRemove.removeElements();
	}

}
