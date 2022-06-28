package project4;
//import java.util.Scanner;
import java.util.*;

public class PatternBackward {

	public static void main(String[] args) {
	   Scanner sc=new Scanner(System.in);
       System.out.println("Q1: Please enter an integer to print pattern 4, up to your given number:");
       int n = sc.nextInt();
       System.out.println(1);
       for(int i=4;i<=n;i=i+4) {
          System.out.println(i);
       } 
       System.out.println("Q2: Please enter another integer to print backward to Zero");
       int b= sc.nextInt();
       for(int i=n;i>=0;i=i-4) {
    	  System.out.println(i);
       }
	  Scanner sc2 = new Scanner(System.in);	
       System.out.println("Q3: Please enter your word to print each character out one by one(Space):");
  	   String myWord= sc2.nextLine();  
	   for(int i=0; i<myWord.length();i++) {
			System.out.print(myWord.charAt(i)+" ");
			
		    }
	   // Review Class4
		/*String a = "apple";
		char[] myArray = a.toCharArray();
		int[] numbers= {65, 25, 56, 6985};
		String[] names= {"tom", "steve", "jane", "john"};
		for(int i=0; i<=a.length(); i++) {
		System.out.println(a.toCharArray()[i]);
		
		}
		for(char item: myArray) {
			System.out.println(item);
			
			}
		//skip steve
		for(int i=0; i< names.length; i++) {
			if(i==1) {
				continue;
			}
		System.out.println(names[i]);
		}
		
		 //using for each
		int count =0;
		for(String item : names) {
			if(count==1) { 
				count++;
				continue;
			}
			
			System.out.println(item);
		    count++;	
		}
		if(!a.contains("e")) {
			for(char item: a.tocharArray()) {
				System.out.println(item);
			}
			while (!a.contains("e"))
				System.out.println(a);
		}
		System.out.println("After while loop");
		}
		*/
	}
	}
