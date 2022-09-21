package pack;

public class BinarySearchExample {
	//teh basic idea is to split the list in half and again in the side it's in over and over until there's only one left
	//*only* for searching sorted lists, otherwise it breaks everything
	
	
	public static int binarySearch(int[] arr, int key)
	{

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
			}
			else
			{
				return mid;
			}

		}
//		return -1;
	}
	
	

}
