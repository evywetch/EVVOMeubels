package Rsvier.evvo.medel;

import java.math.BigDecimal;
import java.time.LocalDate;


public class Order {

	private final int orderId;
	private final int customerId;
	private final int productId;
	private final int totalOrder;
	private final BigDecimal totalPrice;
	private final LocalDate orderDate;

	private Order(OrderBuilder builder) {
		this.orderId = builder.orderId;
		this.customerId = builder.customerId;
		this.productId = builder.productId;
		this.totalOrder = builder.totalOrder;
		this.totalPrice = builder.totalPrice;
		this.orderDate = builder.orderDate;

	}

	public static class OrderBuilder {

		private int orderId;
		private int customerId;
		private int productId;
		private int totalOrder;
		private BigDecimal totalPrice;
		private LocalDate orderDate;

		public OrderBuilder() {

		}

		public OrderBuilder orderId(int orderId) {
			this.orderId = orderId;
			return this;
		}

		public OrderBuilder customerId(int customerId) {
			this.customerId = customerId;
			return this;
		}

		public OrderBuilder productId(int productId) {
			this.productId = productId;
			return this;
		}

		public OrderBuilder totalOrder(int totalOrder) {
			this.totalOrder = totalOrder;
			return this;
		}

		public OrderBuilder totalPrice(BigDecimal totalPrice) {
			this.totalPrice = totalPrice;
			return this;
		}

		public OrderBuilder orderDate(LocalDate orderDate) {

			this.orderDate = orderDate;
			return this;
		}

		public Order build() {
			return new Order(this);
		}

	}

	public int getOrderId() {
		return orderId;
	}

	public int getCustomerId() {
		return customerId;
	}

	public int getProductId() {
		return productId;
	}

	public int getTotalOrder() {
		return totalOrder;
	}

	public BigDecimal getTotalPrice() {
		return totalPrice;
	}

	public LocalDate getOrderDate() {

		return orderDate;
	}

	@Override
	public String toString() {
		return "Customer: " + customerId + " Products : " + getProductId() + " Total : "
				+ getTotalOrder() + "Total price: " + totalPrice + " Order date: " + getOrderDate();
	}

}
