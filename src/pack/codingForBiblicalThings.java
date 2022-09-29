package pack;

public class codingForBiblicalThings {
	
	
	
	public static void diciplesTimeToCompletion()
	{
		long population = 7700000000L;
		long disciples = 13;
		int years = 0;
		
		while(disciples < population)
		{
			disciples += (disciples*2); //if this is changed to 3, 13Bil disciples can be reached in 45 years. As 2, 15Bil disciples is reached in 57 years.
			years++; //iterated once per cycle, multiplied later to reflect time passage
			
			System.out.println("The current amount of disciples is " + disciples);				
		}
		years *= 3;
		System.out.println("The final amount of disciples is " + disciples + " and it was done in " + years + " years");
		
	} //cabbage
	
}
/*
 * Write functions in Java to answer each questions:

    Currently, there are about 7.7 billion human living on earth. Supporse there are 13 "true" disciples on the world, and they are starting to train disciples on their own. 
    If one can train 2 disciples in 3 year, and their disciples will immediately start to train their disciples. If there is no birth and death, how many years it takes to convert all human to be disciples of Christ.
    
    If we want to make it happen in 50 years, how many disciples should be trained together at a time?
 * 
 * 
 */