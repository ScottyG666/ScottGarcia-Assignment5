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
		System.out.println(dynamicStringArray.get(113));

		// Instantiating an Integer custom array for testing purposes
		CustomArrayList<Integer> dynamicIntegerArray = new CustomArrayList<>();
		// adding the first set of Integers to ensure proper placement and growth
		addingIntegersToADynamicArray(dynamicIntegerArray);
		// adding second set of Integers for further testing
		addAdditionalIntegers(dynamicIntegerArray);
		System.out.println(dynamicIntegerArray.getSize());
		System.out.println(dynamicIntegerArray.get(76));

	}

	private static void addAdditionalIntegers(CustomArrayList<Integer> iCUP) {
		for (Integer i = 1; i < 120; i += 1) {
			iCUP.add(i);
		}
	}

	private static void addingIntegersToADynamicArray(CustomArrayList<Integer> iCUP) {
		for (Integer i = 1; i < 32; i += 1) {
			iCUP.add(i);
		}
	}

	private static void addingLoremIpsumToArray(CustomArrayList<String> items) {
		String[] loremIpsum = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Porttitor massa id neque aliquam vestibulum morbi blandit. Nam aliquam sem et tortor consequat id porta nibh. Ut placerat orci nulla pellentesque dignissim enim sit amet. Aenean sed adipiscing diam donec adipiscing tristique risus nec feugiat. Morbi tincidunt augue interdum velit euismod in. Et malesuada fames ac turpis egestas. Ac auctor augue mauris augue. Et tortor consequat id porta nibh venenatis cras. Gravida arcu ac tortor dignissim. Mauris nunc congue nisi vitae suscipit. Ullamcorper sit amet risus nullam eget felis eget nunc lobortis. Eu ultrices vitae auctor eu augue ut lectus arcu bibendum."
				.split(" ");
		for (Integer i = 0; i < loremIpsum.length - 1; i += 1) {
			items.add(loremIpsum[i]);
		}
	}

	private static void addingStringElementsToArray(CustomArrayList<String> items) {
		items.add("adding");
		items.add("the");
		items.add("11th");
		items.add("element");
		items.add("the");
		items.add("backing");
		items.add("Object");
		items.add("array");
		items.add("will");
		items.add("grow");
		items.add("from");
		items.add("10");
		items.add("to");
		items.add("20");
		items.add("elements");
		items.add("in");
		items.add("size");
		items.add("When");
		items.add("adding");
		items.add("the");
		items.add("21st");
		items.add("element");
		items.add("it");
		items.add("should");
		items.add("grow");

	}

}
