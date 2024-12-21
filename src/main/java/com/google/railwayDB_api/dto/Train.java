package com.google.railwayDB_api.dto;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Train 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int ID;
	private String tName;
	private String troute;
	private String pName;
	private String gender;
	private int age;
	private int tprice;
}
