package controller;

import java.util.HashMap;
import java.util.Map;







import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import pojo.Person;
import service.TestServiceImpl;
import test.PersonTest;




@Controller
public class TestController {
	
	@Resource(name="testService")
	private TestServiceImpl testServiceImpl; 
	
	
/*	@RequestMapping(value = "/login/{user}", method = RequestMethod.GET)  
	public ModelAndView aaa(HttpServletRequest request,HttpServletResponse response,@PathVariable("user") String user){	
		
		Map model=new HashMap();
	    model.put("username", user);
	    model.put("method","GET");
		return new ModelAndView("index",model);
	}*/
	
	@RequestMapping(value = "/login/{id}", method = RequestMethod.GET)  
	public ModelAndView aaa(HttpServletRequest request,HttpServletResponse response,@PathVariable("id") Integer id){	
		
		Map<String,Object> model=new HashMap<String,Object>();
	    model.put("username", new PersonTest().find(id).getName());
	    model.put("method","GET");
		return new ModelAndView("index",model);
	}
	
	@RequestMapping(value="/put/test",method=RequestMethod.PUT)
	public ModelAndView bbb(HttpServletRequest request,HttpServletResponse response){
		Map<String,Object> model=new HashMap<String,Object>();
		model.put("method","put");
		
		return new ModelAndView("index",model);
	}
	
	@RequestMapping(value="/delete/test",method=RequestMethod.DELETE)
	public ModelAndView ccc(HttpServletRequest request,HttpServletResponse response){
		Map<String,Object> model=new HashMap<String,Object>();
		model.put("method","delete");
		
		return new ModelAndView("index",model);
	}
	
	@RequestMapping(value="/annotation",method=RequestMethod.GET)
	public ModelAndView annotation(HttpServletRequest request,HttpServletResponse response){
		
		System.out.println(testServiceImpl.getTestAnnotation());
		Map<String,Object> model=new HashMap<String,Object>();
		model.put("message",testServiceImpl.getTestAnnotation());

		return new ModelAndView("index",model);
	}
	
	
/*	@RequestMapping(value="/jsontest",method=RequestMethod.GET)
	@ResponseBody
	public Object test(){
		Person p=new Person("123");
		return p;
	}*/
	
}
