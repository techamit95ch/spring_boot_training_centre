package com.springrest.springrest.controller;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


import com.springrest.springrest.entities.*;
import com.springrest.springrest.services.*;

@RestController
public class MyController {
	@Autowired
	private CentreServices centreService;
	
	@GetMapping("/centres")
	public List<Centre> getCentres(){
		return this.centreService.getCentres();
	}
	@PostMapping(path="/centres", consumes ="application/json")
	public void addCentre(@RequestBody Centre centre) {
//		System.out.println(centre);
		 this.centreService.addCentre(centre);
	}
}
 