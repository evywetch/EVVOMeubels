package DAO;

import java.util.List;

import Rsvier.evvo.medel.Address;
import Rsvier.evvo.medel.Person;

public interface CustomerDAO {

	public List<Person> getAllCustomers();
	public Person getCustomer(int customerId);
	public void createCustomer(Person customer);
	public void updateCustomer(Person customer);
	public void deleteCustomer(Person customer);
}
