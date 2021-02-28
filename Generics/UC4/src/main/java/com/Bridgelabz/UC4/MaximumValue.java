package com.Bridgelabz.UC4;

public class MaximumValue<T extends Comparable<T>> {
	public static <T extends Comparable<T>> T testMaximum(T... value) {
		T max = value[0];
		for(T val : value) {
			if (val.compareTo(max) > 0)
				max = val;
		}
		return max;
	}
}
