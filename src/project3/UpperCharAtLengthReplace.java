package project3;
import java.util.Scanner;

public class UpperCharAtLengthReplace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

    	Scanner scan= new Scanner(System.in);
		System.out.println("Please enter a string:");
		String a=scan.nextLine();
		System.out.println(a.toUpperCase());
		System.out.println(a.length());
		String b = a.replace('o', 'z');
		System.out.println(b);
		System.out.println(b.charAt(b.length()-1));
		System.out.println(a+" Test");
		//System.out.println(a.concat(" Test"));
			}

}
