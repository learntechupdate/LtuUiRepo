package javaconcept.oops.interfaced;

@FunctionalInterface
interface Abc
{
	public void show();

}

public class LambdaExpressionsInterface {

			public static void main(String[] args) {
				
			Abc obj = new Abc () {

				public void show() {
					System.out.println("Anyomniums Expressions");
					
				}		
				
			};
						
			obj.show();
			
			
			Abc obj2 = ()-> 
			               {
					          System.out.println("Anyomniums Lamda");	
					          System.out.println(10+12);
			               };
						
			obj2.show();
			
				
			}
}
