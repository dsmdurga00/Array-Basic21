package arrays;

public class Array21 {

	public static void main(String[] args) {
		
		System.out.println("Program for Performing Insertion Sort in Array.........\n");
		
		int[] arr = {50,20,5,80,45};
		
		
		for(int i=1; i<arr.length; i++)
		{
			int temp = arr[i];
			int j = i-1;
			
			while(j>=0 && arr[j] > temp)
			{
				arr[j+1] = arr[j];
				j--;
			}
			
			arr[j+1] = temp;
		}
		
		System.out.println("Sorted Array is ........\n");
		
		for(int x : arr)
		{
			System.out.print(x + " ");
		}
	}

}
