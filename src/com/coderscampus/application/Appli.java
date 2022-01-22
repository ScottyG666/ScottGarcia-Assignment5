package com.coderscampus.application;

import com.coderscampus.arraylist.CustomArrayList;

public class Appli {

	public static void main(String[] args) {
		// instantiating the array for Strings Specifically.
		CustomArrayList<String> dynamicStringArray = new CustomArrayList<>();
		// testing the dynamic array capabilities by adding 25 Strings
		addingStringElementsToArray(dynamicStringArray);
		// adding an additional 111 Strings to the dynamic array to further test it is
		// efficacious
		addingLoremIpsumToArray(dynamicStringArray);
		// Making sure the dynamic String array prints the correct size
		System.out.println(dynamicStringArray.getSize());
		// verifying the dynamic array will print the string at the index specified
		System.out.println(dynamicStringArray.get(9));

		/*
		 * +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
		 * visual divider between the implementation of the dynamic array for strings and Integers
		 */
		
		// Instantiating an Integer custom array for testing purposes
		CustomArrayList<Integer> dynamicIntegerArray = new CustomArrayList<>();
		// adding the first set of Integers to ensure proper placement and growth
		addingIntegersToADynamicArray(dynamicIntegerArray);
		// adding second set of Integers for further testing
		addAdditionalIntegers(dynamicIntegerArray);
		System.out.println(dynamicIntegerArray.getSize());
		System.out.println(dynamicIntegerArray.get(76));

	}

	private static void addAdditionalIntegers(CustomArrayList<Integer> arrayToAddIntegers) {
		for (Integer i = 1; i < 120; i += 1) {
			arrayToAddIntegers.add(i);
		}
	}

	private static void addingIntegersToADynamicArray(CustomArrayList<Integer> arrayToAddIntegers) {
		arrayToAddIntegers.add(1);
		arrayToAddIntegers.add(2);
		arrayToAddIntegers.add(3);
		arrayToAddIntegers.add(4);
		arrayToAddIntegers.add(5);
		arrayToAddIntegers.add(6);
		arrayToAddIntegers.add(7);
		arrayToAddIntegers.add(8);
		arrayToAddIntegers.add(9);
		arrayToAddIntegers.add(10);
		arrayToAddIntegers.add(11);
		arrayToAddIntegers.add(12);
		arrayToAddIntegers.add(13);
		arrayToAddIntegers.add(14);
		arrayToAddIntegers.add(15);
		arrayToAddIntegers.add(16);
		arrayToAddIntegers.add(17);
		arrayToAddIntegers.add(18);
		arrayToAddIntegers.add(19);
		arrayToAddIntegers.add(20);
		arrayToAddIntegers.add(21);
		arrayToAddIntegers.add(22);
		arrayToAddIntegers.add(23);
		arrayToAddIntegers.add(24);
		arrayToAddIntegers.add(25);
		arrayToAddIntegers.add(26);
		arrayToAddIntegers.add(27);
		arrayToAddIntegers.add(28);
		arrayToAddIntegers.add(29);
		arrayToAddIntegers.add(30);
		arrayToAddIntegers.add(31);
		arrayToAddIntegers.add(32);
		arrayToAddIntegers.add(33);
		arrayToAddIntegers.add(34);
		arrayToAddIntegers.add(35);
		arrayToAddIntegers.add(36);

	}

	private static void addingLoremIpsumToArray(CustomArrayList<String> arrayToAddString) {
		String[] loremIpsum = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Porttitor massa id neque aliquam vestibulum morbi blandit. Nam aliquam sem et tortor consequat id porta nibh. Ut placerat orci nulla pellentesque dignissim enim sit amet. Aenean sed adipiscing diam donec adipiscing tristique risus nec feugiat. Morbi tincidunt augue interdum velit euismod in. Et malesuada fames ac turpis egestas. Ac auctor augue mauris augue. Et tortor consequat id porta nibh venenatis cras. Gravida arcu ac tortor dignissim. Mauris nunc congue nisi vitae suscipit. Ullamcorper sit amet risus nullam eget felis eget nunc lobortis. Eu ultrices vitae auctor eu augue ut lectus arcu bibendum."
				.split(" ");
		for (Integer i = 0; i < loremIpsum.length - 1; i += 1) {
			arrayToAddString.add(loremIpsum[i]);
		}
	}

	private static void addingStringElementsToArray(CustomArrayList<String> arrayToAdString) {
		arrayToAdString.add("adding");
		arrayToAdString.add("the");
		arrayToAdString.add("11th");
		arrayToAdString.add("element");
		arrayToAdString.add("the");
		arrayToAdString.add("backing");
		arrayToAdString.add("Object");
		arrayToAdString.add("array");
		arrayToAdString.add("will");
		arrayToAdString.add("grow");
		arrayToAdString.add("from");
		arrayToAdString.add("10");
		arrayToAdString.add("to");
		arrayToAdString.add("20");
		arrayToAdString.add("elements");
		arrayToAdString.add("in");
		arrayToAdString.add("size");
		arrayToAdString.add("When");
		arrayToAdString.add("adding");
		arrayToAdString.add("the");
		arrayToAdString.add("21st");
		arrayToAdString.add("element");
		arrayToAdString.add("it");
		arrayToAdString.add("should");
		arrayToAdString.add("grow");

	}

}
