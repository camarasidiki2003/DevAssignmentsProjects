package sessions;
import java.util.Scanner;

public class Class4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
//IfandElse
		//System.out.println("what is the color of the light?");
		//Scanner ui= new Scanner(System.in);
		//String trafficLight=ui.nextLine();
		
		/*if(trafficLight.equalsIgnoreCase("red")) {
		   System.out.println("Stop the car");	
		   System.out.println("Take a break");
		   System.out.println("Check your messages");
		   System.out.println("eat your meal");
		}
		else {
			System.out.println("keeping driving");
		}
		System.out.println("hey");
*/
		//Usage of || &&
		/*if(((!trafficLight.equalsIgnoreCase("red")) || trafficLight.isEmpty()) || (trafficLight.charAt(0)=='R'))){
			   System.out.println("Stop the car");	
			   System.out.println("Take a break");
			   System.out.println("Check your messages");
			   System.out.println("eat your meal");
			}
			else {
				System.out.println("keeping driving");
			}
 			System.out.println("hey");	
			*/
		
		
		//SwithchCase
	/*	String day="sunday";
		switch(day){
		case "monday":
			System.out.println("work");
			break;
		case "Friday":
			System.out.println("party");
			break;
		case "sunday":
			System.out.println("Monday is here again");
		case "":
			System.out.println("whatever");
		*/
			
		/*System.out.println("wht is the color of the light?");
		Scanner ui2= new Scanner(System.in);
		  String day=ui.nextLine();
			switch(day.toLowerCase()){
			case "monday":
				System.out.println("work");
				break;
			case "Friday":
				System.out.println("party");
				break;
			case "sunday":
				System.out.println("Monday is here again");
			case "":
				System.out.println("whatever");
		}	*/
		//For Loop
		// print 5 times
		//1. For Loop: starting; end point; increment
		/*for(int i=0; i<=99; i= i+1) {
			System.out.println("****");
			System.out.println("Hey");
		}
	*/
		int b=1425542;
		String a = "apple";
		String c="Goddmorning yall";
		/*System.out.println(0);
		System.out.println(1);
		System.out.println(2);
		System.out.println(3);
		System.out.println(4);
	*/	//or with For loop
		//for(int i=0; i<a.length();i++) {
		//System.out.println(a.charAt(i));
		//System.out.println(a);
	//	String temp=b+"";// convert to String
		//}
		
		System.out.println("Please input your string to be reversed, make sure it is a strign otherwise the system will crash. we are not handling the exception yet. Thanks");
		String c2 = sc.nextLine();
			for(int i2=c2.length()-1; i2>=0; i2--) {
			System.out.print(c2.charAt(i2));
			
		}
		}
		
	

}
