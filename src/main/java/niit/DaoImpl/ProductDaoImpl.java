package niit.DaoImpl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import niit.Dao.ProductDao;
import niit.model.Product;

@Repository("productDao")
public class ProductDaoImpl  implements ProductDao{
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
		Session session=sessionfactory.openSession();
		Query query=session.createQuery("from Product");
		List<Product>listProduct=query.list();
		return listProduct;
	}


	public Product getProduct(int proId) {
		Session session=sessionfactory.openSession();
		Product product=(Product)session.get(Product.class, proId);
	session.close();
	return product;
	}
@Transactional
	public boolean UpdateProduct(Product product) {
	try
	{
		sessionfactory.getCurrentSession().saveOrUpdate(product);
		return true;
	}
	catch(Exception e)
	{
		return false;
	}
	}
@Transactional

public boolean deleteProduct(Product product) {
	try
	{
		sessionfactory.getCurrentSession().delete(product);
	return true;
	}
	catch(Exception e)
	{
	return false;
}
}
}
