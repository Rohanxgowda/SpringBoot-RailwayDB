package com.google.railwayDB_api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
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
	
}
