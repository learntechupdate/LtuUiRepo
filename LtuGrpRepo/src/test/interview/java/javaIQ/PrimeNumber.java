package javaIQ;

/*
 Prime number in Java: Prime number is a number that is greater than 1 and divided by 1 or itself only. 
 In other words, prime numbers can't be divided by other numbers than itself or 1.
 For example 2, 3, 5, 7, 11, 13, 17.... are the prime numbers.
 
 Note: 
 0 and 1 are not prime numbers.
 The 2 is the only even prime number because all the other even numbers can be divided by 2.
 */

//A number only divisible by itself and 1
	//n=9 divide from 2 to 8 : by divisible by 3 : therefore 9 is Not prime
	//n=7 divide from 2 to 6 : Not divisible by any number : therefore 7 is prime
	public class PrimeNumber {
		
		public static void checkPrime(int n)
		{
			int remCount=0;
			if(n==1||n==0) {
				System.out.println("Please enter number greater than 1");
			}
			else {
				for(int i=2;i<n; i++) {
					if(n%i==0) {
						remCount++;
					}
					
				}
				
				if(remCount>0) {
					System.out.println(n+" Not a Prime Number");
				}
				else {
					System.out.println(n+" is  Prime Number");
				}
			}
		}
		
		public static void main(String[] args) {
			
			java.util.Scanner scn=new java.util.Scanner(System.in);
			System.out.println("Enter the number to check prime");
			int n=scn.nextInt();
			PrimeNumber.checkPrime(n);
			scn.close();
		}
		
}
