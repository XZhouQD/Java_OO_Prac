package prac03;

import java.util.ArrayList;

public class Department {

	private String name;
	private ArrayList<Employee> employees;
	
	public Department(String name) {
		this.name = name;
		this.employees = new ArrayList<Employee>();
	}

	public void assign(Employee e) {
		employees.add(e);
	}
	
	public void deassign(Employee e) {
		if(employees.contains(e))
			employees.remove(e);
	}
	
	public String getName() {
		return name;
	}

	public ArrayList<Employee> getEmployees() {
		return employees;
	}

}
