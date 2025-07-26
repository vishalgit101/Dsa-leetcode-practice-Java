package exc02ArraysEasy;

public class Ex05SlidingWindowDetour {
	public static void main(String[] args) {
		// find the highest sum of 5 continuous numbers in the array
		int arr[] = {12,9,23,17,25,19,4,8,21,34,26,17,19,14,27,22,15,7,2,14,5,18,24};
		
		int highest = nonSlidingWindow(arr, 5);
		System.out.println("From Normal Technique: " + highest);
		
		int highest2 = slidingWindow(arr, 5);
		System.out.println("From Sliding Window Technique: " + highest2);
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
