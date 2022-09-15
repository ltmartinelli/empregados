package entities;

import java.util.List;
import java.util.ArrayList;

public class Department {
	
	public String name;
	public int payday;
	public Address address;
	public List<Employee> employeeList = new ArrayList<>();
	
	public void addEmployee(Employee employee) {
		employeeList.add(employee);
	}
	
	public void removeEmployee(Employee employee) {
		employeeList.remove(employee);
	}
	
	public double payRoll() {
		double sum = 0;
		
		for(Employee emp : employeeList) {
			sum += emp.salary;
		}
		
		return sum;
		
	}	

}
