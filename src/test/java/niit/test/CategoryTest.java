package niit.test;

import static org.junit.Assert.*;

import org.hibernate.SessionFactory;
import java.util.List;

import org.junit.Assert;

import niit.hibernateConfig.HiberConfig;

import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import niit.Dao.CategoryDao;
import niit.model.Category;

public class CategoryTest {

	static CategoryDao categoryDao;
	
@BeforeClass
	public static void initialize()
	{
	AnnotationConfigApplicationContext ac=new AnnotationConfigApplicationContext();
	ac.scan("niit");
	ac.refresh();
	

	categoryDao=(CategoryDao)ac.getBean("categoryDao");
	
	}
@Ignore
@Test
public void addCategoryTest()
{	

	Category category=new Category();
	category.setcId(101);
	category.setCname("toys");
	category.setCdesc("remote car");
	
	assertTrue(categoryDao.addCategory(category));
}
@Ignore

@Test
public void UpdateCategoryTest()
{
	Category category=new Category();
	category.setcId(101);
	category.setCname("toys");
	category.setCdesc("remote car");
	
	assertTrue(categoryDao.UpdateCategory(category));
}

@Ignore
@Test
public void DeleteCategoryTest()
{
	Category category=new Category();
	category.setcId(101);

	
	assertTrue(categoryDao.deleteCategory(category));

}
@Ignore
@Test
public void retrieveCategoryTest()
{
	List<Category> listCategory=categoryDao.retrieveCategory();
	assertNotNull("Problem in retrieving",listCategory);	
	this.show(listCategory);
}


public void show(List<Category> listCategory)
{
	for(Category category:listCategory)
	{
		System.out.println("Category Id:"+category.getcId());
		System.out.println("Category Name:"+category.getCname());
	}
}

@Test
public void getCategoryTest()
{

Category category=categoryDao.getCategory(101);
	assertNotNull("Problem in getting",category);	
System.out.println("Category Id:"+category.getcId());
System.out.println("Category Name:"+category.getCname());
}

	@Test
	public void test() {
		fail("Not yet implemented");
	}

}
