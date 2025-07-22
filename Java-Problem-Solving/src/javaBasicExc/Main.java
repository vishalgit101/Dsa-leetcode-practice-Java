package javaBasicExc;

public class Main {
	
	public static void main(String[] args) {
		int [] nums = {3,5,5,1,2,8,10,2,11,7,6,3};
		
		/*int[] uni = removeDuplicate(nums);
		
		for(int unique: uni ) {
			System.out.println(unique);
		}*/
		// Use LinkedHashSet for doing this quickly
		
		// now basic sorting
		/*sort(nums);
		
		for(int n: nums) {
			System.out.println(n);
		}*/
		
		
		
		//iterate(nums);
		//bubbleSort(nums);
		//iterate(nums);
		
		//String str = "Hello";
		//String rs = stringReversal(str);
		//System.out.println(rs);
		
		//String sentence = "This is some sentence";
	    //System.out.println(sentenceReversal(sentence));
		
		//String str= "thissihti";
		//System.out.println(palindrome(str));
		
		
		//System.out.println(fibonacci(10));
		
		// Binary Search
		int[] arr = {3, 8, 15, 23, 27, 31, 42, 56, 64, 78, 91};
		//binarySearch(arr, 23);
		//binarySerach2(arr, 6);
		
		
		String str = "hello";
		String rs =  stringReversal(str);
		System.out.println(rs);
		
		String str2 = "racecar";
		String str3 = "kayak";
		System.out.println(isPalindrome(str));
		
		recursiveBinarySearch(arr, 0, arr.length-1, 27);
	}
	
	// recursive binary search
	public static boolean recursiveBinarySearch(int[] arr, int start, int end, int num) {
		
		int mid = (start + end)/ 2;
		
		if(start > end) {
			System.out.println("Num cannot be found!");
			return false;
		}
		
		if(arr[mid] == num) {
			System.out.println("Num found at: " + arr[mid] + " Index position of: " + mid);
			return true;
		}
		
		if(arr[mid] < num) {
			start = mid -1;
			return recursiveBinarySearch(arr, start, end , num);
		}
		
		if(arr[mid] > num) {
			end = mid + 1;
			return recursiveBinarySearch(arr, start, end, num);
			
		}
		
		return false;
		
	}
	
	
	// recursion exercises 
	// recursion is function calling itself with a base ending condition
	
	//string reversal with recursion
	public static String strReversalRecursion(String str) {
		// base case
		if(str == "") {
			System.out.println(str);
			return str;
		}
		
		return  strReversalRecursion(str.substring(1)) + str.charAt(0);
		
 
	}
	
	// checking is palindrome using recursion
	public static boolean isPalindrome(String str) {
		
		// base case; when the loop should stop
		if(str.length() == 0 || str.length() == 1) {
			return true;
		}
		
		if(str.charAt(0) == str.charAt(str.length()-1)) {
			return isPalindrome(str.substring(1, str.length() -1)); // str.subString(1, 5) >> str.subString(1, 4) start-index, ending-index of string
		}
		
		return false;
		
	}
	
	
	// done using while loop
	public static void binarySerach2(int[] arr, int num) {
		
		int start = 0;
		int end = arr.length -1;
		int mid = 0;
		
		boolean numFound = false;
		while(start <= end) {
			mid = (start + end) / 2;
			
			if(num == arr[mid]) {
				System.out.println("Num: " +num+ " found at index: " + mid + ", Index position Number is: " + arr[mid]);
				numFound = true;
				break;
			}else if( num > arr[mid]) {
				start = mid +1;
			}else if(num < arr[mid]) {
				end = mid -1;
			}
		}
		
		if(numFound == false) {
			System.out.println("Number: " + num + " does not exists in the array!");
			return;
		}
		
	}
	
	// should be done using while loop
	public static void binarySearch(int[] arr, int num) {
		
		int mid = arr.length/2;
		int start = 0;
		int end = arr.length;
		
		boolean numFound = false;
		for(int i = 0; i <= mid; i++) {
			
			if( arr[mid] == num) {
				System.out.println("Num: " +num+ " found at index: " + mid + ", Index position Number is: " + arr[mid]);
				numFound = true;
				break;
			}else if(num < arr[mid]) {
				end = mid;
				mid = (start + end)/2;
				
			}else if (num > arr[mid]) {  
				
				start = mid;
				mid = (start + end)/2;
			}
		}
		
		if(numFound == false) {
			System.out.println("Number: " + num + " does not exists in the array!");
		}
		
	}
	
	private static int fibonacci(int num) {
		int sum = 0;
		int last = sum;
		int secondLast = 1;
		
		for(int i = 1; i <= num; i++ ) {
			
			sum = last + secondLast;
			secondLast = last;
			last = sum;
		
		}
		
		return sum;
		
	}

	public static boolean palindrome(String str) {
		for(int i = 0, j = str.length() -1; i < (str.length()-1)/2; i++, j--) {
			if(str.charAt(i) != str.charAt(j)) {
				return false;
			}
		}
		
		return true;
	}
	
	
	
	private static String sentenceReversal(String st) {
		String newStr = "";
		String[] strArray = st.split(" ");
		
		for(int i = strArray.length -1; i >= 0; i--) {
			if(i == strArray.length-1) {
				newStr = newStr + strArray[i];
			}else {
				newStr = newStr + " " + strArray[i];
			}
			
		}
		return newStr;
	}




	public static String stringReversal(String str) {
		String s = "";
		for(int i = str.length() - 1; i >= 0; i--) {
			s = s+ str.charAt(i);
		}
		return s;
	}



	//  {3,5,5,1,2,8,10,2,11,7,6,3};
	private static void bubbleSort(int[] nums) {
		boolean sort = true;
		
		while(sort) {
			sort = false;
			for(int i = 0; i < nums.length - 1; i++) {
				if(nums[i] > nums[i+1]) {
					int temp = nums[i];
					nums[i] = nums[i+1];
					nums[i+1] = temp;
					sort = true;
				}
			}
		}
			
		
	}
	
	public static void iterate(String[] str) {
		for(String n: str) {
			System.out.println(n);
		}
	}

	public static void iterate(int[] nums) {
		for(int n: nums) {
			System.out.println(n);
		}
	}
	
	private static void sort(int[] nums) {
		
		for(int i =0; i< nums.length; i++) {
			
			// i {3,5,5,1,2,8,10,2,11,7,6,3};
			
			//	 j {3,5,5,1,2,8,10,2,11,7,6,3};
			for(int j = 0; j < i; j++) {
				if(nums[i] < nums[j]) {
					int temp = nums[i];
					nums[i] = nums[j];
					nums[j] = temp;
				}
			}
		}		
	}

	public static int[] removeDuplicate(int[] arr) {
		
		int[] nums = new int[arr.length];
		int position = 0;
		System.out.println("Nums: " +nums);
		for(int i = 0; i < arr.length; i++ ) {
			boolean duplicate = false;
			for(int j = 0; j < position +1; j++) {
				if(arr[i] == nums[j]) {
					duplicate = true;
					break;
				}
			}
			
			if(duplicate == false) {
				nums[position] = arr[i];
				//System.out.println(nums[position]);
				position++;
			}
		}
		return nums;
	}
	
	    /*public static int[] removeDuplicate(int[] arr) {
	        int[] nums = new int[arr.length]; // ✅ allow full unique count
	        int position = 0;

	        for (int i = 0; i < arr.length; i++) {
	            boolean duplicate = false;

	            for (int j = 0; j < position; j++) { // ✅ check only filled part
	                if (arr[i] == nums[j]) {
	                    duplicate = true;
	                    break;
	                }
	            }

	            if (!duplicate) {
	                nums[position] = arr[i];
	                position++;
	            }
	        }

	        // ✅ Copy only filled part to return array
	        int[] result = new int[position];
	        for (int i = 0; i < position; i++) {
	            result[i] = nums[i];
	        }

	        return result;
	    }
	}*/

	
	// sort array with 2-3 methods
	
	// remove duplicates from an array
	
	// count the times of occurrence in an array
	
}
