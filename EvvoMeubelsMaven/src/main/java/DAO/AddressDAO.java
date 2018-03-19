package DAO;

import java.util.List;

import Rsvier.evvo.medel.Address;

public interface AddressDAO {

	public List<Address> getAllAddresses();
	public Address getAddress(int addressId);
	public void createAddress(Address address);
	public void updateAddress(Address address);
	public void deleteAddress(Address address);
}
