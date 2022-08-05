package com.TrainReservation.Admin.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="Traindetails")
public class Admin {
	
	@Id
	
	private String trainid;
	
	private String trainno;
	
	private String trainname;
	
	private String boarding;
	 
	private String destination;
	
	private String fare;

	public Admin(String trainid, String trainno, String trainname, String boarding, String destination, String fare) {
		super();
		this.trainid = trainid;
		this.trainno = trainno;
		this.trainname = trainname;
		this.boarding = boarding;
		this.destination = destination;
		this.fare = fare;
	}

	public String getTrainid() {
		return trainid;
	}

	public void setTrainid(String trainid) {
		this.trainid = trainid;
	}

	public String getTrainno() {
		return trainno;
	}

	public void setTrainno(String trainno) {
		this.trainno = trainno;
	}

	public String getTrainname() {
		return trainname;
	}

	public void setTrainname(String trainname) {
		this.trainname = trainname;
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

	public String getFare() {
		return fare;
	}

	public void setFare(String fare) {
		this.fare = fare;
	}

	@Override
	public String toString() {
		return "Admin [trainid=" + trainid + ", trainno=" + trainno + ", trainname=" + trainname + ", boarding="
				+ boarding + ", destination=" + destination + ", fare=" + fare + "]";
	}

	
   
	 

}
