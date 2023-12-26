package practicejava.thoid;



class A1{
	
	int sum;

	public void add(int n1,int n2)
	{
		
		sum = n1+n2;
	    System.out.println(sum);
	}
	
}

class B1 extends A1{
	
	@Override
	public void add(int n1,int n2)
	{
//		int addresult = super.sum;
		System.out.print("Operation of add "+n1+"&"+n2+"=" );
		super.add(n1, n2);
	}
	
}
public class OverridingDemo {
	public static void main(String[] args) {
//		A1 b= new A1();
		B1 b= new B1();
		b.add(2,5);
		
		
	}

}
