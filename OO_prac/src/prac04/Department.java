package prac04;

import java.util.ArrayList;

public class Department {

	private String name;
	private ArrayList<Employee> employees;
	private ManagerGroup headQuarter;
	
	public Department(String name) {
		this.name = name;
		this.employees = new ArrayList<Employee>();
		this.headQuarter = new ManagerGroup();
	}

	public void assign(Employee e) {
		employees.add(e);
	}
	
	public void deassign(Employee e) {
		if(employees.contains(e))
			employees.remove(e);
	}
	
	public void assignManager(Employee e) {
		headQuarter.addManager(e);
	}
	
	public void deassignManager(Employee e) {
		headQuarter.removeManager(e);
	}
	
	public String getName() {
		return name;
	}

	public ArrayList<Employee> getEmployees() {
		return employees;
	}

}
