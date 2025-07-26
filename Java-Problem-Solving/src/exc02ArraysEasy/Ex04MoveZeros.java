package exc02ArraysEasy;

import java.util.Arrays;

public class Ex04MoveZeros {
	public static void main(String[] args) {
		int[] nums = {0,1,0,3,12};
		//int[] nums = {1,0,1};
		moveZeros(nums);
		System.out.println(Arrays.toString(nums));
	}
	
	public static void moveZeros(int[] nums) {
		 // take two pointers i and j....
        // one pointer should always move
        int i = 0;
        for(int j = 0; j< nums.length; j++){
            if(nums[j] != 0){
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                i++;
            }
        }
	}
}
