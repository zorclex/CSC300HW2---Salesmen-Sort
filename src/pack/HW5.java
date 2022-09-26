package pack;

public class HW5 {
	
	//search a matrix for a particular entry using Binary Search within a binary search
	//inner element is going to be 
//	public static String binarySearchForGrid (int[][] arr, int key) //this whole section is a failed attempt at what binary2 is now, left for posterity
//	{
//		int y = 0; //outer(first) element
//		int x = 0; //inner(second element
//		
//		//search outer array elements
//		//this requires us to search the inner elements for the key- because it's binary search this is basically fine. 
//		
//		
//		//inner elements
//		
//		
//		return "The key is at arr[" + y + "] [" + x + "]. ";
//	}
	
	public static int binarySearch(int[] arr, int key)
	{
		//returns the position of key in the array arr. mid is the position, while key itself is the value
		int low = 0;
		int high = arr.length;
		int mid = (low + high) /2;
		while (true) 
		{
			if (arr[mid] > key)
			{
				high = mid -1;
				mid = (low + high) /2;
			}
			else if (arr[mid] < key)
			{
				low = mid +1;
				mid = (low + high) /2;
			} else if (arr[mid] == key)
			{
				return mid;
			}
			else
			{
				return -1;
			}

		}
	}
	
	public static String binarySearch2(int[][] arrY, int key)
	{
		//returns the String coordinates of key in the array arr. mid is the position, while key itself is the value.
		int low = 0;
		int high = arrY.length;
		int mid = (low + high) /2;
		int innerCord = 0;
		
		while (true) 
		{
			if (arrY[mid][0] > key) //check the lowest of mid against key to see if it's too high
			{
				high = mid -1;
				mid = (low + high) /2;
			}
			else if (arrY[mid][arrY[mid].length-1] < key) //check the highest of mid against key to see if it's too low
			{
				low = mid +1;				
				mid = (low + high) /2;
			}
			else
			{
				innerCord = binarySearch(arrY[mid], key);
				return (mid +", " + innerCord);
			}
		}
	}
	//cabbage
}