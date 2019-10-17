package com.media.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.media.service.ShowService;

@RestController
@RequestMapping("/shows")
public class showController {
	
	public showController() {
		// TODO Auto-generated constructor stub
		System.out.println("hello");
	}
@Autowired
ShowService showService;
@RequestMapping(value="/getShows",method=RequestMethod.GET)
public String getAllShows() {
	JsonObject obj=new JsonObject();
	JsonArray arr=new JsonArray();
	arr.add("Friends");
	obj.addProperty("status", true);
	obj.add("data", arr);
	return obj.toString();
}
@RequestMapping("/test")
public String test(){
	return "test";
}
}
