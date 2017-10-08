package niit.test;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import niit.Dao.SupplierDao;
import niit.model.Supplier;


public class SupplierTest {
    static SupplierDao  supplierDao;
	@BeforeClass
	public static void initialize()
	{
		AnnotationConfigApplicationContext ac=new AnnotationConfigApplicationContext();
		ac.scan("niit");
		ac.refresh();
       
		supplierDao=(SupplierDao)ac.getBean("supplierDao");
	}
@Ignore	
@Test
public void addSupplierTest()
{
	Supplier supplier=new Supplier();
	supplier.setsId(201);
	supplier.setsName("John");
	supplier.setsAddress("MG road");
	supplier.setPhoneno(2323451);
	supplier.setProId(111);

	assertTrue(supplierDao.addSupplier(supplier));
}
@Ignore
@Test
public void updateSupplierTest()
{
	Supplier supplier=new Supplier();
	supplier.setsId(201);
	supplier.setsName("John");
	supplier.setsAddress("Fc road");
	supplier.setPhoneno(2321345);
	supplier.setProId(111);

 assertTrue(supplierDao.UpdateSupplier(supplier));
 }
@Ignore
@Test
public void retrieveSupplierTest()
{
	List<Supplier> listSupplier=supplierDao.retrieveSupplier();
	assertNotNull("Problem in retrieving",listSupplier);
	this.show(listSupplier);
	
}
@Ignore
public void show(List<Supplier> listSupplier)
{
	for(Supplier supplier:listSupplier)
	{
		System.out.println("Supplier id:"+supplier.getsId());
		System.out.println("Supplier Name"+supplier.getsName());
	}

}
@Ignore
@Test
public void getSupplierTest()
{
	Supplier supplier=supplierDao.getSupplier(201);
	assertNotNull("Problem in getting",supplier);
	System.out.println("Supplier Id:"+supplier.getsId());
	System.out.println("Supplier Name"+supplier.getsName());
	System.out.println("Supplier Address:"+supplier.getsAddress());
	System.out.println("Supplier Phone no"+supplier.getPhoneno());
	System.out.println("Supplier Phone no"+supplier.getProId());
	
}

@Test
public void deleteSupplierTest()
{
	Supplier supplier=new Supplier();
	supplier.setsId(201);
	
	assertTrue(supplierDao.deleteSupplier(supplier));
}
@Test
	public void test() {
		fail("Not yet implemented");
	}

}
