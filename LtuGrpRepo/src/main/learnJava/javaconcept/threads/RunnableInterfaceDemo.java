package javaconcept.threads;


class FreeBike 
{
	static
	{
		System.out.println("static block : Free bike in Bangalore");
	}
	public FreeBike() {
		System.out.println("Consttor calling - Object creation");
	}
	
}

class Bounce extends FreeBike implements Runnable{
	
	public void run() {
		for (int i = 0; i < 5; i++) {
			try {Thread.sleep(1000);} catch (InterruptedException e) {}
			System.out.println("Bounce running");
		}
	}
}


class Rapido extends FreeBike implements Runnable{
	
	public void run() {
		for (int i = 0; i < 5; i++) {
			try {Thread.sleep(1000);} catch (InterruptedException e) {}
			System.out.println("Rapido running");
		}
	}
}



public class RunnableInterfaceDemo {
	
	public static void main(String[] args) throws InterruptedException {
		
		Runnable fb = new Bounce();
		Runnable fr = new Rapido();
		
		Thread t1=new Thread(fb, "bounce");//passing the name in 
		System.out.println("Thread Name : "+t1.getName());
		Thread t2=new Thread(fr);
		
		t1.start();
		Thread.sleep(10);
		t2.start();
		
	}

}
