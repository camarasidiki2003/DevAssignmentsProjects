package reviewSession;

public class ForEachLoop {
	public static void main(String[] args) {
		
		String a = "apple";
		char[] myArray= a.toCharArray();
		int [] myNumbers = {12, 23, 52, 68, 36, 88, 98};
		int count = 0;
		String [] names = {"Rom", "Tom", "Romo", "Sid", "Abdoul","Raymond", "Bintou"};
		for (int item: myNumbers) {
			System.out.println(item);
			
		}
		for (String item: names) {
			if(count == 1)
				continue;
		System.out.println(item);
		count++;
		}
		System.out.println(count);
		
	
}	
}