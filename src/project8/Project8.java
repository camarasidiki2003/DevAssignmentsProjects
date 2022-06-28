package project8;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;

public class Project8 {
	 public static void main(String[] args) {
			rd();
			Project8 obj = new Project8();
			obj.sorting1();
			//obj.RandNumb();
			//duplicate();
			obj.nth();
			duplicateHash();
			
									
			}

		 public static void rd() {
			int counter;
		    Random rnum = new Random();
		    /* Below code would generate 500 random numbers
		     * between 100 and 1000.
		     */
		    System.out.println("Random Numbers:");
		    System.out.println("***************");
		    for (counter = 100; counter <= 500; counter++) {
		       System.out.println(rnum.nextInt(1000));
		    }
		}
		     /*public static void duplicate() {
		    	 Scanner sc= new Scanner(System.in); //scanner object
					System.out.println("Please enter a string?");
					String userInput=sc.nextLine(); // reading the user input
					//Let find the duplicates in the string
					//we will be using For loop, the life saver
					//let convert the string to chaArray
					char[] newUserInput = userInput.toCharArray();
				      System.out.println("The string is:" + userInput);
				      System.out.print("Duplicate Characters in above string are: ");
				      for (int i = 0; i < userInput.length(); i++) {
				         for (int j = i + 1; j < userInput.length(); j++) {
				            if (newUserInput[i] == newUserInput[j]) {
				            	if(count(j))
				            	
				               System.out.print(newUserInput[j] + " ");
				               //System.out.println(newUserInput[i]);
				               break;
				               
				               /* String str = "beautiful beach";
      
      for (int i = 0; i < str.length(); i++) {
         for (int j = i + 1; j < str.length(); j++) {
            if (carray[i] == carray[j]) {
               System.out.print(carray[j] + " ");
               break;
				            }
				         } 
				      }
		     }
		     */
		 /** find nth smallest method. */
		    public static int findNthSmallestNumber(int n, int[] numbers){
		        return numbers[n-1];
		    } // End of findNthSmallesNumber method.
		 
		// End of class.
		     public static void duplicateHash() {
		    	Scanner sc = new Scanner(System.in);
		    	System.out.println("what is the string to inspect for possible duplicate?");
		    	String myInput = sc.nextLine(); 
		    	    char[] myInput2 = myInput.toCharArray();
		    	     
		    	    Map<Character, Integer> map = new HashMap<>();
		    	    for(char c : myInput2) 
		    	    {
		    	      if(map.containsKey(c)) {
		    	        int counter = map.get(c);
		    	        map.put(c, ++counter);
		    	      } else {
		    	        map.put(c, 1);
		    	      }
		    	    }
		    	     
		    	    System.out.print("Duplicate characters:" );
		    	     
		    	    //Print duplicate characters
		    	    for(char c : map.keySet()) {
		    	      if(map.get(c) > 1) {
		    	        System.out.print(c+" ");
		    	      }
		    	    }
		    	     
		    	/*    System.out.println(" Duplicate characters excluding white space :");
		    	     
		    	    //Print duplicate characters excluding white space
		    	    for(char c : map.keySet()) {
		    	      if(map.get(c) > 1 && !Character.isWhitespace(c)) {
		    	        System.out.println(c);
		    	      }
		    	    }
		    	     
		    	    System.out.println("Distinct characters:");
		    	     
		    	    //Print distinct characters
		    	    for(char c : map.keySet()) {
		    	      if(map.get(c) == 1) {
		    	        System.out.println(c);
		    	      }
		    	    }
		    	  
		 */   	
		    	 
		     }
			  public int RandNumb() {
				 Random randnumb = new Random();
				 System.out.println("Random Numbers:");
				 System.out.println("**************");
				 for (int i=100; i<=1000; i++) {
					 System.out.println(randnumb.nextInt(1000));
					}
				return randnumb.nextInt(500);
			 }
			 public void sorting1() {
			 int[] arr = new int[]{0, 1, 3, 4,9, 7, 2, 6, 5};
				int newV=0;
				for (int b=0; b<arr.length; b++)
				System.out.print(arr[b]+" ");
				System.out.println(" is the unsorted list of the array");
				//Let sort the array the Arrays.sort() 
				// Let use For loop
				for (int i =0;i<arr.length; i++) {
				for (int j=i+1;j<arr.length; j++) {
					
					if (arr[i]>arr[j])
					{
						//swap values
						newV=arr[i];
						arr[i]=arr[j];
						arr[j]=newV;
					}
					}
					System.out.print(arr[i]+ " ");
					}
				System.out.println(" is the sorted list, sort performed by For loop");
			 }
			  public void nth() {
				 {
			            int numbers [] = {10, 15, 20, -88};
			             
			            int largest = numbers[0];
			            int smallest = numbers[0];
			             
			            for(int i = 1;  i<numbers.length; i++) {
			                 if(numbers[i]>largest) {
			                   largest = numbers[i];
			                 }
			                 else if(numbers[i]<smallest) {
			                   smallest = numbers[i];
			                 }
			          }
			           System.out.println("List of array is: " + Arrays.toString(numbers));
			           System.out.println("Largest numbers is : " +largest);
			           System.out.println("Smallest number is : " +smallest);
			        }
			 }
					
			

				

		
		
	

}
