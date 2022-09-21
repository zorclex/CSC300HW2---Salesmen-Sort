package pack;

public class TestLinearSort {
	/* collapse me I'm unimportant
	 * linear sort/linear search, idk.
	 * 
//	public static int linearSearch_int(int[] arr, int key)
//	{
//		int found = -1;
//		
//		for (int i = 0; i < arr.length; i++)
//		{
//			if (arr[i] == key)
//			{
//				found = i;
//				break;
//			}
//		}
//		return found;
//	}
	
	//string search
//	public static int linearSearch_str(String str, char key)
//	{
//		int found = -1;
//		
//		for (int i = 0; i < str.length(); i++)
//		{
//			if (str.charAt(i) == key)
//			{
//				found = i;
//				break;
//			}
//		}
//		return found;
//	}
	
	
//	//I honestly don't remember what this was but it was in class on day... 5? Ich errine mich nicht.
//	public static String ReplaceWithSpace(String input)
//	{
//		String result = " ";
//		for(int i = 0; i > input.length(); i++)
//		{
//			//use a conditional to ensure that special character are in-bounds, then replace any found with whitespace
//			String allowChar = "abcdefghijklmnopqrstuvwxyz ABCDEFGHIJKLMNOPQRSTUVWXYZ";
//			if(allowChar.indexOf(input.charAt(i)) >= 0)
//			{
//				result = result + input.charAt(i);
//			}
//			
//			
//		}
//		
//		
//		return result;
//	}
//	
//	public static String SplitStringWithSpace(String input)
//	{
//		return "cabbage"; 
//	}
	*/
	
	
	
	public static boolean isAllUniqueChar(String str)
	{
//		boolean isSame = false; //these two are irrelevant at this point, because we can just return true if we find a dublicate. 
//		char currentCharToCompare = 'a';
		for(int i = 0; i < str.length(); i++)
		{
//			currentCharToCompare = str.charAt(i);
			for(int j = i + 1; j < str.length(); j++)
			{
				if (str.toUpperCase().charAt(i) == str.toUpperCase().charAt(j))
				{
//					isSame = true;
					return false;
				}
			}
		}
				
		return true; //no longer isSame, because that'd be pointless
		//cabbage
	}
	
	
}




/*

loop i through string
compare i to everything looped after i
if the same, trigger becomes true and loop breaks
if false, trigger stays false and i incriments to next option

	



*/