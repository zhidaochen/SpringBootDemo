package com.omron.demo;

import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

import javax.ws.rs.Produces;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@RestController
public class HelloController {

    @RequestMapping(value="/api/{id}", method=RequestMethod.GET)
    @ResponseBody
    @Produces("application/json")
    public User index(@PathVariable("id") int id, @RequestParam String name) {
    	User user = new User();
    	if(name!=null) {
    		user.setUserName(name);
    	}
    	
    	user.setPassword("password");
    	
        return user;
    }

    @RequestMapping(value="/TestCRUD/api/user", method=RequestMethod.GET)
    @ResponseBody
    //@Produces("application/json")
    public User index() {
    	User user = new User();
    	Map<String,Test> map = new HashMap();
    	user.setUserName("UserA");
    	user.setEmail("Hello@world.com");
    	user.setPassword("password");
    	
    	Test test = new Test();
    	test.setTest("hello,world");
    	map.put("test", test);
    	
    	user.setConmap(map);
    	
        return user;
    }
    
    class Test {
    	private String test;
    	public void setTest(String test) {
    		this.test = test;
    	}
    	public String getTest() {
    		return this.test;
    	}
    }
    
    @RequestMapping(value="/TestCRUD/api/test", method=RequestMethod.GET)
    @ResponseBody
    //@Produces("application/json")
    public String test() {
    	
    	
        return "test";
    }
}