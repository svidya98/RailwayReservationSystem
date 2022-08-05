package com.TrainReservation.Checkin.model;


import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Transient;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="checkin")
public class CheckInRecord {
	
	
	@Transient
	public static final String SEQUENCE_NAME= "checkin_id";
	
	@Id
	long checkinId;
	
	private String firstname;
	private String lastname;
	private String seatnum;
	private String Trainnum;
	private String trainDate;
	
	public CheckInRecord( long checkinId, String firstname, String lastname, String seatnum, String trainnum, String trainDate) {
	    this.checkinId=checkinId;
		this.firstname = firstname;
		this.lastname = lastname;
		this.seatnum = seatnum;
		this.Trainnum = trainnum;
		this.trainDate = trainDate;
	}
	
	public long getcheckinId() {
		return checkinId;
	}
	
	public void setcheckinId(long checkinId) {
		this.checkinId=checkinId;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getSeatnum() {
		return seatnum;
	}
	public void setSeatnum(String seatnum) {
		this.seatnum = seatnum;
	}
	public String getTrainnum() {
		return Trainnum;
	}
	public void setTrainnum(String trainnum) {
		Trainnum = trainnum;
	}
	public String getTrainDate() {
		return trainDate;
	}
	public void setTrainDate(String trainDate) {
		this.trainDate = trainDate;
	}

	@Override
	public String toString() {
		return "CheckInRecord [checkinId=" + checkinId + ", firstname=" + firstname + ", lastname=" + lastname
				+ ", seatnum=" + seatnum + ", Trainnum=" + Trainnum + ", trainDate=" + trainDate + "]";
	}
	

}
