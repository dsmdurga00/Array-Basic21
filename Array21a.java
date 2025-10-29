package arrays;

public class Array21a {

	public static void main(String[] args) {

       System.out.println("program for Performing Insertion sort in String Array........\n");
       
       String [] arr = {"Durga","Mohanty","Aman", "Roshan","Banu"};
       
       for(int i=1; i<arr.length; i++)
       {
    	   String temp = arr[i];
    	   int j = i-1;
    	   
    	   while(j>=0 && arr[j].compareTo(temp) > 0)
    	   {
    		   arr[j+1] = arr[j];
    		   j--;
    	   }
    	   
    	   arr[j+1] = temp;
       }
       
       for(String x : arr)
       {
    	   System.out.print(x + " ");
       }
	}

}
