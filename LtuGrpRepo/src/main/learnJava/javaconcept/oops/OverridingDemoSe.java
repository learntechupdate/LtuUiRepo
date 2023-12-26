package javaconcept.oops;

class Animal{
	
	public void sound() {
		System.out.println("Animal Sound");
	}
	
} 

class Dog extends Animal{
	
	@Override
	public void sound() {
//		super.sound();
		System.out.println("Dog barks");
	}
	
	public void sound(String DogName) {
		System.out.println(DogName+"Dog barks");
	}
}

public class OverridingDemoSe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Dog d = new Dog();
		d.sound();
		d.sound("Tom");
		
		
	}

}
