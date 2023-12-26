package javaconcept.oops.interfaced;

public class ClassImplementingInterface implements InterfaceDemoI{

	public void show() {
		// TODO Auto-generated method stub
		System.out.println("Show Method");
	}

	public void display() {
		// TODO Auto-generated method stub
		System.out.println("Dispaly Method");
	}
	
    public static void main(String[] args) {
		
		InterfaceDemoI obj = new ClassImplementingInterface2();
		obj.show();
	}

}


 class ClassImplementingInterface2 extends ClassImplementingInterface{

	public void show() {
		System.out.println("Show Method2");
	}

	public void display() {
		System.out.println("Dispaly Method2");
	}


	
}


 
	 
	 
 