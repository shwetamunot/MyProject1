package niit.test;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import niit.Dao.UserDao;
import niit.model.User;

public class UserTest {
	static UserDao userDao;
	
	@BeforeClass
	public static void initialize()
	{
		AnnotationConfigApplicationContext ac=new AnnotationConfigApplicationContext();
		ac.scan("niit");
		ac.refresh();
		
    	userDao=(UserDao)ac.getBean("userDao");
	}
	@Ignore
	@Test
	public void addUserTest()
	{
		User user=new User();
		user.setUseId(101);
		user.setName("Mac");
		user.setAddress("deccan");
		user.setPhno(2345678);
		user.setRole("abc");
		user.setCountry("pune");
		user.setEmail("mac@gmail.com");
		
		assertTrue(userDao.addUser(user));
	}
@Ignore
@Test
public void UpdateUserTest()
{
	User user=new User();
	user.setUseId(101);
	user.setName("Mac");
	user.setAddress("Swargate");
	user.setPhno(2345172);
	user.setCountry("pune");
	user.setEmail("mac@gmail.com");
	user.setRole("abc");

	assertTrue(userDao.UpdateUser(user));
}

@Test
public void retrieveUserTest()
{
	List<User> listUser=userDao.retrieveUser();
	assertNotNull("Problem in retrieving",listUser);
	this.show(listUser);
}
@Ignore
public void show(List<User> listUser)
{
	for(User user:listUser)
	{
		System.out.println("User id:"+user.getUseId());
		System.out.println("User name:"+user.getName());
		System.out.println("User phone no:"+user.getPhno());
		System.out.println("User country:"+user.getCountry());
		System.out.println("User role:"+user.getRole());
		System.out.println("User address:"+user.getAddress());
		System.out.println("User eamil id:"+user.getEmail());
		
	}
}
@Ignore
@Test
public void getUserTest()
{
	User user=userDao.getUser(101);
	assertNotNull("Problem in getting",user);
	System.out.println("User id:"+user.getUseId());
	System.out.println("User name:"+user.getName());
}
@Ignore
@Test
public void deleteUSerTest()
{
	User user=new User();
	user.setUseId(101);
	assertTrue(userDao.deleteUser(user));
}
@Test
	public void test() {
		fail("Not yet implemented");
	}

}
