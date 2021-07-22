package javaComparatorOrComparable;
import java.util.*;

public class ComparatorAndComparable {

	static class Student implements Comparable<Student>{
		int rno;
		int ht;
		int wt;
		Student(int rno,int ht, int wt){
			this.rno = rno;
			this.wt=wt;
			this.ht = ht;
		}
		public int compareTo(Student o) {
//			for decreasing order -->
			return o.rno-this.rno;
			
		}
		public String toString() {
			return "rno = "+" " +this.rno+ " "+"ht = "+this.ht+ " "+"wt = "+this.wt;
		}
	}
	static class StudentHtComparator implements Comparator<Student>{
		public int compare(Student h1, Student h2) {
//			for increasing order -->
			return h1.ht-h2.ht;
//			for decreasing order -->
//			return h2.ht-h1.ht;
		}
	}
	static class StudentWtComparator implements Comparator<Student>{
		public int compare(Student h1, Student h2) {
			return h1.wt-h2.wt;
		}
	}
	public static void main(String[] args) {
//		for Comparator -->
	PriorityQueue<Student> pq = new PriorityQueue<>(1000,new StudentWtComparator());
//	for comparable -->
//	PriorityQueue<Student> pq = new PriorityQueue<>();
	
	pq.add(new Student(1,6,60));
	pq.add(new Student(2,5,68));
	pq.add(new Student(4,7,63));
	pq.add(new Student(3,6,65));

	
	pq.add(new Student(6,2,61));
	pq.add(new Student(5,4,69));
	
	while(pq.size()!=0)
	{
		System.out.println(pq.peek());
		pq.remove();
	}

	}

}
