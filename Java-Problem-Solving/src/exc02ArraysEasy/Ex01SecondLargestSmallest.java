package exc02ArraysEasy;

public class Ex01SecondLargestSmallest {

	public static void main(String[] args) {
		
		int[] arr = {1,2,4,7,7,5};
		
		secondLargestSmallest(arr);

	}
	
	public static void secondLargestSmallest(int[] arr) {
		
		//earlier was doing arr[0] for all the variables
		
		// this min, max is better
		// xame up with this solution on my own lol and its the most optimal
		int largest = Integer.MIN_VALUE;
		int secondLargest = Integer.MIN_VALUE;
		
		int smallest = Integer.MAX_VALUE;
		int secondSmallest = Integer.MAX_VALUE;
		
		for(int i = 0; i < arr.length; i++) {
			// for largest
			if(arr[i] > largest) {
				secondLargest = largest;
				largest = arr[i];
			}else if(arr[i] > secondLargest && arr[i] != largest){
				secondLargest = arr[i];
			}
			
			// for smallest
			if(arr[i] < smallest) {
				secondSmallest = smallest;
				smallest = arr[i];
			}else if(arr[i] < secondSmallest && arr[i] != smallest) {
				secondSmallest = arr[i];
			}
		}
		
		System.out.println("largest: " + largest );
		System.out.println("second largest: " + secondLargest);
		System.out.println();
		System.out.println("smallest: " + smallest );
		System.out.println("second smallest: " + secondSmallest);
		
	}

}
