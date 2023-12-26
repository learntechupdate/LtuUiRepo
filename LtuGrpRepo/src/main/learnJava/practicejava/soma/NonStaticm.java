package practicejava.soma;

 class NonStaticm01 {

	public int sum(int a, int b)
    {
        return a + b;
    }
}
 
public class NonStaticm {
    public static void main(String[] args) //two
    {
        int a = 3, b = 6;
        NonStaticm01 ns = new NonStaticm01();
        int kss = ns.sum(a, b); //one
        // call the non-static method
 
        System.out.print("sum is = " + kss);
    }
}
