package exc01Sorting;

import java.util.Arrays;

public class MergeSort {

	public static void main(String[] args) {
		
		int[] arr = {5, 8, 1, 3, 9, 2, 6, 4};
		mergeSort(arr, 0, arr.length - 1);
		System.out.println(Arrays.toString(arr));
		
	}
	
	// using recursion
	// Merge Sort... takes arr, start, end
	public static void mergeSort(int[] arr, int start, int end) {
		
		if(start < end) { //base case
			int mid = (start + end)/2;
			
			mergeSort(arr, start, mid); // left halves...indefinitely
			mergeSort(arr, mid + 1, end); // right halves...indefinitely
			
			//
			merge(arr, start, end, mid);
			
		}
		
	}
	
	// Merge-- is for merging sub arrays... takes:
	public static void merge(int[] arr, int start, int end, int mid) {
		
		// size of arrays...
		int n1 = mid - start + 1;
		int n2 = end - mid;
		
		
		int[] left = new int[n1];
		int[] right = new int[n2];
		
		// elements needs to be copied
		int count = 0;
		for(int i = 0; i< left.length; i++) {
			left[i] = arr[start + count];
			count++;
		}
		for(int j = 0; j < right.length; j++) {
			right[j] = arr[start + count];
			count++;
		}
		
		// comparing the elements and replacing
		int i = 0; int j = 0; int k = start;
		
		while(i < n1 && j < n2 ) {
			
			if(left[i] <= right[j]) {
				arr[k] = left[i];
				i++;
			}else {
				arr[k] = right[j];
				j++;
			}
			
			k++;
			
		}
		
		while(i < n1) {
			arr[k] = left[i];
			i++;
			k++;
		}
		
		while(j < n2) {
			arr[k] = right[j];
			j++;
			k++;
		}
		
	}

}
