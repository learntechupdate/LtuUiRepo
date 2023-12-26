package practicejava.soma;

public class StaticMethod {

	 
	
				public static int sum(int a, int b)
				{
					return a+b;
					
				}
				
					public static void main(String[] args) {
						int a=3, b=8;
						int s=sum(1, 1);
				        System.out.println("I if method is in same class we can just call the method name sum is = " + s);
				        int s2=StaticMethod.sum(a, b);
				        System.out.print("Calling useing class name.method name the sum is = " + s2);
					}
	}

