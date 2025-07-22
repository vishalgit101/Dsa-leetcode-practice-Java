package excercise;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		System.out.println("This is an excercise to practice questions");
		List<Integer>primes = findPrimeNumber(100);
		System.out.println(primes);
		int sum = sumOfPrime(primes, 5);
		System.out.println(sum);
	}
	public static List<Integer>  findPrimeNumber(int end) {
		List<Integer> primes = new ArrayList<>();
		
		for(int i = 3; i < end; i = i +2 ) {
			boolean prime = true;
			for(int j = 3 ; j < i; j = j +2 ) {
				//System.out.println("i: " + i + " and j: " + j);
				if(i % j == 0) {
					prime = false;
					break;
				}
			}
			if(prime == true) {
				primes.add(i);
			}
		}
		return primes;
	}
	public static int sumOfPrime(List<Integer> primes, int n) {
		int first = n;
		int second = n+1;
		int third = n + 2;
		int sum = 0;
		for(int i = 0; i < primes.size(); i++) {	
			if(i == first || i == second || i == third ) {
				sum = sum + primes.get(i);
			}
		}
		return sum;
	} 
}
