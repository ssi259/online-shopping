package net.km.shoppingbackend.dao;

import java.util.List;

import net.km.shoppingbackend.dto.Category;

public interface CategoryDAO {
	
	List<Category> 	list();

	Category get(int id);
	

}
