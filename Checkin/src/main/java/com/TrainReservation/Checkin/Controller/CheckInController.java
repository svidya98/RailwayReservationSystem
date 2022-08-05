package com.TrainReservation.Checkin.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.TrainReservation.Checkin.Repository.CheckInRepo;

import com.TrainReservation.Checkin.model.Checkin;


@RestController
@RequestMapping("/checkin")
public class CheckInController {
	
	@Autowired
	private CheckInRepo checkinRepo;
	
	
	
	@GetMapping(path="/check")
    public List<Checkin> getcheckedInList(){
        return checkinRepo.findAll();
	}
	
	
	@PostMapping(path="/checkin")
	public String add(@RequestBody Checkin seat) {
		checkinRepo.save(seat);
		return "Added Train with seatno:"+seat.getSeatno();
		
	}
	
	@GetMapping("trainid/{seatno}")
	public Optional<Checkin>getStatus(@PathVariable("seatno") String seatno){
		return checkinRepo.findById(seatno);
		}
	
	@PutMapping("trains/{trainid}")
	public Checkin update(@PathVariable("trainid")String trainid,@RequestBody Checkin checkin){
		checkin.setSeatno(trainid);
		checkinRepo.save(checkin);
		return checkin;
	}
	
	@DeleteMapping("trains/{trainid}")
	public String delete(@PathVariable String trainid) {
		checkinRepo.deleteById(trainid);
		return "train deleted:" +trainid;
		
	}
	  
		}
		
