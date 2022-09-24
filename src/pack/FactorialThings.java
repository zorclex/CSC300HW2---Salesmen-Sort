package pack;

public class FactorialThings {
	
	//idk what these are I was distracted during class and I still have a lot of math to learn. 
	
	public static int factorial1(int n)
	{
		int total = 1;
		for (int i = n; i >0 ; i--)
		{
			total = total * i;
		}
		return total;
	}
	
	public static int factorial2(int n)
	{
		if (n == 1)
		{
			return n;
		} else
		{
			return factorial2(n-1) * n;
		}
		//T(n) = T(n) - 1    -> I think?
	}
	
	
	
}
