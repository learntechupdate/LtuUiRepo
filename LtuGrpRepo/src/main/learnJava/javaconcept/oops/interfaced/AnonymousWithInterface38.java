

package javaconcept.oops.interfaced;

interface XI{
	public void show();
}


//class XIE implements XI{
//	public void show()
//	{
//		System.out.println("Show method in Class XE");
//	}
//}


public class AnonymousWithInterface38 {

	public static void main(String[] args) {
		
				
//		XI obje = new XIE();
//		obje.show();
		
//		System.out.println("Anonymous Method is replacment of XE");
		
		XI obj2= new XI() {

			public void show() {
				System.out.println("Anynoums interface");
				
			}
			
		};
		
		obj2.show();
			               
		
	    
			
				
			
	}
	
}

	

