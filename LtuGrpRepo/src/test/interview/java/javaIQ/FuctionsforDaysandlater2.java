package javaIQ;


 /*
  * Enhacment for the Days reading properly
  * to enchance equal ignore case
  */


public class FuctionsforDaysandlater2 {
	
	
	
	public static String solution(String day,int k) {
		
		String resultday = "";
        //creating array of days
		if(day.equalsIgnoreCase("Mon")|
				day.equalsIgnoreCase("Tue")|
				day.equalsIgnoreCase("Wed")|
				day.equalsIgnoreCase("Thu")|
				day.equalsIgnoreCase("Fri")|
				day.equalsIgnoreCase("Sat")|
				day.equalsIgnoreCase("Sun")|
				k>=0&&k<=500
				) {
			
           String days[]= {"Mon","Tue","Wed","Thu","Fri","Sat","Sun"};
	        
	        int n=0;
	        //checking day in which index
	        if(day.equalsIgnoreCase(days[0])) 	        	
	                n=1;	       
	        else if(day.equalsIgnoreCase(days[1]))
	                n=2;
	        else if(day.equalsIgnoreCase(days[2]))
	                n=3;
	        else if(day.equalsIgnoreCase(days[3]))
	                n=4;
	        else if(day.equalsIgnoreCase(days[4]))
	                n=5;
	        else if(day.equalsIgnoreCase(days[5]))
	                n=6;
	        else if(day.equalsIgnoreCase(days[6]))
	                n=7;
	        //finding position of resultant index
	        k=(k+n)%7;
	        resultday = days[k-1];//
	        System.out.print("Your result day is :  ");
		}
		else
		{
			System.err.println("You have Entered Invalid data"+"[day=]"+day+ "[K value in b/w 0 to 500 ="+k);
		}
		
		 
	        //return string
	        return resultday;
		
       
}





    public static void main(String[] args) {
            //test
    	    
            System.out.println(solution("MON", 600));
//            System.out.println(solution("TWO", 3));
//            
            
            
    }
    

}