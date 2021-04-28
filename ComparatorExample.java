package employeeComparator;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class ComparatorExample {

	public static void main(String[] args) {
		// methods calling
		new ComparatorExample().idComparator();
		new ComparatorExample().nameComparator();
		new ComparatorExample().addressComparator(); 
		/* in line implementation is used to for addressComparator method*/

	}
	
	// Method to sort employee by Id
	void idComparator(){
		
		Employee emp1 = new Employee(5, "R", "A");
		Employee emp2 = new Employee(3, "S", "P");
		Employee emp3 = new Employee(2, "K", "D");
		Employee emp4 = new Employee(1, "H", "T");
		Employee emp5 = new Employee(4, "V", "V");
		
		Set<Employee> empSet = new TreeSet<>(new ComparatorForId());
		empSet.add(emp1);
		empSet.add(emp2);
		empSet.add(emp3);
		empSet.add(emp4);
		empSet.add(emp5);
		System.out.println("\n********************** Sorting by employee's Id **********************");
		for (Employee employee : empSet) {
			System.out.println(employee);
		}
	}
	
	// Method to sort employee by Name
	void nameComparator(){
		
		Employee emp1 = new Employee(5, "C", "A");
		Employee emp2 = new Employee(3, "D", "P");
		Employee emp3 = new Employee(1, "A", "D");
		Employee emp4 = new Employee(2, "E", "T");
		Employee emp5 = new Employee(4, "B", "V");
		
		Set<Employee> empSet1 = new TreeSet<>(new ComparatorForName());
		empSet1.add(emp1);
		empSet1.add(emp2);
		empSet1.add(emp3);
		empSet1.add(emp4);
		empSet1.add(emp5);
		System.out.println("\n***************************** Sorting by Name *************************");
		for (Employee employee : empSet1) {
			System.out.println(employee);
		}
	}
	
	// Method to sort employee by Address, Using in line implementation
	void addressComparator(){
		
		Employee emp1 = new Employee(1, "R", "A");
		Employee emp2 = new Employee(9, "S", "E");
		Employee emp3 = new Employee(5, "K", "C");
		Employee emp4 = new Employee(3, "H", "B");
		Employee emp5 = new Employee(4, "V", "D");

		/* in line implementation */
		Set<Employee> empSet2 = new TreeSet<>(new Comparator<Employee>() {
			@Override
			public int compare(Employee o1, Employee o2) {
				return o1.empAddress.compareTo(o2.empAddress);
			}
		});
		empSet2.add(emp1);
		empSet2.add(emp2);
		empSet2.add(emp3);
		empSet2.add(emp4);
		empSet2.add(emp5);
		System.out.println("\n************************** Sorting by Address **************************");
		for (Employee employee : empSet2) {
			System.out.println(employee);
		}
	}

}

// Employee POJO class 
class Employee {
	int empId;
	String empName;
	String empAddress;
	
	public Employee(int empId, String empName, String empAddress) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empAddress = empAddress;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getEmpAddress() {
		return empAddress;
	}

	public void setEmpAddress(String empAddress) {
		this.empAddress = empAddress;
	}

	@Override
	public String toString() {
		return "empId = " + empId + ",   empName = " + empName + ",   empAddress = " + empAddress + "";
	}
	
	
	
}

// class of comparator for Id
class ComparatorForId implements Comparator<Employee>{

	@Override
	public int compare(Employee o1, Employee o2) {
		if (o1.empId == o2.empId)
		 return 0;
		else if(o1.empId < o2.empId)
			return -1;
		else
			return 1;
	}
	
}

// class for comparator for Name
class ComparatorForName implements Comparator<Employee> {
	
	@Override
	public int compare(Employee o1, Employee o2) {
		return o1.empName.compareTo(o2.empName);
	}
	
}


