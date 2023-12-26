package javaconcept.oops.interfaced;

/*
 from 1.8 jdk we can define method in interface but it should be default
If @FunctionInterface annotation will not throw error if it has one method declared with 'N' number of default method
We can overide the default method in implementation class
 */

@FunctionalInterface
interface DefaultDemoInterface{
	
	void show();
	
	default void display() {
		
		System.out.println("Default display");
	}
	
}

class DefaultImp implements DefaultDemoInterface
{

	@Override
	public void show() {
		System.out.println("Show in Default Implements1");
		
	}
	
}

class DefaultImp2 extends DefaultImp 
{

	@Override
	public void display() {
		System.out.println("display in Default Implements2");
		
	}
	
}

public class DefaultMethodInteface {
	
	
	public static void main(String[] args) {
		
		DefaultDemoInterface obj = new DefaultImp();
		
		obj.show();		
		obj.display();
		
		
		DefaultDemoInterface obj2 = new DefaultImp2();
		
		obj2.show();
		obj2.display();
		
		
		
	}

}
