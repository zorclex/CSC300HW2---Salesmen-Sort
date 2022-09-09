package pack;

public class Salesman 
{
	public String name;
	public float salesTotal;
	
	public Salesman(String name, float salesTotal) 
	{
		this.name = name;
		this.salesTotal = salesTotal;
		System.out.println("salesman " + this.name + " created!");
	}
	
	public static Salesman[] topFive(Salesman[] list) 
	{
		Salesman top5[] = new Salesman[5];
		int count = 0;
		int smallest = 0; //position of the lowest salesTotal in list
		
		for (int i = 0; i < list.length; i++) //ignores the first run?
		{
			Salesman currentSales = list[i];
			
			if (count < 5) //populates the top5 list, irrelevant after first run
			{
				top5[count] = list[i];
				count++;
			} 
			else 
			{
				for (int j = 1; j < 5; j++ ) 
				{
					if (top5[j].salesTotal < top5[smallest].salesTotal) // find the lowest one in top5
					{
						smallest = j;
					}
				}
				
				if (top5[smallest].salesTotal < currentSales.salesTotal) 
				{
					top5[smallest] =  currentSales;
//					smallest++; //idk?
				}
			}
		}
		
		Salesman orderedTop5[] = new Salesman[5];

		for (int i = 0; i < top5.length; i++) 
		{
			int highest = 0;
			for (int j = 1; j < 5; j++) 
			{
				if (top5[j].salesTotal > top5[highest].salesTotal) // find the highest one in top5
				{
					highest = j;
				}
			}
			orderedTop5[i] = top5[highest];
			top5[highest].salesTotal = -1;
		}
		
		return orderedTop5;
	}
	
//	private Salesman[] orderedTop5(Salesman[] list) 
//	{
//		Salesman orderedTop5[] = new Salesman[5];
//
//		for (int i = 0; i < 5; i++) 
//		{
//			int highest = 0;
//			for (int j = 0; j < 5; j++ ) 
//			{
//				if (list[j].salesTotal > list[highest].salesTotal) // find the lowest one in top5
//				{
//					highest = j;
//				}
//			}
//			orderedTop5[i] = list[highest];
//			list[highest] = null;
//		}
//		
//		
//		return orderedTop5;
//		
//	}
//	
	
	
	
	
}