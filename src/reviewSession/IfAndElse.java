package reviewSession;

import java.util.Scanner;

public class IfAndElse {

	public static void main(String[] args) {
		System.out.println("What is the color of the light?");
		Scanner sc = new Scanner(System.in);
		String trafficLight = sc.nextLine();
		System.out.println("is there any stop sign");
		boolean sign = sc.nextBoolean();
		if (trafficLight.equalsIgnoreCase("red") || sign == true) {
			System.out.println("take your brake");
			System.out.println("Stop the car");
			System.out.println("eat your food");
		}
		else if (trafficLight.equalsIgnoreCase("yellow"))
		{
			System.out.println("You need to slow down buddy");
		}

	}

}
