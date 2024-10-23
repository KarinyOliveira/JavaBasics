public class Chickens01 {
    public static void main(String[] args) {
        //Put yout code here
    	
        float eggsPerChicken = 5;
        float chickenCount = 3;
        float totalEggsM, totalEggsT, totalEggsW, totalEggs  = 0;
        
        System.out.println("------------Case 1--------------");
        
        //Monday
        totalEggsM = eggsPerChicken * chickenCount;
    	System.out.printf("Total of Eggs Monday: %.2f \n",totalEggsM);    
    	
    	//Tuesday
    	chickenCount = chickenCount+1;;
    	totalEggsT = eggsPerChicken * chickenCount;
    	System.out.printf("Total of Eggs Tuesday: %.2f \n",totalEggsT);
    	
    	//Wednesday
    	chickenCount = chickenCount/2;
    	totalEggsW = eggsPerChicken * chickenCount;
    	System.out.printf("Total of Eggs Wednesday: %.2f \n",totalEggsW);
    	totalEggs = totalEggsM + totalEggsT + totalEggsW; 
    	
    	System.out.printf("Total of Eggs Week: %.2f \n",totalEggs);
    	
        System.out.println("------------Case 2--------------");

        eggsPerChicken = 4;
        chickenCount = 8;
        
    	//Monday
        totalEggsM = eggsPerChicken * chickenCount;
    	System.out.printf("Total of Eggs Monday: %.2f \n",totalEggsM);    
    	
    	//Tuesday
    	chickenCount = chickenCount+1;;
    	totalEggsT = eggsPerChicken * chickenCount;
    	System.out.printf("Total of Eggs Tuesday: %.2f \n",totalEggsT);
    	
    	//Wednesday
    	chickenCount = chickenCount/2;
    	totalEggsW = eggsPerChicken * chickenCount;
    	System.out.printf("Total of Eggs Wednesday: %.2f \n",totalEggsW);
    	totalEggs = totalEggsM + totalEggsT + totalEggsW; 
    	
    	System.out.printf("Total of Eggs Week: %.2f \n",totalEggs);

    	
    	
    	
    }   
}
