package net.km.onlineshopping.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import net.km.shoppingbackend.dao.CategoryDAO;
import net.km.shoppingbackend.dto.Category;

@Controller
public class PageController {
	
	@Autowired
	private CategoryDAO categoryDAO;
	
	@RequestMapping(value="/home")
	public ModelAndView index()
	{

		ModelAndView mv=new ModelAndView("page");
		mv.addObject("title","home");
		mv.addObject("categories", categoryDAO.list());
		mv.addObject("userclickhome",true);
		return mv;
	}
	@RequestMapping(value="/about")
	public ModelAndView about()
	{
		ModelAndView mv=new ModelAndView("page");
		mv.addObject("title","home");
		mv.addObject("userclickabout",true);
		return mv;
	}
	
	@RequestMapping(value={"/services"})
	public ModelAndView services()
	{
		ModelAndView mv=new ModelAndView("page");
		mv.addObject("title","home");
		mv.addObject("userclickservices",true);
		return mv;
		
	}
	@RequestMapping(value={"/contact"})
	public ModelAndView contact()
	{
		ModelAndView mv=new ModelAndView("page");
		mv.addObject("title","home");
		mv.addObject("userclickcontact",true);
		return mv;
	}
	/*
	 Methds to load all products and based on categories
	 */
	@RequestMapping(value="/show/all/products")
	public ModelAndView showAllProducts()
	{

		ModelAndView mv=new ModelAndView("page");
		mv.addObject("title","All Products");
		mv.addObject("categories", categoryDAO.list());
		mv.addObject("userClicAllProducts",true);
		return mv;
	}
	/*
	 
	 */
	@RequestMapping(value="/show/category/{id}/products")
	public ModelAndView showCategoryProducts(@PathVariable("id")int id)
	{
		Category category=null;
		category=categoryDAO.get(id);
		ModelAndView mv=new ModelAndView("page");
		mv.addObject("title",category.getName());
		mv.addObject("categories", categoryDAO.list());
		mv.addObject("category", category);
		mv.addObject("userClicCategoryProducts",true);
		return mv;
	}
	

}
