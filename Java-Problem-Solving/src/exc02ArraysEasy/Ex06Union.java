package exc02ArraysEasy;
import java.util.*;
public class Ex06Union {

	public static void main(String[] args) {
		int[] arr1= {1,2,3,4,5}; // i...
		int[] arr2= {2,3,4,4,5}; // j...
		
		ArrayList<Integer> list =  union(arr1, arr2, 5, 5);
		
		System.out.println(list);
		System.out.println( "Union Two Pointer" + unionTwoPointer(arr1, arr2));
	}
	
	// union using two pointers
	public static ArrayList<Integer> unionTwoPointer(int[] arr1, int[] arr2){
		
		int n1 = arr1.length;
		int n2 = arr2.length;
		
		int i = 0;
		int j = 0;
		
		ArrayList<Integer> union = new ArrayList<Integer>();
		while(i < n1 && j < n2) {
			
			if(arr1[i] <= arr2[j]) { // if i at arr1 is smaller or equals to j at arr2 
				
				if(union.size() == 0 || union.getLast() != arr1[i]) { // if union size == 0 or union last element isn't same as current element at arr2[j]	
					union.add(arr1[i]);
				}
				i++;
				
			}else {
				// if j at arr2 is smaller than i at arr1 
				
				if(union.size() == 0 || union.getLast() != arr2[j]) { // if union size == 0 or union last element isn't same as current element at arr2[j]	
					union.add(arr2[j]);
				}
				j++;
			}
			
		}
		
		// Add remaining distinct elements
		while( i < n1) {
			if(union.size() == 0 || union.getLast() != arr1[i]) { 
				union.add(arr1[i]);
			}
			i++;
		}
		
		while(j < n2) {
			if(union.size() == 0 || union.getLast() != arr2[j]) { 	
				union.add(arr2[j]);
			}
			j++;
		}
		
		return union;
		
	}
	
	//Union using Set or HashMap
	public static ArrayList<Integer> union(int[] arr1, int[] arr2, int n, int m){ // n and m are sizes of the array

		// HashSet
		HashSet<Integer> s = new HashSet<Integer>();
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		for(int i = 0; i < n; i++) { // for first array
			s.add(arr1[i]);
		}
		
		for(int i = 0; i < m; i++) { // for second array
			s.add(arr2[i]);
		}
		
		// now that set has all the elements from both the arrays
		
		for(int i: s) { // for each element in s add them to array list
			list.add(i);
		}
		
		return list;
		
	}

}
