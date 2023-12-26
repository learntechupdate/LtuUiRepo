package javaconcept.oops.interfaced;


interface StaticInteface{
	
	   int var = 12;//this is nothing but -> public static final int var = 12;
	 static void staticMethod() {
		System.out.println("staticMethod exe");
	}
}


public class StaticMethodNvariableinIntefaceDemo {
	
	public static void main(String[] args) {
		
		StaticInteface.staticMethod();
		
		System.out.println("StaticInteface variable "+StaticInteface.var);
		
	}

}
