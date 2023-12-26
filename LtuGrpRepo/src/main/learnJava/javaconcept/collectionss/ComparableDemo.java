package javaconcept.collectionss;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Studen implements Comparable<Studen>{
	
	int rollNo, marks;
	String Sname;
	
	public Studen(int rollNo, int marks, String sname) {
		super();
		this.rollNo = rollNo;
		this.marks = marks;
		Sname = sname;
	}

	@Override
	public String toString() {
		return "Studen [rollNo=" + rollNo + ", marks=" + marks + ", Sname=" + Sname + "]";
	}
	
	public int compareTo(Studen sm) {
//		return marks>sm.marks?1:-1;
		return rollNo>sm.rollNo?1:-1;
		
	}
	

}

public class ComparableDemo {
		
	
	public static void main(String[] args) {
		
		List<Studen>  s = new ArrayList<>();
		s.add(new Studen(11, 240, "AAA"));
		s.add(new Studen(22, 430, "BBB"));
		s.add(new Studen(33, 340, "CCC"));
	
		Collections.sort(s);
//		Collections.sort(s,(i,j)-> i.rollNo>j.rollNo?1:-1);
		
		for (Studen studen : s) {
			
			System.out.println(studen);	
		}
		
		
	
	}
	
	
}








