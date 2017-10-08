package niit.Dao;

import java.util.List;

import niit.model.Supplier;

public interface SupplierDao {
	public boolean addSupplier(Supplier supplier);
	public List<Supplier> retrieveSupplier();
	public boolean deleteSupplier(Supplier supplier);
	public Supplier getSupplier(int sId);
public boolean UpdateSupplier(Supplier supplier);
}
