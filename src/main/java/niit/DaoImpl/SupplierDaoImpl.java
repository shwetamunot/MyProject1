package niit.DaoImpl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import niit.Dao.SupplierDao;
import niit.model.Supplier;
@Repository("supplierDao")
public class SupplierDaoImpl implements SupplierDao{

	@Autowired
	SessionFactory sessionfactory;
	@Transactional
	public boolean addSupplier(Supplier supplier) {
		try
		{
	sessionfactory.getCurrentSession().save(supplier);
	return true;
		}
		catch(Exception e)
		{
		return false;
     	}
		}

	@Transactional
	public boolean deleteSupplier(Supplier supplier) {
		try
		{
		sessionfactory.getCurrentSession().delete(supplier);	
		return true;
		}
		catch(Exception e)
		{
			return false;
	
		}
			}

	public Supplier getSupplier(int sId) {
		
		Session session=sessionfactory.openSession();
		Supplier supplier=(Supplier)session.get(Supplier.class,sId);
		session.close();
		return supplier;
	}

@Transactional
	public boolean UpdateSupplier(Supplier supplier) {
		try
		{
	    sessionfactory.getCurrentSession().saveOrUpdate(supplier);		
	    return true;
		}
		catch(Exception e)
		{
		return false;
	}
	}

public List<Supplier> retrieveSupplier() {
	Session session=sessionfactory.openSession();
	Query query=session.createQuery("from Supplier");
	List<Supplier> listSupplier=query.list();
	session.close();
	return listSupplier;
	
}
	

}
