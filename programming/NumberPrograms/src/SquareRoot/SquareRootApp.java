package SquareRoot;

import java.util.Scanner;

public class SquareRootApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);//create an object for Scanner class
		System.out.println("Enter a number");//Ask for user input
		double n=scan.nextDouble();//store the user input in a  variable
		int sqroot=(int)SquareRoot.squareRoot(n);//invoking method
		System.out.println("The squareroot of "+n+" is "+sqroot);
	}

}
