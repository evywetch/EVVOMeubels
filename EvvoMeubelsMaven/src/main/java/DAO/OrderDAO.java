package DAO;

import java.util.List;

import Rsvier.evvo.medel.Address;
import Rsvier.evvo.medel.Order;

public interface OrderDAO {

	public List<Order> getAllAddresses();
	public Order getAddress(int orderId);
	public void createAddress(Order order);
	public void updateAddress(Order order);
	public void deleteAddress(Order order);
}
