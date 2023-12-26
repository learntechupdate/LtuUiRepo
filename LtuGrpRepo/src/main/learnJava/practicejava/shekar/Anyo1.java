package practicejava.shekar;

interface GI{
	public void show();
}


public class Anyo1{
	public static void main(String[] args) {
		
		GI obj = new GI() {
			public void show() {
				System.out.println("Test");
			}
		};
		
		obj.show();
	}
}








	

