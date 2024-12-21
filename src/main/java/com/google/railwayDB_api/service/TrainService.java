package com.google.railwayDB_api.service;

import java.util.HashMap;

import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
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
	public ResponseEntity<Object> fetchAllPassangers() {
		List<Train> list=repository.findAll();
		if(list.isEmpty()) 
		{
		Map<String,Object> map=new HashMap<String, Object>();
		map.put("Sorry","No Passanger Found");
		return new ResponseEntity<Object>(map,HttpStatus.NOT_FOUND);
		}
		else
		{
			Map<String,Object> map= new HashMap<String, Object>();
			map.put("Message","Passanger found");
			map.put("data",list);
			return new ResponseEntity<Object>(map,HttpStatus.OK);
		}
	}
	public ResponseEntity<Object> fetchByID(int ID) {
		Optional<Train> optional=repository.findById(ID);
		if(optional.isEmpty())
		{
			Map<String,Object> map=new HashMap<String, Object>();
			map.put("Sorry","No Passanger Found in the id: "+ID);
			return new ResponseEntity<Object>(map,HttpStatus.NOT_FOUND);
		}
		else
		{
			Map<String,Object> map= new HashMap<String, Object>();
			map.put("Message","Passanger found");
			map.put("data",optional.get());
			return new ResponseEntity<Object>(map,HttpStatus.OK);
		}
	}
	public ResponseEntity<Object> fetchBytName(String tname) {
		List<Train> list = repository.findBytName(tname);
		if (list.isEmpty()) {
			Map<String, Object> map = new HashMap<String, Object>();
			map.put("error", "No Train Found with Name :"+tname);
			return new ResponseEntity<Object>(map, HttpStatus.NOT_FOUND);
		} else {
			Map<String, Object> map = new HashMap<String, Object>();
			map.put("message", "Train Found");
			map.put("data", list);
			return new ResponseEntity<Object>(map, HttpStatus.OK);
		}
	}
	public ResponseEntity<Object> fetchBytroute(String troute) {
		List<Train> list = repository.findBytroute(troute);
		if (list.isEmpty()) {
			Map<String, Object> map = new HashMap<String, Object>();
			map.put("error", "No Train Found in the route :"+troute);
			return new ResponseEntity<Object>(map, HttpStatus.NOT_FOUND);
		} else {
			Map<String, Object> map = new HashMap<String, Object>();
			map.put("message", "Route Found");
			map.put("data", list);
			return new ResponseEntity<Object>(map, HttpStatus.OK);
		}
	}
	public ResponseEntity<Object> fetchBypName(String pName) {
		List<Train> list = repository.findBypName(pName);
		if (list.isEmpty()) {
			Map<String, Object> map = new HashMap<String, Object>();
			map.put("error", "No Pssanger Found with the Name :"+pName);
			return new ResponseEntity<Object>(map, HttpStatus.NOT_FOUND);
		} else {
			Map<String, Object> map = new HashMap<String, Object>();
			map.put("message", "Passanger Found");
			map.put("data", list);
			return new ResponseEntity<Object>(map, HttpStatus.OK);
		}
	}
	public ResponseEntity<Object> fetchBygender(String gender) {
		List<Train> list = repository.findBygender(gender);
		if (list.isEmpty()) {
			Map<String, Object> map = new HashMap<String, Object>();
			map.put("error", "No Passanger Found with the gender :"+gender);
			return new ResponseEntity<Object>(map, HttpStatus.NOT_FOUND);
		} else {
			Map<String, Object> map = new HashMap<String, Object>();
			map.put("message", "Passanget Found");
			map.put("data", list);
			return new ResponseEntity<Object>(map, HttpStatus.OK);
		}
	}
	public ResponseEntity<Object> fetchByage(int age) {
		List<Train> list = repository.findByage(age);
		if (list.isEmpty()) {
			Map<String, Object> map = new HashMap<String, Object>();
			map.put("error", "No Passanger Found with the age :"+age);
			return new ResponseEntity<Object>(map, HttpStatus.NOT_FOUND);
		} else {
			Map<String, Object> map = new HashMap<String, Object>();
			map.put("message", "passanger Found");
			map.put("data", list);
			return new ResponseEntity<Object>(map, HttpStatus.OK);
		}
	}
}
