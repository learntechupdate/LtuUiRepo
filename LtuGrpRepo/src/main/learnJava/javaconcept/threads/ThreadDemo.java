package javaconcept.threads;

class Hi extends Thread{
	
	public void run() {
		
		for (int i = 0; i < 5; i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("Hi");
		}
		
	}
}

class Hello extends Thread{
	
	public void run() {
		for (int i = 0; i < 5; i++) {
			try {Thread.sleep(1000);} catch (InterruptedException e) {}
			System.out.println("Hello");
		}
	}
}




public class ThreadDemo {
	
	public static void main(String[] args) throws InterruptedException {
		
		Hi obj1 = new Hi();
		Hello obj2 = new Hello();
		
		obj1.start();
		Thread.sleep(10);
		obj2.start();
		
//		obj1.run();
//		obj2.run();
		
	}

}
