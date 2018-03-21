package DAO;

import java.util.List;

import Rsvier.evvo.medel.Address;
import Rsvier.evvo.medel.Order;

public interface OrderDAO {

	public List<Order> getAllOrders();
	public Order getOrder(int orderId);
	public void createOrder(Order order);
	public void updateOrder(Order order);
	public void deleteOrder(Order order);
}
