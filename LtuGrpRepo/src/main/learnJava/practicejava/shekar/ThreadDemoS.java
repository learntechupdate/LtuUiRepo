package practicejava.shekar;



class Hi extends Thread{
	
	public void run() {
		
	for (int i = 0; i<5; i++) {
		System.out.println("Bangalore");
        try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	}
}
class Hello extends Thread{
	
	public void run() {
		
	for (int j = 0; j<5; j++) {
		System.out.println("Mumbai");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	}
}


public class ThreadDemoS {
	
		
	public static void main(String[] args) throws InterruptedException {
		
		Hi bang = new Hi();
//		bang.run();
		
		Hello mum = new Hello();
//		mum.run();
		
		bang.start();
		Thread.sleep(10);
		mum.start();
		
		
	}

}
