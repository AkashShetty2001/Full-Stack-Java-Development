package interfaces.ComparatorAndComparable;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Collections;
import java.lang.Comparable;


class IdComparator implements Comparator<Employee>{
	public int compare(Employee o1,Employee o2) {
		return o1.getEmpId() - o2.getEmpId();
	}
}

class NameComparator implements Comparator<Employee>{
	public int compare(Employee o1,Employee o2) {
		return o1.getEmpName().compareTo(o2.getEmpName());
	}
}

class Employee implements Comparable<Employee>{
	
	@Override
	public int compareTo(Employee o) {
		return this.empName.compareTo(o.empName);
	}
	
	private int empId;
	private String empName;
	
	public Employee(int empId,String empName) {
		this.empId=empId;
		this.empName=empName;
	}
	
	public int getEmpId() {
		return this.empId;
	}
	public String getEmpName() {
		return this.empName;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + "]";
	}

	

	
	
}
public class EmployeeEx1 {
	public static void main(String args[]) {
		
		ArrayList<Employee> a= new ArrayList<>();
		a.add(new Employee(11,"Akash"));
		a.add(new Employee(6,"Nagaraju"));
		a.add(new Employee(3,"john"));
		a.add(new Employee (16,"ram"));
		
		
		Collections.sort(a);
		System.out.println(a);
		
//		Collections.sort(a,new IdComparator());
//		System.out.println(a);
//		
//		Collections.sort(a,new NameComparator());
//		System.out.println(a);
		
		
		
	}

}
