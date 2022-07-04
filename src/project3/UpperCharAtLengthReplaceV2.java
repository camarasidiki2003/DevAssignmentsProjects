 package project3;

import java.util.Scanner;

public class UpperCharAtLengthReplaceV2 {
 static String a, b;// Non static variable can not be referred to in static method
 //On the other hand static method can be referred to in a non non static method
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan= new Scanner(System.in);
		System.out.println("Please enter a string:");
		a=scan.nextLine();
		System.out.println("The upper form of the string is " +a.toUpperCase());
		System.out.println("The string length is "+a.length());
		b = a.replace('o', 'z');
		System.out.println("By replacing O by Z, the string will be "+b);
		System.out.println("The last character of " +b+" is " +b.charAt(b.length()-1));
		System.out.println("By concatening with Test the result will be "+ a+" Test");
		//System.out.println(a.concat(" Test"));
		System.out.println("Thank you for your time");

	}

}
