package sessions;


public class SortIntArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub Assignment8
		int[] arr = new int[]{0, 1, 3, 4,9, 7, 2, 6, 5};
		System.out.print(arr[0]+ " ");
		sortGivenIntArray(arr);
	
System.out.println(" is the sorted list, sort performed by For loop");
	}
	public static void sortGivenIntArray(int[]n) {
		int[] arr = new int[]{0, 1, 3, 4,9, 7, 2, 6, 5};
			int temp=0;
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
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
				}
				System.out.print(arr[i]+ " ");
				}
			System.out.println(" is the sorted list, sort performed by For loop");
	}
	public static void GenerateRandom500(){
	//	Set<Integer> myset = new tree
	}
	public static void StringPro() {
		
	}
}
		
	


