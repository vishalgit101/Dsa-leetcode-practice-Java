package exc02ArraysEasy;

import java.util.Arrays;

public class Ex03RemoveDuplicateFromSortedArray {
	public static void main(String[] args) {
		// remove duplicates in place
		int[] arr = {0,0,1,1,1,2,2,3,3,4};
		removeDuplicate(arr);
		System.out.println(Arrays.toString(arr));
		
		System.out.println();
		
		int[] arr2 = {0,0,1,1,1,2,2,3,3,4};
		removeDuplicateSorted(arr2);
		System.out.println(Arrays.toString(arr2));
		
		int[] arr3 = {1,2};
		removeDuplicate(arr3);
		System.out.println(Arrays.toString(arr3));
		
		int[] arr4 = {1,2};
		removeDuplicateSorted(arr4);
		System.out.println(Arrays.toString(arr4));
	}
	
	// for unsorted arrays
	public static void removeDuplicate(int[] arr) {
		
		for(int i = 0; i < arr.length; i++) {
			
			for(int j = 1 + i; j < arr.length; j++) {
				
				if(arr[i] == arr[j]) {
					arr[j] = Integer.MIN_VALUE;
				}
			}
		}
		
		shift(arr);
	}
	
	public static void shift(int[] arr) {
		int i = 0;
		for(int j = 0; j< arr.length; j++) {
			if(arr[j] != Integer.MIN_VALUE) {
				arr[i] = arr[j];
				i++;
			}
		}
		System.out.println(i);
		//int unique = i;
		
	}
	
	// for already sorted arrays-- use two pointers
	// {0,0,1,1,1,2,2,3,3,4};
	public static void removeDuplicateSorted(int[] arr) {
		int i = 0;
		
		for(int j = 1; j< arr.length -1; j++) {
			if(arr[j] == arr[i]) {
				arr[j] = Integer.MIN_VALUE;
			}else {
				i=j ;
			}
		}
		
		shift(arr);
	}
}
