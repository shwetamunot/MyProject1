package niit.test;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import niit.Dao.ProductDao;
import niit.model.Product;

public class ProductTest {
	static ProductDao productDao;
	@BeforeClass
	public static void initialize()
	{
		AnnotationConfigApplicationContext ac=new AnnotationConfigApplicationContext();
	ac.scan("niit");
	ac.refresh();
	productDao=(ProductDao)ac.getBean("productDao");
	}
	@Ignore
	@Test
	
	public void addProductTest()
	{
		Product product=new Product();
		product.setProId(111);
		product.setProName("Abc");
		product.setProDesc("video game");
		product.setStock(30);
		product.setPrice(40);;
	    product.setcId(101);

	assertTrue(productDao.addProduct(product));
	}
	@Ignore
	@Test
	public void UpdateProductTest()
	{
		Product product=new Product();
		product.setProId(111);
		product.setProName("Abc");
		product.setProDesc("video game with cell");
		product.setStock(30);
		product.setPrice(40);
	    product.setcId(101);

	assertTrue(productDao.UpdateProduct(product));
	}
	@Ignore
	@Test
	public void retrieveProductTest()
	{
		List<Product> listProduct=productDao.retrieveProduct();
		assertNotNull("Problem in retrieving",listProduct);	
	this.show(listProduct);
	
	}
	
	@Ignore
public void show(List<Product> listProduct)
{
	for(Product product:listProduct)
	{
		System.out.println("Product I:"+product.getProId());
		System.out.println("Product Name:"+product.getProName());
	}
	
}
	@Ignore
@Test
public void getProductTest()
{
Product product=productDao.getProduct(111);
assertNotNull("Problem in getting",product);
System.out.println("Product Id:"+product.getProId());
System.out.println("Product Name"+product.getProName());
}

@Test
public void deleteProductTest()
{
	
	Product product=new Product();
	product.setProId(111);
	assertTrue(productDao.deleteProduct(product));
}
	@Test
	public void test() {
		fail("Not yet implemented");
	}

}
