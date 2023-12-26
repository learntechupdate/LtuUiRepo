package javaconcept.threads;


class FreeCar 
{
	
	public FreeCar() {
//		System.out.println("FreeCar in Bangalore");
	}
	
}

class Uber extends FreeCar implements Runnable{
	
	public void run() {
		for (int i = 0; i < 5; i++) {
			try {Thread.sleep(1000);} catch (InterruptedException e) {}
			System.out.println("Uber running");
		}
	}
}


class Ola extends FreeCar implements Runnable{
	
	public void run() {
		for (int i = 0; i < 5; i++) {
			try {Thread.sleep(1000);} catch (InterruptedException e) {}
			System.out.println("Ola running");
		}
	}
}



public class ThreadJoinNAliveDemo {
	
	public static void main(String[] args) throws InterruptedException {
		
		Runnable fb = new Uber();
		Runnable fr = new Ola();
		
		Thread t1=new Thread(fb);
		Thread t2=new Thread(fr);
		
		
		t1.start();
		Thread.sleep(10);
		t2.start();
		
		System.out.println("Uber status : "+t1.isAlive());
		System.out.println("Ola status : "+t2.isAlive());
		t1.join();
		t2.join();
		
		
		System.out.println("Car is in Strike");
		
		System.out.println("Uber status: "+t1.isAlive());
		System.out.println("Ola status: "+t2.isAlive());
		
	}

}
