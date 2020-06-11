package com.sam.hashsetdemo.test;

import java.util.HashSet;
import java.util.Set;

import com.sam.hashsetdemo.HashSetCreationExample;
import com.sam.hashsetdemo.HashSetIterationExample;
import com.sam.hashsetdemo.HashSetRemoveElementExample;
import com.sam.hashsetdemo.HashSetRetrieveElementExample;

public class TestHashSetDemo {
	public static void main(String[] args) {
		HashSetCreationExample hashSetCreation = new HashSetCreationExample();
		HashSetRetrieveElementExample hashSetElements = new HashSetRetrieveElementExample();
		HashSetRemoveElementExample hashSetRemove = new HashSetRemoveElementExample();
		HashSetIterationExample hashSetIterator = new HashSetIterationExample();
		
		hashSetCreation.createHashSet();
		hashSetElements.retrieveElements();
		hashSetRemove.removeElemets();
		hashSetIterator.hashSetIterator();
		
	}

}
