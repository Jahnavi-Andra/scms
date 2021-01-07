package com.info.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.info.Model.Sport;

public interface SportRepo extends JpaRepository<Sport, Integer> {

	@Query("select fee from Sport t where t.trainerId = :trainerId")
	public double sportbyTid (@Param("trainerId")int trainerId);

	//@Query("select t from Sport where sport_name = :sport_name")
	//public List<Sport> SportbyName (String sport_name);


}
