package exc02ArraysEasy;

import java.util.HashSet;
import java.util.Set;

public class Ex05SlidingWindowDetour {
	public static void main(String[] args) {
		// find the highest sum of 5 continuous numbers in the array
		int arr[] = {12,9,23,17,25,19,4,8,21,34,26,17,19,14,27,22,15,7,2,14,5,18,24};
		
		int highest = nonSlidingWindow(arr, 5);
		System.out.println("From Normal Technique: " + highest);
		
		int highest2 = slidingWindow(arr, 5);
		System.out.println("From Sliding Window Technique: " + highest2);
		
		
		// using just arrays
		char[] vowels = {'a','e', 'i', 'o', 'u'};
		String s = "bacacbefaobeacfe";
		int k = 5;
		maximumVowels(s, vowels, k);
		
		// using set, non sliding window
		Set<Character> vowelsSet = new HashSet<Character>();
		vowelsSet.add('a');
		vowelsSet.add('e');
		vowelsSet.add('i');
		vowelsSet.add('o');
		vowelsSet.add('u');
		maximumVowels2(s, vowelsSet, k);
		
		// using sliding window with set
		maximumVowels3(s, vowelsSet, k);
	}
	
	// using sliding window with set
	private static void maximumVowels3(String s, Set<Character> vowelsSet, int k) {
		int maxVowelCount = 0;
		int vowelCount = vowelMatch3(s, vowelsSet, k);
		
		for(int i = 0; i< s.length() - k; i++) {
			if(vowelsSet.contains(s.charAt(i))) { // check if the character leaving is vowel or not, if so do vowel --;
				vowelCount--;
			}
			
			if(vowelsSet.contains(s.charAt(k + i))) { // // check if the character coming is vowel or not, if so do vowel ++;
				vowelCount++;
			}
			
			// this way vowelCount never exceeds the k
			
			if(vowelCount > maxVowelCount) {
				maxVowelCount = vowelCount;
			}
		}
		
		System.out.println("Max number of vowels using Set with Sliding Window: " + maxVowelCount);
		
	}
	
	public static int vowelMatch3(String s, Set<Character> vowelsSet, int end) {
		int vowelCount = 0;
		for(int i = 0; i< end; i++) {
			if(vowelsSet.contains(s.charAt(i))) {
				vowelCount++;
			}
		}
		
		return vowelCount;
	}



	// with non-sliding window but with Set
	public static void maximumVowels2(String s, Set<Character> vowelsSet, int k) {
		int maxVowelCount = 0;
		for(int i =0; i< s.length() - k; i++) {
			int count = 0;
			count = vowelMatch2(s, vowelsSet, i, i+k);
			
			if(count > maxVowelCount) {
				maxVowelCount = count;
			}
		}
		
		System.out.println("Max number of vowels using Set: " + maxVowelCount);
		
	}
	
	// using Set to find the vowel count
	public static int vowelMatch2(String s, Set<Character> vowels, int start, int end ) {
		int vowelCount = 0;
		
		for(int i = start; i< end; i++) {
			
			if(vowels.contains(s.charAt(i))) {
				vowelCount = vowelCount + 1;
			}
		}
		
		return vowelCount;
	}
	
	
	
	// using non-sliding window- finding the maximum no. of vowels in a substring of size k
	private static void maximumVowels(String s, char[] vowels, int k) {
		int maxVowelCount = 0;
		
		for(int i = 0; i<s.length() - k ; i++) {
			int count = 0;
			count = vowelMatch(s, vowels, i, i + k);
			if(count > maxVowelCount) {
				maxVowelCount = count;
			}
		}
		
		System.out.println("Max number of vowels: " + maxVowelCount);
		
	}
	
	
	
	// this is with just using arrays this will require 2 for loops... instead use Set, Map etc...
	public static int vowelMatch(String s, char[] vowels ,int start,int end) {
		int vowelsCount = 0;
		for(int i = 0; i < vowels.length; i++) { // for char[] arrays
			for(int j = start; j< end; j++ ) { // for the substring section
				if(vowels[i] == s.charAt(j)) {
					vowelsCount = vowelsCount + 1;
				}
			}
		}
		return vowelsCount;
		
	}
	
	

	// using sliding window
	public static int slidingWindow(int arr[], int k) {
		int maxTotal = 0;
		int total = sum2(arr, k);
		
		for(int i = 0; i< arr.length - k; i++) {
			//System.out.println(total);
			total = total - arr[i] + arr[i +k];
			
			if(total > maxTotal) {
				maxTotal = total;
			}
		}
		
		return maxTotal;
	}
	
	public static int sum2(int[] arr, int end) {
		int sum = 0;
		for(int i = 0; i< end; i++) {
			sum = sum + arr[i];
		}
		return sum;
	}
	
	// using normal technique
	public static int nonSlidingWindow(int[] arr, int k) { // k = continuous jump size
		int maxTotal = 0;
		for(int i = 0; i < arr.length - k +1; i++) {
			int total = sum(arr, i, k);
			//System.out.println(total);
			if(total > maxTotal) {
				maxTotal = total;
			}
		}
		
		return maxTotal;
	}
	
	public static int sum(int[]arr, int start, int end) {
		int sum = 0;
		for(int i = start; i< start +end; i++) {
			sum = sum + arr[i];
		}
		return sum;
	}
}
