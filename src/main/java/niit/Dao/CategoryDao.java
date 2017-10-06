package niit.Dao;

import java.util.List;

import niit.model.Category;

public interface CategoryDao {
	public boolean addCategory(Category category);
	public List<Category>retrieveCategory();
	public boolean deleteCategory(Category category);
	public Category getCategory(int cId);
	public boolean UpdateCategory(Category category);

}
