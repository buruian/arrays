package com.buruian.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

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

		System.out.println(unique);
	}

	public static void findElementTheBetterApproach(Integer[] biggestArray, Integer[] secondArray) {

		List<Integer> list = new ArrayList<Integer>(Arrays.asList(biggestArray));
		HashSet<Integer> set = new HashSet<Integer>(list);
		set.removeAll(Arrays.asList(secondArray));
		System.out.println(set);

	}

	public static void main(String[] ars) {

		Integer[] array1 = { 1, 8, 7, 6, 3, 4, 9 };
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

	}

}
