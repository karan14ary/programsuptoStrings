package com.ReverseWordOrder;

import java.util.Scanner;

public class ReverseWordOrderApp {

	public static void main(String[] args) {
		//creating object of Scanner class
		Scanner scan=new Scanner(System.in);
		//asking user to enter the string
		System.out.println("Enter the string");
		//storing string in str variable
		String str=scan.nextLine();
		//invoking reverseWordOrder()
			//ReverseWordOrder.reverseWordOrder(str);
		System.out.println(ReverseWordOrder.reverseWordOrder(str));
	}

}
