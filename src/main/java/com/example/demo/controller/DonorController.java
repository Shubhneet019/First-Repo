package com.example.demo.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;


import com.example.demo.entity.DonorEntity;
import com.example.demo.services.DonorService;

@RestController
@CrossOrigin(value="*")
public class DonorController {
	
	@Autowired
	private DonorService service;
	
	@GetMapping(path="/api/v1/donor/{bloodGroup}")
	public List<DonorEntity> findByBloodGroup(@PathVariable("bloodGroup") String bloodGroup){
		return this.service.findByBloodGroup(bloodGroup);
	}
	
	@GetMapping(path="/api/v1/donor/")
	public List<DonorEntity> findAll(){
		return this.service.findAll();
	}

}
