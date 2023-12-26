

package javaconcept.oops;

class X{
	public void show()
	{
		System.out.println("Show method in Class X");
	}
}


class XE extends X{
	public void show()
	{
		System.out.println("Show method in Class XE");
	}
}



public class Anonymous37 {

	public static void main(String[] args) {
		
		X obj = new X();
		obj.show();
		
		X obje = new XE();
		obje.show();
		
//		System.out.println("Anonymous Method is replacment of XE");
		
		X obj2= new X()
				{
			         public void show()
			        {
				       System.out.println("Show method in Class Anonymous");
			        }
				
				};
			
		obj2.show();
	}
}