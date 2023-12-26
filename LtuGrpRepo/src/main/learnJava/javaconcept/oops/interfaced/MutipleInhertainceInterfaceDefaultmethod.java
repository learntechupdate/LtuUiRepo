package javaconcept.oops.interfaced;

interface Demo{
	default void show()
	{
		System.out.println("In Demo Interface");
	}
}

interface DemoII{
	
	default void show()
	{
		System.out.println("In DemoII Interface");
	}
	
}


class MultipleIntefaceInher implements Demo,DemoII{

	
	//Solution 1 
//	public void show(){
//		
//		System.out.println("In MultipleIntefaceInher Class");
//	}
	
	//Solution 2
	
	@Override
	public void show() {
		// TODO Auto-generated method stub
		Demo.super.show();
	}
	
	
	
	
}



public class MutipleInhertainceInterfaceDefaultmethod {
	
	
	
	public static void main(String[] args) {
		
		MultipleIntefaceInher objref=new MultipleIntefaceInher();
		
		objref.show();
		
		
		
	}
	
	
	

}
