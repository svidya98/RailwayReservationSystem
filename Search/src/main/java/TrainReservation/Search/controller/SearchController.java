package TrainReservation.Search.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import TrainReservation.Search.model.Search;
import TrainReservation.Search.repository.Train;

@RestController
@RequestMapping("/traindetails")
public class SearchController {
	
	@Autowired
	Train trainrepository;
	
	@GetMapping(path= "/details")
	public List<Search>getname(){
		return trainrepository.findAll();
	}
	
	
	@GetMapping("/details/{trainid}")
	public Optional<Search> gettrainname(@PathVariable String trainid){
		return trainrepository.findById(trainid);
	}
	
	
	@PostMapping("search")
	public String addTrain(@RequestBody Search train) {
	   trainrepository.insert(train);
	   return "train added:" +train.getTrainid();
	}
	
	@DeleteMapping("search/{trainid}")
	public String delete(@PathVariable String trainid) {
		trainrepository.deleteById(trainid);
		return "train deleted:" +gettrainname(trainid);
	}

}
