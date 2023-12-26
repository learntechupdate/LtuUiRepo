package practicejava.thoid;

import org.openqa.selenium.WebDriver;

//example webdriver
interface Writer{
	
	 void write();
}
interface Writer2{
	
	 void write2();
}


//firefox
class Pen implements Writer,Writer2
{
       
	public void write() {
		System.out.println("writing using pen");
	}

	@Override
	public void write2() {
		// TODO Auto-generated method stub
		
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


public class InterfaceDemoMultiImp {
    
	public static void main(String[] args) {
		
		Writer p = new Pen();
		Writer c = new Pencil();
		
		Kit k= new Kit();
		
		k.startWriting(p);
		k.startWriting(c);
		
	}
	
	
	
	
	
}
