package sessions;
import java.util.ArrayList;
import java.util.Collections;

public class Draft {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* Scanner ui = new Scanner(System.in);
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
      */  
		
		int n = 5, i, j, num = 1, gap;
		 
        gap = n - 1;
 
        for ( j = 1 ; j <= n ; j++ )
        {
        num = j;
         
        for ( i = 1 ; i <= gap ; i++ )
            System.out.print(" ");
         
        gap --;
         
        for ( i = 1 ; i <= j ; i++ )
        {
            System.out.print(num);
            num++;
        }
        num--;
        num--;
        for ( i = 1 ; i < j ; i++)
        {
            System.out.print(num);
            num--;
        }
        System.out.println();
        }
	// Array descending order

 	   ArrayList<String> arraylist = new ArrayList<String>();
 	   arraylist.add("AA");
 	   arraylist.add("ZZ");
 	   arraylist.add("CC");
 	   arraylist.add("FF");
 	
 	   // Unsorted List: ArrayList content before sorting
 	   System.out.println("Before Sorting:");
 	   for(String str: arraylist){
 			System.out.println(str);
 		}

 	   // Sorting in decreasing order
 	   Collections.sort(arraylist, Collections.reverseOrder());

 	   //Sorted List in reverse order
 	   System.out.println("ArrayList in descending order:");
 	   for(String str: arraylist){
 		   System.out.println(str);
 	  
 	}
	}

}
