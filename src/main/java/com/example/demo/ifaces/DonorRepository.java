package com.example.demo.ifaces;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.DonorEntity;
@Repository
public interface DonorRepository extends JpaRepository<DonorEntity, Integer> {
	List<DonorEntity> findByBloodGroup(String bloodGroup);
	List<DonorEntity> findAll();
	
	
	

}
