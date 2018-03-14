package domain;

import java.math.BigDecimal;

public class Product {

	private final int id;
	private final String name;
	private final BigDecimal price;
	private final int stock;

	private Product(Builder builder) {

		this.id = builder.id;
		this.name = builder.name;
		this.price = builder.price;
		this.stock = builder.stock;
	}

	public static class Builder {
		private int id;
		private String name;
		private BigDecimal price;
		private int stock;

		public Builder() {

		}

		public Builder id(int id) {
			this.id = id;
			return this;
		}

		public Builder name(String name) {
			this.name = name;
			return this;
		}

		public Builder price(BigDecimal price) {
			this.price = price;
			return this;
		}

		public Builder stock(int stock) {
			this.stock = stock;
			return this;
		}

		public Product build() {
			return new Product(this);
		}

	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public int getStock() {
		return stock;
	}

	@Override
	public String toString() {
		return this.getName() + ", Price : " + this.getPrice() + ", Strock : " + this.getStock();
	}

}
