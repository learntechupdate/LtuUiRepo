package javaconcept.oops.interfaced;

@FunctionalInterface
interface DefaultDemoInterfaceEnh{
	
	void show();
	
	default void display() {
		
		System.out.println("Default display");
	}
	
}



public class DefaultMethodInteface2 {
	
	
	public static void main(String[] args) {
		
	
		
		//anynoum class
		DefaultDemoInterfaceEnh obj = new DefaultDemoInterfaceEnh() {

			public void show() {
				System.out.println("Anynoums impletement");
				
			};
			
			@Override
			public void display() {
				
				System.out.println("Anynouls  default overide display");
			}
		};
		
		obj.show();
		obj.display();
		
		
		
		
		//Lambda expression
		
		
		DefaultDemoInterfaceEnh obj2 = () ->{
				System.out.println("Anynoums impletement");
				
				
			};
			
			//Net to check for default lamda expression overiding
//			public void display() {
//				
//				System.out.println("Anynouls  default overide display");
//			};
			
		
		obj2.show();
		obj2.display();
		
	}

}
