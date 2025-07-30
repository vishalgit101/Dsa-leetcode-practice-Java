package exc02ArraysEasy;

import java.util.HashMap;
import java.util.Map;

public class Ex09SingleNumber {
	
	public static void main(String[] args) {
		int [] nums = {4,1,2,1,2};
	}
	
	// try with XOR Bitwise Operators
	public static int singleNumberBitWise() {
		return -1;
	}
	
	public static int singleNumber(int[] nums) {
        // first lets try it with hashmap
        Map<Integer, Integer> map = new HashMap<>();
       for(int i: nums){
            if(!map.containsKey(i)){
                map.put(i, 1);
            }else{
                map.put(i, map.get(i) + 1);
            }
            
       }
       for(Integer i: map.keySet()){
            if(map.get(i) == 1){
                return i;
            }
       }

       return -1;
    }
}
