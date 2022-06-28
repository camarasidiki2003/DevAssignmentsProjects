package project2;
import java.util.Scanner;

public class ScanSaveInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan= new Scanner(System.in);
		System.out.println("What is your name?");
		String myName=scan.nextLine();
		System.out.println("How old are you?");
		int myAge=scan.nextInt();
		System.out.println("What is your gender?");
		String myGender=scan.nextLine();
		System.out.println("Where are you from?");
		String myOrigin=scan.nextLine();
		System.out.println("Where do you live now");
		String myLive=scan.nextLine();
		System.out.println("Where do you work?");
		String myWork=scan.nextLine();
		System.out.println("What is your job role?");
		String myRole=scan.nextLine();
		System.out.println("What is your salary?");
		int mySalary=scan.nextInt();
		System.out.println("How much raise are you getting next year?");
		int myRaise=scan.nextInt();
		int totalSalary= mySalary+myRaise;
		System.out.println("My name is " + myName +". I am "+ myAge +" years old "+ myGender +". I work at "+ myWork +" as "+ myRole +". I currently live in "+ myLive +". I am originally from "+ myOrigin +". I make "+ mySalary); 
        System.out.println(" dollar. I will get "+ myRaise +" as annual raise so my total salary would be "+ totalSalary + " dollar next year.");
	}

}
