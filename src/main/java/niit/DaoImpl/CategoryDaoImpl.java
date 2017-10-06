package niit.DaoImpl;

import java.util.List;



import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import niit.Dao.CategoryDao;
import niit.model.Category;

@Repository("categoryDao")
public class CategoryDaoImpl implements CategoryDao {

	@Autowired
	SessionFactory sessionfactory;
	@Transactional
	
	
	public boolean addCategory(Category category) {
			try
			{
			sessionfactory.getCurrentSession().save(category);	
		return true;
			}
		catch(Exception e)
		{
			return false;	
		}	
	}

	public List<Category> retrieveCategory() {

		Session session=sessionfactory.openSession();
		Query query=session.createQuery("from Category");
		List<Category> listCategory=query.list();
		session.close();
		return listCategory;


	}

	@Transactional
	public boolean deleteCategory(Category category) {
	
		try
		{
		sessionfactory.getCurrentSession().delete(category);	
	return true;
		}
	catch(Exception e)
	{
		return false;
	}
}
	public Category getCategory(int cId) {
	Session session=sessionfactory.openSession();
	Category category=(Category)session.get(Category.class,cId);
		session.close();
		return category;
	}

	@Transactional

	public boolean UpdateCategory(Category category) {
		
		try
		{
		sessionfactory.getCurrentSession().saveOrUpdate(category);	
	return true;
		}
	catch(Exception e)
	{
		return false;
	}
	}

}
