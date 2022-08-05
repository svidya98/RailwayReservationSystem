package com.TrainReservation.Checkin.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="Checkin_id")
public class Checkin {
	
	@Id
	
	private String trainid;
	private String seatno;
	private String status;
	
	public Checkin(String trainid, String seatno, String status) {
		super();
		this.trainid = trainid;
		this.seatno = seatno;
		this.status = status;
	}
	public String getTrainid() {
		return trainid;
	}
	public void setTrainid(String trainid) {
		this.trainid = trainid;
	}
	public String getSeatno() {
		return seatno;
	}
	public void setSeatno(String seatno) {
		this.seatno = seatno;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	@Override
	public String toString() {
		return "Checkin [trainid=" + trainid + ", seatno=" + seatno + ", status=" + status + "]";
	}
	
	}
