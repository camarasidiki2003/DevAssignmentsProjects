package reviewSession;

public class SwitchCase {

	public static void main(String[] args) {
		String day = "Sunday";
		
		switch(day) {
		case "Monday":
		 System.out.println("Work");
		 break;
		case "Tuesday":
			 System.out.println("Work");
			 break;
		case "Wednesday":
			 System.out.println("Work");
			 break;
		case "Tursday":
			 System.out.println("Work");
			 break;
		case "Friday":
			 System.out.println("Prayer");
			 break;
		case "Saturday":
			 System.out.println("Party is here");
		case "Sunday":
			 System.out.println("Monday is coming again");
			 break;
			 default:
				 System.out.println("Whatever man");
		}
	}

}
