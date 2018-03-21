package DAO;

import java.util.List;

import Rsvier.evvo.medel.Person;

public interface EmployeeDAO {

	public List<Person> getAllEmployees();
	public Person getEmployee(int employeeId);
	public void createEmployee(Person employee);
	public void updateEmployee(Person employee);
	public void deleteEmployee(Person employee);
}
