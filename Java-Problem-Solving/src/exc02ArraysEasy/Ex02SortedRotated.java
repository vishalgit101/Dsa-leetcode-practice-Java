package exc02ArraysEasy;

import java.util.Arrays;

public class Ex02SortedRotated {
	
	public static void main(String[] arrgs) {
		int[] arr = {3,4,5,1,2};
		int[] arr2 = {3,6,10,1,8,9,9,8,9};
		
		System.out.println(sortedRotated(arr2));
	}
	
	public static boolean sortedRotated(int[] arr) {
		int drop = 0;
		int x = 0;
		int[] tempArr = new int[arr.length];
		
		for(int i = 0; i < arr.length -1; i++) {
			// check folded page for explanation to why x is 2 and not 3; i.e arr[i] at i = 2, e = 5 is greater than arr[i+1] at i = 3, e =1
			
			if(arr[i] > arr[i+1]) {
				drop++;
				x = i; // set the index where wherever last drop occur
				// if it occur only once, then x will what we need, else drop will be more hence false will return
			}
			
			if(drop > 1) {
				return false; //return when ever drop > 1
			}
			
		}
		
		if( drop == 0) {
			return true;
		}
		
		// drop == 1, push the array by ( length - index ) to right to get the original array
		//int k = arr.length - x; // push
		int k = x + 1;
		System.out.println("x:" + x ); // x: 2
		System.out.println("k: " + k); // k: 3
		for(int i = 0; i< arr.length; i++) {
			tempArr[i] = arr[(k + i) % arr.length];
		} 
		System.out.println(Arrays.toString(tempArr));
		
		for(int i = 0; i < tempArr.length -1; i++) {
			if(tempArr[i] > tempArr[i+1]) {
				return false;
			}
		}
		
		return true;
		
	}
	
}
