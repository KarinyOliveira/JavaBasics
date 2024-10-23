
public class Chickens02 {
	public static void main(String[] args) {
		
		int totalChickensM, totalChickensT, totalChickensW;
		int eggsDay = 3;
		double totalEggs = 0;
		
		//Eggs Monday
		totalChickensM = 10;
		System.out.println("Eggs on Monday: "+ totalChickensM * eggsDay);
		
		//Eggs Tuesday
		totalChickensT = totalChickensM * 2;
		System.out.println("Eggs on Tuesday: "+ totalChickensT * eggsDay);
		
		//Eggs Wednesday
		totalChickensW = totalChickensT/2;
		System.out.println("Eggs on Wednesday: "+ totalChickensW * eggsDay);
		
		//Total Eggs
		totalEggs = (totalChickensM * eggsDay) + (totalChickensT * eggsDay) + (totalChickensW * eggsDay);
		System.out.println("Total eggs on Week: "+ totalEggs);
		
		System.out.println("Money selling each egg $0.05: "+ totalEggs*0.05);
		
		
		
		float y=6.7F;
		System.out.println(y);
		int z=(int)y;
		System.out.println(z);
		
		int x = 25 - 5 * 4 / 2 - 10 + 4;

		System.out.println(x);
		
	}

}