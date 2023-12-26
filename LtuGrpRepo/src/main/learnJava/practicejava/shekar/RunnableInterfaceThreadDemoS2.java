package practicejava.shekar;

import java.util.Iterator;

class Cars{
	
	public Cars()
	{
		super();
		System.out.println("RentalCar");
	}
}


class Ola extends Cars implements Runnable{

	@Override
	public void run() {
		
		for (int i = 0; i < 5; i++) {
			
			System.out.println("Ola Running in Bangalore");
			try {
				Thread.sleep(1000);	} catch (InterruptedException e) {	}
		}
		
	}

	
	
	}

class Uber extends Cars implements Runnable  {

	@Override
	public void run() {
	  for (int j = 0; j <5; j++) {
		  System.out.println(" Uber Running in Mumbai");	
		  try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	}
	
	
}



public class RunnableInterfaceThreadDemoS2 {
	
		
	public static void main(String[] args) throws InterruptedException {
		
		Ola bang = new Ola();
//		bang.run();
		
		Uber mum = new Uber();
//		mum.run();
		
		Thread t1=new Thread(bang,"Ola service");	//thread name passed 	
		Thread t2=new Thread(mum);
		
//		System.out.println(t1.getName());
//		System.out.println(t2.getName());
		
		t1.setPriority(1);
		t2.setPriority(10);
		
		
		t1.start();
		Thread.sleep(10);
		t2.start();
		
		System.out.println("t1 thread is Alive Before join : "+t1.isAlive());
		
		t1.join();t2.join();
		
		System.out.println("car service has stopped");
		
		System.out.println("t1 thread is Alive After join : "+t1.isAlive());
		
		
	}

}
