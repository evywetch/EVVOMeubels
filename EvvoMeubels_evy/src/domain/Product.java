package domain;

import java.math.BigDecimal;

public class Product {

	private final int productId;
	private final String name;
	private final BigDecimal price;
	private final int stock;

	private Product(ProductBuilder builder) {

		this.productId = builder.productId;
		this.name = builder.name;
		this.price = builder.price;
		this.stock = builder.stock;
	}

	public static class ProductBuilder {
		private int productId;
		private String name;
		private BigDecimal price;
		private int stock;

		public ProductBuilder() {

		}

		public ProductBuilder productId(int productId) {
			this.productId = productId;
			return this;
		}

		public ProductBuilder name(String name) {
			this.name = name;
			return this;
		}

		public ProductBuilder price(BigDecimal price) {
			this.price = price;
			return this;
		}

		public ProductBuilder stock(int stock) {
			this.stock = stock;
			return this;
		}

		public Product build() {
			return new Product(this);
		}

	}

	public int getProductId() {
		return productId;
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
