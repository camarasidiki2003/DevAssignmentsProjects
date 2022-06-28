package sessions;
import java.util.Scanner;

public class Homework2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan= new Scanner(System.in);
		System.out.println("Please enter a string?");
		String myString=scan.nextLine();
		//String a=myString;
		
		System.out.println(myString.toUpperCase());
		//System.out.println();
		System.out.println(myString.length());
		System.out.println(myString.replace('o', 'z'));
		String myString2=scan.nextLine();
		System.out.println(myString2.charAt(4));
		//System.out.println(myString.charAt(myString.length())-1);
		System.out.println(myString.concat(myString));
	}

}
