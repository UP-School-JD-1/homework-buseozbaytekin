package HomeworksChapter5;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		PrimeNumber primeNumber = new PrimeNumber();
		System.out.println("Please enter a integer number: ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(primeNumber.isPrime(n));
		
		
	}
	
	boolean isPrime(int n) {
		boolean prime = true;
		int i = 2;
		for(; i < n - 1; i++) {
			if(n % i == 0) {
				prime = false;
				break;
			}
			
		}
		if(!prime)
			System.out.println("First break: " + i);
			
		
		return prime;
	}

}
