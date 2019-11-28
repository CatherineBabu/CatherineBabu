package com.spring.admin.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.spring.admin.model.BloodDrive;
import com.spring.admin.repository.BloodDriveInterface;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class BlooddriveRestController {
	@Autowired
	private BloodDriveInterface repo;
	@GetMapping("/user")
	
		public List<BloodDrive> userPage(){
		return repo.findAll();
	
	}
	@PostMapping("/user")
	public Boolean insertStudent(@RequestBody BloodDrive users) {
		try {
			repo.save(users);
		}catch(IllegalArgumentException e) {
			System.out.println("Entity is null,no json data received");
			e.printStackTrace();
			return false;
		}
		return true;
		
	}
	@DeleteMapping("/user/{id}")
	public Boolean delete (@PathVariable("id") int id) {
		try {
			repo.deleteById(id);
		}catch(IllegalArgumentException e) {
			
			e.printStackTrace();
			return false;
		}
		return true;
		
		
	
	}
	@PutMapping("/user")
	public Boolean update (@RequestBody BloodDrive blood) {
		try {
			repo.save(blood);
		}catch(IllegalArgumentException e) {
			
			e.printStackTrace();
			return false;
		}
		return true;
		
		
	
	}
	/*
	 * @PutMapping("/user/{id}") public boolean update(@PathVariable("id") int
	 * id,@RequestBody BloodDrive blood) { try { blood.setId(id); repo.save(blood);
	 * }catch(IllegalArgumentException e) {
	 * 
	 * e.printStackTrace(); return false; } return true;
	 * 
	 * 
	 * }
	 */

}
