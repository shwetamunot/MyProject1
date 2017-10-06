package niit.DaoImpl;

import java.util.List;


import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import niit.Dao.ProductDao;
import niit.model.Product;

@Repository("productDAO")
public class ProductDaoImpl implements ProductDao{

	@Autowired
	SessionFactory sessionfactory;
	@Transactional
	public boolean addProduct(Product product) {
	try
		{
		sessionfactory.getCurrentSession().save(product);	
	return true;
		}
	catch(Exception e)
	{
	return false;
	}
	}
	public List<Product> retrieveProduct() {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean deleteProduct(Product product) {
		// TODO Auto-generated method stub
		return false;
	}

	public Product getProduct(int pId) {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean UpdateProduct(Product product) {
		// TODO Auto-generated method stub
		return false;
	}
	
	
	

}