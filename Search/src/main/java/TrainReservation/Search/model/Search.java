package TrainReservation.Search.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection= "Traindetails")
public class Search {
	@Id
	private String  trainid;
	private String  boarding;
	private String  destination;
	
	public Search(String trainid, String boarding, String destination) {
		super();
		this.trainid = trainid;
		this.boarding = boarding;
		this.destination = destination;
	}
	public String getTrainid() {
		return trainid;
	}
	public void setTrainid(String trainid) {
		this.trainid = trainid;
	}
	public String getBoarding() {
		return boarding;
	}
	public void setBoarding(String boarding) {
		this.boarding = boarding;
	}
	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
	@Override
	public String toString() {
		return "Search [trainid=" + trainid + ", boarding=" + boarding + ", destination=" + destination + "]";
	}
	
	

	
	}
	


