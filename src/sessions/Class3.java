package sessions;
import java.util.Arrays;
import java.util.Scanner;

public class Class3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      /*  System.out.print("Hello");
         System.out.println(555);
         System.out.println(true);
         System.out.println();
         System.out.println('c');
         int a = 10;
         char b = 'c';
         System.out.println(a+b);
         Scanner uI1= new Scanner(System.in);// primitive type
         Scanner uI2= new Scanner(System.in);//Non primitive types
         System.out.println("what day is it?");
         String day =uI.next();
         System.out.println("what time is it give me hour only");
         int hour= uI.nextInt();
	
		Scanner ui = new Scanner(System.in);
		System.out.println("Gime me a word, ill then give you the lenght?");
		String w = ui.nextLine();
		System.out.println(w.length());
		//or 
	Scanner ui = new Scanner(System.in);
		System.out.println("Gime me a word, ill then give you the lenght?");
		// String w = ui.nextLine();
		System.out.println(ui.nextLine().length());
		String a = ui.nextLine();
		System.out.println("Give me a character");
		System.out.println(a.charAt(a.charAt(a.length()-1));
		System.out.println(a.charAt(0));
		System.out.println(a.startsWith("t"));
		System.out.println(a.endsWith("S"));
		System.out.println(a.isEmpty());
		System.out.println(a.contains("pp"));
		System.out.println(a.toUpperCase());
		System.out.println(a);
		System.out.println(a.toLowerCase());
		System.out.println(a);
		a= a.toUpperCase();//update the original value
		System.out.println(a.indexOf('a'));
		System.out.println(a.indexOf("ple"));
        System.out.println('p');
        System.out.println("ppl");
        
		
		Scanner ui = new Scanner(System.in);
		System.out.println("Gime me a word, ill then give you the lenght?");
		String w = ui.nextLine();
		System.out.println(w.length());
		System.out.println((a.concat("").concat("tom").concat("...."));
		System.out.println((a+"+"tom);// concat
		System.out.println(a.trim);
		System.out.println(a.replace("el", "ssss"));
		System.out.println(a.equals("Hello)"));
		System.out.println(a.equalsIgnoreCase("Hello"));
		// subsString: 10 beginIndex to end
		// 2) beginIndex and endIndex (range) -- endIndex is excluded
		System.out.println(a.substring(2));
		System.out.println(a.substring(2,4));// tommorrow will give mo
		//Array holding multiple values in one varaible
		//option1, Data value known
		String[] students = {"tom", "steve", "Jane"};
		int [] grades = {23, 34 56, 40};
		boolean[] pass = {true, false, false, true};
        //option2: Data value unknown
		String[] ppl = new String[3];
		ppl[2] = "jane";
		ppl[0] = "jane";
		ppl[1] = "jane";
		System.out.println(ppl[1]);
	*/
	//Class3 Review
		 String a ="apple";
         char [] word1= {'a','p','p','l','e'};
         //System.out.println(a.charAt(3)); Do not display array with this formula, uses the next one, otherwise sometime it gives memories as result instead of the array values
         System.out.println(word1[3]);
         char[] word2= a.toCharArray();
         System.out.println(word1);//good
       
         System.out.println();
         Arrays.sort(word1);
         System.out.println(word1[0]);
         System.out.println(word1[1]);
         System.out.println(word1[2]);
         System.out.println(word1[3]);
         System.out.println(word1[4]);
         //System.out.println(word1[5]);
         //splitting
          String names="tom,steve, john, jane, james";
          String[] myArray=names.split(",");
          System.out.println(myArray.length-1);
          String names2="this is jav. my program.";
          String[] myArray2=names2.split("\\.");
          System.out.println(myArray[0]);
	
	
	}

}
