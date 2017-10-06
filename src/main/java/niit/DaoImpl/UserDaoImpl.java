package niit.DaoImpl;
import niit.model.*;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import niit.Dao.*;
@Repository

public class UserDaoImpl implements UserDao{
	@Autowired
	SessionFactory sessionfac;
	
	public void insertUser(User user) {
	   
		Session session=sessionfac.openSession();
		session.beginTransaction();
		session.persist(user);
		session.getTransaction().commit();

	}
	@Autowired
	
	public UserDaoImpl(SessionFactory sessionFactory) {
		super();
		this.sessionfac=sessionFactory;
	}

	

}
