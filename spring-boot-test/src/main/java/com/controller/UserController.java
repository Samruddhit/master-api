package com.controller;

import java.util.ArrayList;
import java.util.List;

import org.neo4j.cypher.internal.compiler.v2_1.planner.logical.findShortestPaths;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.User;
import com.exceptions.UserNotFoundExp;
import com.google.common.net.MediaType;
import com.service.UserService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;


// U are just passing it directly here sammy this needs to be quoted 
@RestController
@RequestMapping("/User")
@Api(tags="User-Details")
public class UserController {
	@Autowired
	private UserService service;
	 
	
	//Methods.........................*****************........................
	
	@RequestMapping( method=RequestMethod.GET ,produces=org.springframework.http.MediaType.APPLICATION_JSON_VALUE)
	@ApiOperation(value="Find All Users",
	notes="Returns a list of the users in the system.")
@ApiResponses(value={
	@ApiResponse(code=200, message="Success"),
	@ApiResponse(code=500, message="Internal Server Error")
})
	List<User> findAllUsers(){
		return service.findAllUsers();
		
	}
	 
	
	public User findone(@PathVariable("id") long Id) throws UserNotFoundExp
	{
		return service.findUserById(Id);
		
	}


}


























/*private static List<User> list = new ArrayList<User>();
static{
	list.add(new User(111, "Sam", "Thakur", "sam0swing@gmail.com", "samruddhit", "abc", 9734620342l));
	list.add(new User(110, "Ram", "Tha", "sam0swing@gmail.com", "Ramit", "abc", 9734620342l));
	
	list.add(new User(111, "Samridhha"));
	list.add(new User(110, "Samru"));
}
@RequestMapping(value="", method=RequestMethod.GET, produces=org.springframework.http.MediaType.APPLICATION_JSON_VALUE , consumes=org.springframework.http.MediaType.APPLICATION_JSON_VALUE)
@ResponseBody
public List<User> getallCustomers(){
	return list;
}*/