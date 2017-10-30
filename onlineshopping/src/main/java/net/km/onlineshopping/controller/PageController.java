package net.km.onlineshopping.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class PageController {
	
	@RequestMapping(value={"/","home","/index"})
	public ModelAndView index()
	{
		ModelAndView mv= new ModelAndView("page");
		mv.addObject("greeting","Welcome to spring");
		return mv;
	}
	@RequestMapping(value={"/test"})
	public ModelAndView test(@RequestParam(value="greet",required=false)String greeting )
	{
		ModelAndView mv=new ModelAndView("page");
		mv.addObject("greeting",greeting);
		return mv;
	}
	
	@RequestMapping(value={"/test/{greet}"})
	public ModelAndView test1(@PathVariable("greet")String greet)
	{
		ModelAndView mv=new ModelAndView("page");
		mv.addObject("greeting",greet);
		return mv;
		
	}
//	@RequestMapping(value={"/test/{greet}"})
//	public ModelAndView test1(@PathVariable("greet")String greet )
//	{
//		ModelAndView mv=new ModelAndView("page");
//		mv.addObject("greeting",greet);
//		return mv;
//	}
	
	

}
