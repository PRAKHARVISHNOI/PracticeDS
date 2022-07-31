package com.prakhar.subArrayWithGivenSum;

import java.util.ArrayList;

public class SubArrayWithGivenSum {

	public static void main(String[] args) {
	        int arr[] = { 15, 2, 4, 8, 9, 5, 10, 23 };
	        int n = arr.length;
	        int sum = 23;
	      System.out.println(SubArrayWithGivenSum.SubarraySum(arr, n, sum));

	}

	static ArrayList<Integer> SubarraySum(int[] arr, int n, int s) {

		ArrayList<Integer> result = null;

		for (int i = 0; i < arr.length; i++) {
			int sum = 0;
			result = new ArrayList<>();
			for (int j = i; j < arr.length; j++) {
				sum = sum + arr[j];
				result.add(arr[j]);
				if (sum > s) {
					break;
				} else if (sum == s) {
					return result;
				}
			}

		}

		return null;

	}

}
