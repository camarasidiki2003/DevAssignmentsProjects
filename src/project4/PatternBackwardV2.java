package project4;

import java.util.Scanner;

public class PatternBackwardV2 {
 static int a, b, n, i;
 static String myWord;
 static Scanner sc,sc1, sc2;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 sc=new Scanner(System.in);
	       System.out.println("Q1: Please enter an integer to print pattern 4, up to your given number:");
	       n = sc.nextInt();
	       System.out.println(1);
	       for(i=4;i<=n;i=i+4) {
	          System.out.println(i);
	       } 
	       System.out.println("Q2: Please enter another integer to print backward to Zero");
	       b= sc.nextInt();
	       for(i=n;i>=0;i=i-4) {
	    	  System.out.println(i);
	       }
		   sc2 = new Scanner(System.in);	
	       System.out.println("Q3: Please enter your word to print each character out one by one(Space):");
	  	   myWord= sc2.nextLine();  
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
