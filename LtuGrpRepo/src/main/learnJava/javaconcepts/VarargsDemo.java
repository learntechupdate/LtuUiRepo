package javaconcepts;

class Calc{
	
	public void add (int ...n)// this will feed as array
	{		
		int sum=0;
		
		for (int i = 0; i < n.length; i++) {
			sum=sum+n[i];
			
		}
		System.out.println(sum);
		
	}
}

public class VarargsDemo {
	
	public static void main(String[] args) {
		
		Calc xy = new Calc ();
		xy.add(4,6, 5);
		
	}

}
