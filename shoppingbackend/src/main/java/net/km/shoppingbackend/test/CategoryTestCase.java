package net.km.shoppingbackend.test;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import net.km.shoppingbackend.dao.CategoryDAO;
import net.km.shoppingbackend.dto.Category;

public class CategoryTestCase {

	private static AnnotationConfigApplicationContext context;
	private static CategoryDAO categoryDAO;
	private Category category;
	
	
	@BeforeClass
	public static  void init()
	{
		context=new AnnotationConfigApplicationContext();
		context.scan("net.km.shoppingbackend");
		context.refresh();
		categoryDAO =  (CategoryDAO) context.getBean("categoryDAO");
	}
	
	
	@Test
	public  void  testAddCategory()
	{
		category=new Category();
		category.setName("Television");
		category.setImageUrl("cat");
		category.setDescription("Television");
		category.isActive();
		assertEquals("Successfully update",true,categoryDAO.add(category));
		
		
	}
	
	
//	@Test
//	public  void  testUpdateCategory()
//	{
//		category   = categoryDAO.get(1);	
//		category.setName("TV");
//		assertEquals("Successfully uodate","TV",categoryDAO.update(category));
//		
//		
//	}
	
}