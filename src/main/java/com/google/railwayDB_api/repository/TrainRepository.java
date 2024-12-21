package com.google.railwayDB_api.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import com.google.railwayDB_api.dto.Train;

public interface TrainRepository extends JpaRepository<Train, Integer>
{
	List<Train> findByID(int ID);
	List<Train> findBytName(String tname);
	List<Train> findBytroute(String troute);
	List<Train> findBypName(String pname);
	List<Train> findBygender(String gender);
	List<Train> findByage(int age);
}
