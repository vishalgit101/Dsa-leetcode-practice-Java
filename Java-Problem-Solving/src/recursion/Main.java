package recursion;

public class Main {

	public static void main(String[] args) {
		
		String str = "the simple engineer";
		
		String rs = recursiveStrings(str);
		System.out.println(rs);

	}
	
	/*public static void mergeSort(int[] arr, int left, int right) {
		
		if(left < right) {
			int mid = (left/right)/2;
			
			// dividing
			mergeSort(arr, left, mid); // left side
			mergeSort(arr, mid + 1, right); // right side
			
			
			// now merging part....
			//conquering and overwriting in place values
			
			merge(arr, left, right, mid); // merging
		}
		
	}
	
	public static void merge(int[] arr, int left, int right, int mid) {
		int n1 = mid - left + 1;
		int n2 = right - mid;
		
		int[] leftArr = new int[n1];
		int[] rightArr =  new int[n2];
		
		for(int i = 0; i < n1; i++) {
			leftArr[i] = arr[i];
		}
		
		for(int i = 0; i < n2; i++) {
			rightArr[i] = arr[i];
		}
		
		int[] tempArr = new int[n1+n2];
		
		for(int k = 0; k < tempArr.length; k++) {
			int i = 0;
			int j = 0;
			
			if(leftArr[i] < rightArr[j]) {
				tempArr[k] = leftArr[i];
				i++;
			}else {
				tempArr[k] = rightArr[j];
				j++;
			}
		}
		
		// now map temp array to original array
		for(int i = left; i < right; i++) {
			arr[i] = 
		}
		
	}*/
	
	public static String recursiveStrings(String str) {
		// form the base case -- str = ""
		if(str == "") {
			return "" ;
		}
		
		//Smallest amount of work in each iteration
		return  str.charAt(0) + recursiveStrings(str.substring(1));
		//return recursiveStrings(str.substring(1))  + str.charAt(0);
		// Shrinks the problem space + Smallest unit of work to contribute
	}

}
