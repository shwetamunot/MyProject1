package niit.DaoImpl;
import niit.model.User;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import niit.Dao.UserDao;
@Repository("userDao")

public class UserDaoImpl implements UserDao{
	@Autowired
	SessionFactory sessionfac;
	
	public void insertUser(User user) {
	   
		Session session=sessionfac.openSession();
		session.beginTransaction();
		session.persist(user);
		session.getTransaction().commit();

	}
	public UserDaoImpl()
	{
		
	}
//	public UserDaoImpl(SessionFactory sessionFactory) {
	//	super();
		//this.sessionfac=sessionFactory;
	//}
	
@Transactional
	public boolean addUser(User user) {
	try
	{
		sessionfac.getCurrentSession().save(user);
		return true;
	}
	catch(Exception e)
	{
		return false;
	}
	}

	public List<User> retrieveUser() {
	System.out.println("abc");
		Session session=sessionfac.openSession();
		Query query=session.createQuery("from User");
		List<User> listUser=query.list();
	
		session.close();
		return listUser;
	}
@Transactional
	public boolean deleteUser(User user) {
		try{
			sessionfac.getCurrentSession().delete(user);
			return true;
		}
		catch(Exception e)
		{
		return false;
	}
	}

	public User getUser(int useId) {
		Session session=sessionfac.openSession();
		User user=(User)session.get(User.class,useId);
		session.close();
		return user;
	}
@Transactional
	public boolean UpdateUser(User user) {
		try
		{
		sessionfac.getCurrentSession().saveOrUpdate(user);
		return true;
		}
		catch(Exception e)
		{
		return false;
	}
	}
	

}
