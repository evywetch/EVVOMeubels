package domain;

import java.math.BigDecimal;
import java.util.Date;

public class Order {

	private final int id;
	private final int customerId;
	private final int productId;
	private final int totalOrder;
	private final BigDecimal totalPrice;
	private final Date orderDate;
	
	
	private Order(Builder builder){
		this.id = builder.id;
		this.customerId = builder.customerId;
		this.productId = builder.productId;
		this.totalOrder = builder.totalOrder;
		this.totalPrice = builder.totalPrice;
		this.orderDate = builder.orderDate;
		
	}
	
	public static class Builder{
		
		private  int id;
		private  int customerId;
		private  int productId;
		private  int totalOrder;
		private  BigDecimal totalPrice;
		private  Date orderDate;
		
		public Builder(){
			
		}
		
		public Builder id(int id){
			this.id = id;
			return this;
		}
		public Builder customerId(int customerId){
			this.customerId = customerId;
			return this;
		}
		public Builder productId(int productId){
			this.productId = productId;
			return this;
		}
		
		public Builder totalOrder(int totalOrder){
			this.totalOrder = totalOrder;
			return this;
		}
		public Builder totalPrice(BigDecimal totalPrice){
			this.totalPrice = totalPrice;
			return this;
		}
		public Builder orderDate(Date orderDate){
			
			this.orderDate = orderDate;
			return this;
		}
		public Order build(){
			return new Order(this);
		}
		
	}
	
	public int getId(){
		return id;
	}
	public int getCustomerId(){
		return customerId;
	}
	public int getProductId(){
		return productId;
	}
	public int getTotalOrder(){
		return totalOrder;
	}
	public BigDecimal getTotalPrice(){
		return totalPrice;
	}
	public Date getOrderDate(){
		
		return orderDate;
	}
	@Override
	public String toString() {
		return "Customer: " + this.customerId + " Products : " + this.getProductId() + " Total : " + this.getTotalOrder() + 
				"Total price: " + this.totalPrice + " Order date: " + this.getOrderDate();
	}
	
	
	
}
