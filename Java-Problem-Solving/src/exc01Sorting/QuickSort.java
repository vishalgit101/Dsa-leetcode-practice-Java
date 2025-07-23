package exc01Sorting;

import java.util.Arrays;

public class QuickSort {

	public static void main(String[] args) {
		
		int[] arr = {8,2,4,7,1,3,9,6,5};
		
		quickSort(arr, 0, arr.length - 1);
		
		System.out.println(Arrays.toString(arr));
		
		int[] arr2 = {5, 2, 8, 5, 1, 5, 4};
		
		quickSort(arr2, 0, arr2.length - 1);

		System.out.println(Arrays.toString(arr2));
		
		int[] arr3 = {4, 5, 4, 5, 4, 5, 4};

		quickSort(arr3, 0, arr3.length - 1);
		
		System.out.println(Arrays.toString(arr3));
	}
	
	public static void quickSort(int[] arr,int start, int end) {
		
		if(start < end) {
			int pivot = arr[end];
			
			int i = start - 1;
			int j = start;
			
			while(j <= end) {
				int temp = 0;
				if(arr[j] <= pivot) {
					i++;
					temp = arr[j];
					arr[j] = arr[i];
					arr[i] = temp;
					j++;
				}else {
					j++;
				}
				
			}
			
			// put pivot at place of i after incrementing i++;
			
		 	/*i++;
	        int temp = arr[i];
	        arr[i] = arr[end];
	        arr[end] = temp;*/
			
			quickSort(arr, start, i - 1); // for the left of the pivot
			quickSort(arr, i+1, end); // for the right of the pivot
			
		}
		
	}

}
