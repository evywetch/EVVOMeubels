package DAO;

import java.util.List;

import Rsvier.evvo.medel.Person;

public interface EmployeeDAO {

	public List<Person> getAllAddresses();
	public Person getAddress(int employeeId);
	public void createAddress(Person employee);
	public void updateAddress(Person employee);
	public void deleteAddress(Person employee);
}
