package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.DonorEntity;
import com.example.demo.ifaces.DonorRepository;

@Service
public class DonorService {

	@Autowired
	private DonorRepository repo;
	public List<DonorEntity> findByBloodGroup(String bloodGroup){
		return this.repo.findByBloodGroup(bloodGroup);
	}
	public List<DonorEntity> findAll(){
		return this.repo.findAll();
	}
	
}
