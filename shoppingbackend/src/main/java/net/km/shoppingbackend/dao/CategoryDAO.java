package net.km.shoppingbackend.dao;

import java.util.List;

import net.km.shoppingbackend.dto.Category;

public interface CategoryDAO {
	
	List<Category> 	list();
	boolean add(Category category);
	boolean delete(Category category);

	boolean update(Category category);


	Category get(int id);
	

}
