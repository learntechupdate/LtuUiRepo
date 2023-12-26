package javaconcept.oops.interfaced;

import org.openqa.selenium.WebDriver;

//example webdriver
interface Writer{
	
	 void write();
}





//firefox
class Pen implements Writer
{
       
	public void write() {
		System.out.println("writing using pen");
	}

		
	
}
//chrome
class Pencil implements Writer
{

	@Override
	public void write() {
		
		
		System.out.println("writing using Pencil");
	}

	
	
}


//remote
class Kit{
	
	public void startWriting(Writer classref) {
		
		classref.write();
	}
}


public class InterfaceDemo {
    
	public static void main(String[] args) {
		
		Writer p = new Pen();
		Writer c = new Pencil();
		
		Kit k= new Kit();
		
		k.startWriting(p);
		k.startWriting(c);
		
	}
	
	
	
	
	
}
