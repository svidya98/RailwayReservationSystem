package com.TrainReservation.Admin.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.TrainReservation.Admin.Repository.AdminRepository;
import com.TrainReservation.Admin.model.Admin;

@RestController
public class AdminController {

	@Autowired
	private AdminRepository repository;
	
	
	@PostMapping("/addtrains")
	public String reserve(@RequestBody Admin admin) {
	repository.save(admin);
	return "Added Train with id:" +admin.getTrainid();
	}
	

	@GetMapping("/getAlltrains")
	public List<Admin> getreserved(){
		return (List<Admin>) repository.findAll();
	}
	
	
	@GetMapping("/getAlltrains/{trainid}")
	public java.util.Optional<Admin> getTrainname(@PathVariable("Trainid") String Trainid){
		return repository.findById(Trainid);
	}
	
	@DeleteMapping("/getAlltrains/{trainid}")
	public String deletetrain(@PathVariable String trainid) {
	repository.deleteById(trainid);
	return "Train deleted with id:  "+trainid;
			
		}
	
	@PutMapping("/getAlltrains/{trainid}")
	public Admin updatetrain(@PathVariable("trainid") String trainid,@RequestBody Admin t){
	t.setTrainid(trainid);
	repository.save(t);
	return t;
	}
		
	}
