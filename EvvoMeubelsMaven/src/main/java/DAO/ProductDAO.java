package DAO;

import java.util.List;

import Rsvier.evvo.medel.Address;
import Rsvier.evvo.medel.Product;

public interface ProductDAO {

	public List<Product> getAllProducts();
	public Product getProduct(int productId);
	public void createProduct(Product product);
	public void updateProduct(Product product);
	public void deleteProduct(Product product);
}
