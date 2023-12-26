package javaconcept.oops;

class A{
	
	public A(){
		System.out.println("Default Constructor A");
	}
	
	A(String s){
		System.out.println("Parameterized Constructor A " +s);
	}
	
}

class B extends A{
	
      B(){
    	  //super("JSpider");//This calls the A Class's Parameterized Constructor
    	  
    	  System.out.println("Default Constructor B");
	}
      
      B(String s){
    	  
			    	super("Asipder");//This calls the A Class's Parameterized Constructor
			    	
			  		System.out.println("Parameterized Constructor B "+s);
      			 }
}

class C extends B{
	
    C(){
  	  System.out.println("default C con");
	}
    
    C(int i){
    	  super("Cdip");
    	  System.out.println("c i con"+i);
  	}
    
    
}


public class SuperDemo {

	public static void main(String[] args) {
		
		//B obj = new B("QSipder");
		B obj1 = new B();
		
		//C obj11=new C(5);
	}
}
