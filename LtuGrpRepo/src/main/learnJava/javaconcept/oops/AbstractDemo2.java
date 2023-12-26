package javaconcept.oops;

class Printer{
	
	/*
	public void show(Integer i) {
		System.out.println(i);
	}
	
	public void show(Double i) {
		System.out.println(i);
	}
	*/
	
	public void show(Number i) {
		System.out.println(i);
	}
	
}


public class AbstractDemo2 {
	
	public static void main(String[] args) {
		
		Printer n = new Printer();
		n.show(1);	
		n.show(5.5);
	}

}
