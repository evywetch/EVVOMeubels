package domain;

import java.math.BigDecimal;

import domain.Order.Builder;

public class Test {

	public static void main(String[] args) {
		
		
		
		Order order =  new Order.OrderBuilder().build();
		
		System.out.println(order.toString());
	
	}

}



