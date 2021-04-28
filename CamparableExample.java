package employeeComparator;

import java.util.Set;
import java.util.TreeSet;

public class CamparableExample {
	
	public static void main(String[] args) {
		new CamparableExample().comparableStudent();
		
	}
	
	void comparableStudent(){
		Student st = new Student(3, "C");
		Student st1 = new Student(2, "B");
		Student st2 = new Student(1, "A");
		
		Set<Student> stdSet = new TreeSet<>();
		stdSet.add(st);
		stdSet.add(st1);
		stdSet.add(st2);
		
		System.out.println("\n********************** Sorting by Student's Id **********************");
		for (Student student : stdSet) {
			System.out.println(student);
		}
		
	}

}

class Student implements Comparable<Student> {
	int stdId;
	String stdName;
	
	public Student(int stdId, String stdName) {
		super();
		this.stdId = stdId;
		this.stdName = stdName;
	}

	public int getstdId() {
		return stdId;
	}

	public void setstdId(int stdId) {
		this.stdId = stdId;
	}

	public String getstdName() {
		return stdName;
	}

	public void setstdName(String stdName) {
		this.stdName = stdName;
	}

	@Override
	public String toString() {
		return "Student [stdId=" + stdId + ", stdName=" + stdName + "]";
	}

	@Override
	public int compareTo(Student o) {
		return this.getstdName().compareTo(o.stdName);
	}
	
	
	
}