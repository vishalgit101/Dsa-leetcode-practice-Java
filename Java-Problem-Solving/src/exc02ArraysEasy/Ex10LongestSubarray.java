package exc02ArraysEasy;

public class Ex10LongestSubarray {

	public static void main(String[] args) {
		
		int[] nums = {2,3,5,1,9};
		System.out.println(longestSubarray(nums, 6));
	}
	
	public static int longestSubarray3(int[] nums) { // optimal
		return -1;
	}
	
	public static int longestSubarray2(int[] nums) { // Better
		return -1;
	}
	
	public static int longestSubarray(int[] nums, int k) { // brute force
		int i = 0;
		int j = 0;
		int longestArr = 1;
		int sum = 0;
		
		while(i < nums.length) {
			
			if(k > nums[j] + sum) {
				sum = sum + nums[j];
				j++;
			}else if(k == nums[j] + sum) {
				System.out.println("");
				if(longestArr < j -i + 1) {
					longestArr = j - i + 1 ;
					sum = 0;
				}
				i++;
				j = i;
			}else { // i.e k >  nums[j] + sum
				sum = 0;
				i++;
				j = i;
			}
			
		}
		return longestArr;
	}

}
