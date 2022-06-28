package sessions;
import java.util.Scanner;

public class Class2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  int a= 10;
		  int b= 20;
		  int d=a+b;
		  int c=30;
		  String f= "Techfios Class";
		  int g= 40;
//		    60
//		    0
//		    230 170
		//  .5 .9
		//  .2 2 
		//  0
		//  Techfios Class70
		//   70
		  
		  System.out.println(a+b+c);
		  System.out.println(a+b-c); 
		  System.out.println(a*b+c); 
		  System.out.println(a/b);
		  System.out.println(a%b);
		  System.out.println(d-a-b);
		  System.out.println(a+b+"    "+f+" "+a+b+g);
		  System.out.println(a+b+d+f);
		  System.out.println(" "+a+b+g);  
// practice
		  
		  System.out.println(" Hello Techfios");
			System.out.println("     Hello Techfios");
			System.out.println("");
			System.out.println("        Hello Techfios   ");
			System.out.println("          Hello Techfios");
			String name="Sidiki";
			String lastname="Camara";
			System.out.println("What is your name?");
			System.out.println("My name is:" +name);
			System.out.println("Thank you for your input Mr."+lastname);
			System.out.println("What is your full name Sir?");
			System.out.println("My fullname is " +name +lastname);
			String fullname=name+lastname;
			System.out.println("My full name is " +fullname);

			
		  
		  // scanner usage
		  
		  System.out.println("What is your name?");
		  Scanner userName= new Scanner(System.in);
		  String value=userName.nextLine();
		  //System.out.println(value);
		  System.out.println("What is your salary?");
		  Scanner userSalary= new Scanner(System.in);
		  int valueInt = userSalary.nextInt();
		  System.out.println(valueInt);

	/*	  // scanner again
		  System.out.println("What is your name?");
			Scanner userinput2= new Scanner(System.in);
			//String value=userinput.next();
	     	String value2=userinput2.nextLine();
			String value2=userinput2.nextLine(
			System.out.println(value);
			System.out.println(userInput2.nextLine());
		*/	//System.out.println(valueInt);
			

	}

}
