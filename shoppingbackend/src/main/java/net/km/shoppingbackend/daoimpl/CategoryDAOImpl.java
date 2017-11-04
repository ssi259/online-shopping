package net.km.shoppingbackend.daoimpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import net.km.shoppingbackend.dao.CategoryDAO;
import net.km.shoppingbackend.dto.Category;

@Repository("categoryDAO")
public class CategoryDAOImpl implements CategoryDAO {

	
	private static List<Category> categories=new ArrayList<>();
	Category category=new Category();
	static
	{
		Category category=new Category();
		//adding first category
		category.setId(1);
		category.setName("Television");
		category.setDescription("for televiion");
		category.setImageUrl("CAT_1.png");
		
		categories.add(category);
		
		//second
		Category category1=new Category();
		category1.setId(2);
		category1.setName("mobile");
		category1.setDescription("this is mobile");
		category.setImageUrl("CAT_2.png");
		categories.add(category1);
		
		
	}
	@Override
	public List<Category> list() {
		// TODO Auto-generated method stub
		return categories;
	}
	@Override
	public Category get(int id) {
		
		
		for(Category category:categories)
		{
			if(category.getId()==id)
				return category;
		}// enhanced for loop
		return null;
	}

}
