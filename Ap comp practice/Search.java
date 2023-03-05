import java.util.*;
public class Search{
	public static void main(String[] args){
		int[] x = {1, 2, 3, 4, 5, 10, 11, 13, 14, 15, 20, 23, 24, 30};
		//System.out.println(seq(x, 9));
		System.out.println(binarySearch(x, 23, 0, x.length - 1));



	}

	public static int binarySearch (int [ ] arr, int value, int left, int right)
	{
	 while (left <= right)
	 {
		 System.out.println(".");
	 int middle = (left + right) / 2;
	 if ( value == arr [middle] )
	 return middle;
	 else if ( value < arr[middle] )
	 right = middle - 1;
	 else // if ( value > arr[middle] )
	 left = middle + 1;
	 }
	 return -1; // Not found
 	}

 	public static int seq(int[] arr, Object value)
	{
	 for (int i = 0; i < arr.length ; i++)
	 {
		 System.out.println(".");
	 if (value.equals(arr [i]))
	 return i;
	 }
	 return -1;
	}

}