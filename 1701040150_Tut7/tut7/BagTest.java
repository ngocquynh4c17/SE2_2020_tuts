package tut7;

import java.util.Arrays;

public class BagTest{

//	public BagTest() {
//		// TODO Auto-generated constructor stub
//	}
	
	public static void main(String[] args) {
		System.out.println("myBag with default size!");
		System.out.println();
		BagInterface<String> myBag = new ArrayBag<>();
		System.out.println("Current size: " + myBag.getCurrentSize());
		System.out.println("Empty?: " + myBag.isEmpty());
		System.out.println("Adding 4 Objects: ...");
		myBag.add("Quynhtn");
		myBag.add("Tuqt");
		myBag.add("Quangnc");
		myBag.add("Binhdh");
		System.out.println("Current myBag: " + Arrays.toString(myBag.toArray()));
		System.out.println("Current size: " + myBag.getCurrentSize());
		System.out.println("After adding: isEmpty? - " + myBag.isEmpty());
		System.out.println("Add 1 more existed object!");
		myBag.add("Quynhtn");
		System.out.println("Current myBag: " + Arrays.toString(myBag.toArray()));
		System.out.println("Current size: " + myBag.getCurrentSize());
		System.out.println("Frequency of Added Object: " + myBag.getFrequencyOf("Quynhtn"));
		System.out.println("Is myBag contain 'Quynhtn': "+myBag.contains("Quynhtn"));
		System.out.println("Is myBag contain 'Long': " + myBag.contains("Long"));
		System.out.println("Removing 1 exist object: 'Quangnc'!");
		myBag.remove("Quangnc");
		System.out.println("Current myBag: " + Arrays.toString(myBag.toArray()));
		System.out.println("Current size: " + myBag.getCurrentSize());
		myBag.remove();
		System.out.println("Removes one unspecified entry!");
		System.out.println("Current myBag: " + Arrays.toString(myBag.toArray()));
		System.out.println("Clear myBag!");
		myBag.clear();
		System.out.println("Current size: " + myBag.getCurrentSize());
		System.out.println("Empty?: " + myBag.isEmpty());
		
		System.out.println();
		System.out.println("-------------------------------------------------");
		System.out.println();
					
		System.out.println("newBag with custom size!");
		System.out.println();
		BagInterface<String> newBag = new ArrayBag<>(3);
		System.out.println("Current size: " + newBag.getCurrentSize());
		System.out.println("Empty?: " + newBag.isEmpty());
		System.out.println("Adding 3 Objects: ...");
		newBag.add("HANU");
		newBag.add("HUST");
		newBag.add("BKA");
		System.out.println("Current newBag: " + Arrays.toString(newBag.toArray()));
		System.out.println("Adding 1 more Objects: ...");
		newBag.add("FBT");
		System.out.println("Current newBag: " + Arrays.toString(newBag.toArray()));
		System.out.println("Current size: " + newBag.getCurrentSize());
		System.out.println("After adding: isEmpty? - " + newBag.isEmpty());
		System.out.println("Removing exist object: 'HANU'!");
		newBag.remove("HANU");
		System.out.println("Current newBag: " + Arrays.toString(newBag.toArray()));
		System.out.println("Current size: " + newBag.getCurrentSize());
		newBag.remove();
		System.out.println("Removes one unspecified entry!");
		System.out.println("Current newBag: " + Arrays.toString(newBag.toArray()));
		System.out.println("Add 1 more object! 'HANU'");
		newBag.add("HANU");
		System.out.println("Current newBag: " + Arrays.toString(newBag.toArray()));
		System.out.println("Current size: " + newBag.getCurrentSize());
		System.out.println("Frequency of Added Object: " + newBag.getFrequencyOf("HANU"));
		System.out.println("Is newBag contain 'FBT': "+newBag.contains("FBT"));
		System.out.println("Is newBag contain 'HANU': " + newBag.contains("HANU"));
		System.out.println("Clear newBag!");
		newBag.clear();
		System.out.println("Current size: " + newBag.getCurrentSize());
		System.out.println("Empty?: " + newBag.isEmpty());
	}

}
