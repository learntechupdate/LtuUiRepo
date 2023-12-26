package javaconcept.oops;

class BasicCal{
	
	public int add(int i , int j) {
		
		return i+j;
	}
	
}

class AvdCal extends BasicCal{
	
	public int sub(int i , int j) {
		
		return i-j;
	}
	
}

class VerAdCal extends AvdCal
{
	
public int mul(int i , int j) {
		
		return i*j;
	}
	
}

public class InheritanceDemo {
	
	public static void main(String[] args) {
		
		VerAdCal cal=new VerAdCal();
		
		System.out.println(cal.add(5, 5));
		System.out.println(cal.sub(2, 3));
		System.out.println(cal.mul(6, 9));
		
	}

}
