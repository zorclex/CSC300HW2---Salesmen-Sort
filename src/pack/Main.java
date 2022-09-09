package pack;

public class Main {

	public static void main(String[] args) {
		System.out.println("hi there");
		
		Salesman salesTeam[] = 
		{
			new Salesman("Adam",  87), 	//8th highest
			new Salesman("Bob",   250),	//6th highest
			new Salesman("Carol", 680), //3rd highest
			new Salesman("Dave",  150), //7th highest
			new Salesman("Eve",   925), //1   highest
			new Salesman("Fred",  725), //2nd highest
			new Salesman("Gary",  575), //4rd highest
			new Salesman("Harry", 345) 	//5th highest
		};
		System.out.println("====================================\n");
		
		
		Salesman refinedList[] = Salesman.topFive(salesTeam);
		for(int i = 0; i < refinedList.length; i++) 
		{
			System.out.println(refinedList[i].name);
		}
		
		
		
		
		
	}
	//cabbage
}
