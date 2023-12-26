package practicejava.riyaz;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Student implements Comparable<Student>{
	int rollNo;
	int marks;
	String studentName;
	
	public Student(int rollNo, int marks, String studentName) {
		super();
		this.rollNo = rollNo;
		this.marks = marks;
		this.studentName = studentName;
	}

	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", marks=" + marks + ", studentName=" + studentName + "]";
	}
	
	
	
	@Override
	public int compareTo(Student o) {
		
		return marks>o.marks?1:-1;
		
		
	}

	
	
}


public class ComparableDemo {
	
	public static void main(String[] args) {
		
		
		List<Student> result= new ArrayList<>();
		
		result.add(new Student(101,100, "a"));
		result.add(new Student(102, 2100, "b"));
	    result.add(new Student(103,300, "c"));
	
//	Collections.sort(result);
	Collections.sort(result,(i,j)-> i.rollNo>j.rollNo?1:-1);
	
	for (Student op : result) {
		System.out.println(op);
	}
	
	}
	
	
	
	
	
	
	
	
	
	
	

}
