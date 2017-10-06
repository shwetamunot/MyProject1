package niit.Dao;

import java.util.List;

import niit.model.Product;

public interface ProductDao {
	public boolean addProduct(Product product);
	public List<Product>retrieveProduct();
	public boolean deleteProduct(Product product);
	public Product getProduct(int pId);
	public boolean UpdateProduct(Product product);


}
