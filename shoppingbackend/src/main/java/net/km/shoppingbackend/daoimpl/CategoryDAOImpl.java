package net.km.shoppingbackend.daoimpl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import net.km.shoppingbackend.dao.CategoryDAO;
import net.km.shoppingbackend.dto.Category;

@Repository("categoryDAO")
@Transactional//every function of the class will be transctional managed by spring
public class CategoryDAOImpl implements CategoryDAO {

	@Autowired 
	private SessionFactory sessionFactory;
	private static List<Category> categories=new ArrayList<>();
	Category category=new Category();
	
	@Override
	public List<Category> list() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public Category get(int id) {
		
		return sessionFactory.getCurrentSession().get(Category.class, Integer.valueOf(id));
		
	}
	@Override
		
	public boolean add(Category category) {
		try
		{
		sessionFactory.getCurrentSession().persist(category);
		return true;
		}
		catch(Exception e)
		{
			e.printStackTrace();
			return false;	
		}
		
		
	}
	@Override
	
	public boolean delete(Category category) {
		sessionFactory.getCurrentSession().delete(category);// TODO Auto-generated method stub
		return false;
	}
	@Override
	
	public boolean update(Category category) {
		try
		{
		sessionFactory.getCurrentSession().update(category);// TODO Auto-generated method stub
		return true;
		}
		catch(Exception e)
		{
			
			e.printStackTrace();
			return false;
		}
	}

}
