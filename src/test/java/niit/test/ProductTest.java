package niit.test;

import static org.junit.Assert.*;
import niit.hibernateConfig.HiberConfig;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import niit.model.Product;

import niit.Dao.ProductDao;
import niit.model.Product;


public class ProductTest {
	static ProductDao productDAO; 
@BeforeClass
	
	public static void initialize()
	{
	AnnotationConfigApplicationContext ac=new AnnotationConfigApplicationContext();
	ac.scan("niit");
	ac.refresh();
	

	productDAO=(ProductDao)ac.getBean("productDAO");
	
	}

@Test
public void addProductTest()
{	
	Product product=new Product();
	product.setpId(201);
	product.setpName("abc");
	product.setpDesc("remote car");
	product.setPrice(1000);
	product.setStock(20); 
    product.setcId(101);
	
	assertTrue(productDAO.addProduct(product));
	
}
	@Test
	public void test() {
		fail("Not yet implemented");
	}

}
