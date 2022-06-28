package project8;
import java.util.LinkedHashSet;
import java.util.Set;

public class StringProb {

	public static void main(String[] args) {
	  
		  String str = "tomorrow";
		  char c = 'o';
		  getCharCountInString1(str, c);
		  
		  char[] x = str.toCharArray();
		  int count=0;
		  for(char e : x) {
		   if(e==c) {
		    count++;
		   }
		  }
		  
		  System.out.println(count);

		 }

		public static int getCharCountInString1(String str, char c) {
			char[] x = str.toCharArray();
			  int count=0;
			  for(char e : x) {
			   if(e==c) {
			    count++;
			   
			   }
			  }
			  return count++;
		}   

 public static void repeated2() {
  
  Set<Character> repeatedChar = new LinkedHashSet<Character>();
  
  String str = "hello my name is ap"; //o r
  char[] myStr = str.toCharArray();
  
  for(int i=0; i<myStr.length; i++) {
   
   for(int j=i+1; j<myStr.length; j++) {
    
    if(myStr[i] == myStr[j]) {
     repeatedChar.add(myStr[i]);
    }
    
   }
   
  }
  
  System.out.println(repeatedChar);
  
  
  
  
  
 }
 
 public static int getCharCountInString(String str, char c) {
  char[] x = str.toCharArray();
  int count=0;
  for(char e : x) {
   if(e==c) {
    count++;
   }
  }
  return count;
 }


			
		
		 
		
}


