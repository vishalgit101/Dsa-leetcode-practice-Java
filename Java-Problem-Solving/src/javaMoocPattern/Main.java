package javaMoocPattern;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		//exc1();
		//pattern1();
		//pattern2();
		//pattern3();
		//reverseTriangle();
		//pyramid(5);
		//rightAngledNumberTriangle1(5); // ✅
		//rightAngledNumberTriangle2(5); // ✅
		//invertedRightTriangle1(5); // ✅
		//invertedRightTriangle2(5);
		//sachinTriangle(5);
		//starPyramid1(10);
		//reverseStarPyramid(10);
		leftAlignedTriangle(5);
	}
	
	
	
	private static void leftAlignedTriangle(int num) {
		int stars = num;
		for(int i = 0; i < num *2; i++) {
			
			if( i < num) {
				for(int j = 0; j <= i; j++) {
					System.out.print("*");
				}
				System.out.println();
			}

			
			
			
			if(i > num) {
				for(int k = stars -1; k > 0; k--) {
					System.out.print("*");
					
				}
				System.out.println();
				stars--;
			}

		}
		
	}



	private static void reverseStarPyramid(int num) {
		int start = (num*2)-1;
		int end = 0;
		for(int i =0 ; i < num; i++) {
			
			for(int j = 0; j < start; j++) {
				if(j < start && j >= end) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
				
			}
			start--;
			end++;
			System.out.println();
		}
		
	}


	private static void starPyramid1(int num) {
		int start = num-1;
		int end = num;
		
		for(int i=1; i < num; i++ ) { // changed i = 0; to i = 1; for non repeating middle of the pyramid pattern
			for(int j =0; j <= end; j++) {
				if(start <= j && j < end) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			start --;
			end++;
			System.out.println();
		}
		
	}


	private static void sachinTriangle(int num) {
		int count = 0;
		for(int i = num; i > 0; i--) {
			count = 0;
			for( int j = 0; j < i * 2; j++) {
				
				if(count > i) {
					System.out.print(Math.abs(j -i +1 ));
				}else {
					if(i - j == 0) {
						count++;
						continue;
						
					}else {
						System.out.print(i-j);
					}
					
				}
				
				count ++;
			}
			
			System.out.println();
		}
		
	}

	private static void invertedRightTriangle2(int num) {
		
		for(int i = num; i > 0; i--) {
			for(int j = 0; j < i; j ++) {
				System.out.print(j+1);
			}
			System.out.println();
		}
		
	}

	private static void invertedRightTriangle1(int num) {
		
		for(int i = num; i >= 0; i--) {
			
			for(int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}

	private static void rightAngledNumberTriangle2(int num) {
		
		for(int i =0; i < num; i++) {
			for(int j = 0; j <= i; j++) {
				System.out.print(i+1);
			}
			System.out.println();
		}
		
	}

	public static void rightAngledNumberTriangle1(int num) {

		for(int i =0; i < num; i++) {
			for(int j = 0; j <= i; j++ ) {
				System.out.print(j +1);
			}
			System.out.println();
		}
		
	}
	
	private static void pyramid(int height) {
		
		int start = height-1;
		int end = start;
		
		for(int i = 0; i < height; i++) {
			
			
			for(int j = 0; j <= end; j++) {
				if(j >= start && j <= end) { // only j >= start is needed here
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			start--;
			end++;
			System.out.println();
		}
		
	}

	/*public static void tree(int height) {
		int start =  (height/2);
		int end = (height/2);
		
		for(int i = 0; i < 8; i++) {

			//System.out.println("Start: " + start + " End: " + end);
			for(int j = 0; j < 8; j ++) {
				if(j >= start && j <= end) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			start--;
			end++;
			System.out.println();
		}
	}*/
	
	public static void reverseTriangle() {
		for(int i = 0; i < 8; i++ ) {
			for(int j = 8; j >= 0; j-- ) {
				if(j <= i) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
	
	// triangle
	public static void pattern3() {
		for(int i = 0; i < 8; i++) {
			for(int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println("*");
		}
	}
	
	//rectangle
	public static void pattern2() {
		for(int i = 0; i < 4; i++) {
			for(int j= 0; j< 10; j++) {
				System.out.print("*");
			}
			System.out.println("*");
		}
	}
	
	//square
	public static void pattern1() {
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j<=4; j++) {
				System.out.print("*");
			}
			System.out.println("*");
		}
	}
	
	public static void exc1() {

		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Write a message");
		
		String message = scanner.nextLine();
		
		System.out.println("Message will be printed 10 times, after 5 times message will be printed in reverse");

		for(int i = 0; i < 10; i++) {
			if(i < 5 ) {
				System.out.println("Count: " + i + "-> " + message);
			}else {
				String reversedMessage = "";
				for(int j = message.length() -1; j >= 0; j--) {
					reversedMessage =  reversedMessage + message.charAt(j);
				}
				System.out.println("Count: " + i + "-> " + reversedMessage);
			}
		}
	}

}
