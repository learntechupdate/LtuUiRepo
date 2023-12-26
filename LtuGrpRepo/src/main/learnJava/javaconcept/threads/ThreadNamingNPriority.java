package javaconcept.threads;import java.util.PriorityQueue;

class Hit3 extends Thread{
	
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

class Hello3 extends Thread{
	
	public void run() {
		for (int i = 0; i < 5; i++) {
			try {Thread.sleep(1000);} catch (InterruptedException e) {}
			System.out.println("Hello");
		}
	}
}




public class ThreadNamingNPriority {
	
	public static void main(String[] args) throws InterruptedException {
		
		Hit3 obj1 = new Hit3();
		Hello3 obj2 = new Hello3();
		
		System.out.println("Thread priority : "+obj1.getPriority());
		System.out.println("Thread priority : "+obj2.getPriority());
		
		System.out.println(obj1.getName());
		System.out.println(obj2.getName());
		
		obj1.setName("Thread Hi");
		obj2.setName("Thread Hello");
		
		System.out.println(obj1.getName());
		System.out.println(obj2.getName());
		
//		obj1.setPriority(1);//0 will not take
//		obj2.setPriority(10);
		
//		obj1.setPriority(Thread.MIN_PRIORITY);
//		obj1.setPriority(Thread.MAX_PRIORITY);
//		obj1.setPriority(Thread.NORM_PRIORITY);
		
		System.out.println(obj1.getName()+ " Priority : "+obj1.getPriority());
		System.out.println(obj2.getName()+ " Priority : "+obj2.getPriority());
		
		
		
		obj1.start();
		Thread.sleep(10);
		obj2.start();

}
}