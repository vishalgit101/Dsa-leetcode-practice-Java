package exc02ArraysEasy;

import java.util.ArrayList;
import java.util.List;

public class Ex07Intersection {

	public static void main(String[] args) {
		
		// Intersection of Two Sorted Arrays
		int[] arr1 = {1,2,2,3,3,4,5,6};
		int[] arr2 = {2,3,3,5,6,6,7};
		
		System.out.println(intersection(arr1, arr2));
		System.out.println(intersectionBruteForce(arr1, arr2));
	}
	
	// Using Two Pointers
	public static List<Integer> intersection(int[]arr1, int[] arr2) {
		int i = 0;
		int j = 0;
		List<Integer> intersection = new ArrayList<Integer>();
		
		while(i < arr1.length && j < arr2.length) {
			if(arr1[i] == arr2[j]) {
				intersection.add(arr1[i]);
				i++;
				j++;
			}else if(arr1[i] < arr2[j]) {
				i++;
			}else {
				j++;
			}
		}
		
		return intersection;
		
	}
	
	public static List<Integer> intersectionBruteForce(int[] arr1, int[] arr2) {
		
		int[] visited = new int[arr2.length]; // it could be boolean flags as well
		List<Integer> intersection = new ArrayList<Integer>();

		for(int i = 0; i < arr1.length; i++) {
			
			for(int j = 0; j< arr2.length; j++) {
				if(arr1[i] == arr2[j] && visited[j] == 0) {
					intersection.add(arr1[i]);
					visited[j] = 1;
					break;
				}else if(arr2[j] > arr1[i]) {
					break;
				}
			}
		}
		
		return intersection;
			
	}
}
	
	
	

