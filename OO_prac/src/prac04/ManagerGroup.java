package prac04;

import java.util.ArrayList;

public class ManagerGroup {

	private ArrayList<Employee> managers;
	
	public ManagerGroup() {
		managers = new ArrayList<Employee>();
	}

	public void addManager(Employee e) {
		managers.add(e);
	}
	
	public void removeManager(Employee e) {
		if (managers.contains(e))
			managers.remove(e);
	}

	public ArrayList<Employee> getManagers() {
		return managers;
	}
	
}
