package com.google.railwayDB_api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.google.railwayDB_api.dto.Train;
import com.google.railwayDB_api.service.TrainService;

@RestController
public class TrainController 
{
	@Autowired
	TrainService service;
	
	//save
	@PostMapping("/train")
	public ResponseEntity<Object> savePassanger(@RequestBody Train passanger)
	{
		return service.savePassanger(passanger);
	}
	
	@PostMapping("/passangers/many")
	public ResponseEntity<Object> savePassangers(@RequestBody List<Train> passangers)
	{
		return service.savePassangers(passangers);
	}
	
	//fetch All passangers
	@GetMapping("/passangers")
	public ResponseEntity<Object> fetchAllPassangers()
	{
		return service.fetchAllPassangers();
	}
	
	//findBy ID
	@GetMapping("/passangers/{ID}")
	public ResponseEntity<Object> fetchByID(@PathVariable int ID)
	{
		return service.fetchByID(ID);
	}
	
	//findBytName
	@GetMapping("/passangers/tname/{tname}")
	public ResponseEntity<Object> fetchBytName(@PathVariable String tname)
	{
		return service.fetchBytName(tname);
	}
	
	//findBytroute
	@GetMapping("/passangers/troute/{troute}")
	public ResponseEntity<Object> fetchBytroute(@PathVariable String troute)
	{
		return service.fetchBytroute(troute);
	}
	
	//findBypName
	@GetMapping("/passangers/pName/{pName}")
	public ResponseEntity<Object> fetchBypName(@PathVariable String pName)
	{
		return service.fetchBypName(pName);
	}
	
	//findBygender
	@GetMapping("/passangers/gender/{gender}")
	public ResponseEntity<Object> fetchBygender(@PathVariable String gender)
	{
		return service.fetchBygender(gender);
	}
	
	//findByage
	@GetMapping("/passangers/age/{age}")
	public ResponseEntity<Object> fetchByage(@PathVariable int age)
	{
		return service.fetchByage(age);
	}
	
	
}
