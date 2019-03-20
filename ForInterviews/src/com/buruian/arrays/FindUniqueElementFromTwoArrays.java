package com.buruian.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

public class FindUniqueElementFromTwoArrays {

	public static void findElementTheWorstApproach(Integer[] array1, Integer[] array2) {

		ArrayList<Integer> unique = new ArrayList<>();
		boolean dublicate;

		for (int i = 0; i < array1.length; i++) {
			dublicate = false;
			for (int j = 0; j < array2.length; j++) {
				if (array1[i] == array2[j]) {
					dublicate = true;
					break;
				}
			}
			if (!dublicate) {
				unique.add(array1[i]);
			}

		}

		System.out.println("First approach - searched element is : " +unique);
	}

	public static void findElementTheBetterApproach(Integer[] biggestArray, Integer[] secondArray) {

		List<Integer> list = new ArrayList<Integer>(Arrays.asList(biggestArray));
		HashSet<Integer> set = new HashSet<Integer>(list);
		set.removeAll(Arrays.asList(secondArray));
		System.out.println("Second approach - searched element is :" +set);

	}

	public static void findElementUsingMap(Integer[] biggestArray, Integer[] secondArray) {

		System.out.println("Third approach - searched element is : " + (sumOfTheArray(biggestArray)-sumOfTheArray(secondArray)));

	}

	public static Integer sumOfTheArray(Integer... array) {

		int sum = 0;

		for (Integer element : array) {
			sum += element;
		}

		return sum;
	}

	public static void main(String[] ars) {

		Integer[] array1 = { 1, 8, 7, 6, 3, 4, 9, 2, -11};
		Integer[] array2 = { 8, 7, 9, 4, 1, 6, 3, 2 };

		if (array1.length > array2.length) {
			findElementTheBetterApproach(array1, array2);
		} else {
			findElementTheBetterApproach(array2, array1);
		}

		if (array1.length > array2.length) {

			findElementTheWorstApproach(array1, array2);
		} else {

			findElementTheWorstApproach(array2, array1);
		}

		if (array1.length > array2.length) {

			findElementUsingMap(array1, array2);

		} else {

			findElementUsingMap(array2, array1);

		}

	}

}
