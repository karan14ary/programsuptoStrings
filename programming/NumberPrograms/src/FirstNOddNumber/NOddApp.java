package FirstNOddNumber;

import java.util.Scanner;

import PrimeNumber.Prime;

public class NOddApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);//create an object for Scanner class
		System.out.println("Enter a number");//Ask for user input
		int n=scan.nextInt();//store the user input in a  variable 
		NOdd.nOdd(n);//invoking method
	}

}
