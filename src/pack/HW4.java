package pack;

public class HW4 {
	
	public static int uniqueSubStringCount(String str, String key)
	{
		//commented lines are for testing usage, they can be ignored.
//		System.out.println("in uniqueSubStringCount");
		int uniqueOccurences = 0;
		String separateWords[] = splitStringAtSpace(str);
//		System.out.println("teh length of SplitStrinfg is: " + separateWords.length);
		for(int i = 0; i < separateWords.length; i++ ) 
		{
//			System.out.println("in uniqueSubStringCount loop");
//			System.out.println(separateWords[i]);
			if(stringCompareIgnoreCase(key, separateWords[i]))
			{
//				System.out.println("in if statement");
				uniqueOccurences++;				
			}
		}
//		System.out.println("returning uniqueSubStringCount");
		return uniqueOccurences;
	}
	
	//compares two strings and returns true if they are the same or not
	public static boolean stringCompareIgnoreCase(String s1, String s2) //from Blade in class
	{
		return s1.toLowerCase().equals(s2.toLowerCase());
	}
	
	//takes a String, and returns an array of strings, splitting them up by the spaces they have between them
	public static String[] splitStringAtSpace(String input) 
	{
//		System.out.println("in splitStringAtSpace");
		return input.split("[ ?!,]+");
	}
	
	
}
