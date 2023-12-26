package javaIQ;

/*
 // Array of week days
  const days = ['Mon', 'Tue', 'Wed', 'Thu','Fri','Sat','Sun'];
  
  // Find index of input day "d"
  const dIndex = days.indexOf(d);
  
  // Take add "x" offset to index of "d", and apply modulo % to
  // revolve back through array
  const xIndex = (dIndex + x) % days.length;
  
  // Return the day for offset "xIndex"
  return days[xIndex];
  
}
 */

/*
logic
 20%7= Q2 R is 6
 */




public class FuctionsforDaysandlater {
	
	public static String solution(String day,int k) {
        //creating array of days
		
        String days[]= {"Mon","Tue","Wed","Thu","Fri","Sat","Sun"};
        int n=0;
        //checking day in which index
        if(day.equalsIgnoreCase(days[0]))
                n=0;
        else if(day.equalsIgnoreCase(days[1]))
                n=1;
        else if(day.equalsIgnoreCase(days[2]))
                n=2;
        else if(day.equalsIgnoreCase(days[3]))
                n=3;
        else if(day.equalsIgnoreCase(days[4]))
                n=4;
        else if(day.equalsIgnoreCase(days[5]))
                n=5;
        else if(day.equalsIgnoreCase(days[6]))
                n=6;
        //finding position of resultant index
        k=(k+n)%7;//3
        //return string
        return days[k];//3-1 =2
}





    public static void main(String[] args) {
            //test
            System.out.println(solution("Tue", 1));
            System.out.println(solution("Test", 2));
//            System.out.println(solution("0", 3));
            
    }
    

}