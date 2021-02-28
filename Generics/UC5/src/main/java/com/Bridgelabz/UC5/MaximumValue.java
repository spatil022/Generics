package com.Bridgelabz.UC5;

public class MaximumValue<T extends Comparable<T>> {
	public static <T extends Comparable<T>> T testMaximum(T... value) {
		T max = value[0];
		for(T val : value) {
			if (val.compareTo(max) > 0)
				max = val;
		}
		return max;
	}
	public static <T> void printMaximum(T max) {
		System.out.println("Maximum value: "+max);
	}
}