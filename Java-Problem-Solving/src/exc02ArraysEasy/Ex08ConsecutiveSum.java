package exc02ArraysEasy;

public class Ex08ConsecutiveSum {

	public static void main(String[] args) {
		
		//int[] nums = {1,0,1,1,0,1};
		int[] nums2 = {1,1,0,1,1,1};
		//System.out.println(findMaxConsecutiveOnes(nums));
		//System.out.println();
		System.out.println(findMaxConsecutiveOnes(nums2));
	}
	
	public static int findMaxConsecutiveOnes(int[] nums) {
        int sum = 0;
        int consecutiveSum = 0;
        for(int i = 0; i< nums.length; i++){
            if(nums[i] == 1){
                consecutiveSum++;
                System.out.println(consecutiveSum);
            }else {
            	consecutiveSum = 0;
            }
            
            if(consecutiveSum > sum){
                sum = consecutiveSum;
                
            }
        }
        return sum;
    }

}
