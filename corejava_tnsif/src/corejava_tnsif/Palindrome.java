package corejava_tnsif;

import java.util.Scanner;

public class Palindrome {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("ENter the number:");
		int num = sc.nextInt();
		
		int reverseNumber = 0;
		int Quotient = num;
		while( Quotient != 0) {
			
			int remainder =  Quotient % 10 ;
			reverseNumber = reverseNumber*10 + remainder;
			Quotient = Quotient / 10;
		}
		
		System.out.println("Entered number:" + num);
		System.out.println("Reversed number:" + reverseNumber);
		
		if(num == reverseNumber) {
			System.out.println("Entered number is palindrome");
		}
		else {
			System.out.println("Entered number is not a palindrome");
		}
		
	}

}
