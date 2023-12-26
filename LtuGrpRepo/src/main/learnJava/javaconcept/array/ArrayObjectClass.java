package javaconcept.array;

class StudentClass {

	static int rollNo;
	String studentName;
	
	StudentClass() {
		
	}
	
}

public class ArrayObjectClass{
	
	 public static void main(String[] args) {
		
	StudentClass ss0= new StudentClass();
	StudentClass ss1= new StudentClass();
	StudentClass s2= new StudentClass();
	StudentClass s3= new StudentClass();
	
	
	StudentClass a[] = {ss0,ss1,s2,s3};
	
	a[0].rollNo=3;
	a[0].studentName="Qbuddiess@2";
	
	for (Object e : a) {
		
		System.out.println(e);		
		
		
	}
	
	
	 }
	
}