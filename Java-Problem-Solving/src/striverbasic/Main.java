package striverbasic;

public class Main {
	public static void main(String[] args) {
		int num = 123;
		;
		System.out.println(reverseInteger(num));
	}
	
	//Reverse an integer
	public static int reverseInteger(int num) {
        String strNum = String.valueOf(num);
        String strNum2 = "";
        for(int i = strNum.length() -1; i >= 0; i--){
            if(strNum.charAt(i) == '-'){
                strNum2 = "-" + strNum2;
                continue;
            }else{
                strNum2 = strNum2 + strNum.charAt(i);
            }
            
        }

        try{
            return Integer.parseInt(strNum2);
        }catch(NumberFormatException e){
            return 0;
        }
        
        /*if(numInt < Integer.MIN_VALUE){ Not needed, simply use try catch
            return 0;
        }else{
            return numInt;
        }*/
	}
	
	// Another Interesting way to solve it
	public static int reverseInteger2(int x) {
	        int res = 0;
	        boolean isNegative = x < 0;
	        String strX = String.valueOf(Math.abs(x));
	        StringBuilder sb = new StringBuilder(strX).reverse();
	        
	        try {
	            res = Integer.parseInt(sb.toString());
	        } catch (NumberFormatException e) {
	            return 0;
	        }
	        
	        return isNegative ? -res : res;
	}
	
}
