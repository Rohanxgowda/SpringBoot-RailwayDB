package com.google.railwayDB_api.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.google.railwayDB_api.dto.Train;
import com.google.railwayDB_api.repository.TrainRepository;

@Service
public class TrainService 
{
	@Autowired
	TrainRepository repository;

	public ResponseEntity<Object> savePassanger(Train passanger) 
	{
		repository.save(passanger);
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("message", " Ticket Booked Success");
		map.put("data", passanger);
		return new ResponseEntity<Object>(map, HttpStatus.CREATED);
	}
	public ResponseEntity<Object> savePassangers(List<Train> passangers) 
	{
		repository.saveAll(passangers);
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("message", " Ticket Booked Success");
		map.put("data", passangers);
		return new ResponseEntity<Object>(map, HttpStatus.CREATED);
	}

}
