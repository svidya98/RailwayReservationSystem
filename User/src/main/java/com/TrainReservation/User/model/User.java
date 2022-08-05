package com.TrainReservation.User.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document("users")
public class User {
	@Id
	private String userid;
	
	@Field
	private String username;
	
	@Field
	private String useremail;
	
	@Field
	private String userphnno;

	public User(String userid, String username, String useremail, String userphnno) {

		this.userid = userid;
		this.username = username;
		this.useremail = useremail;
		this.userphnno = userphnno;
	}

	public String getUserid() {
		return userid;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getUseremail() {
		return useremail;
	}

	public void setUseremail(String useremail) {
		this.useremail = useremail;
	}

	public String getUserphnno() {
		return userphnno;
	}

	public void setUserphnno(String userphnno) {
		this.userphnno = userphnno;
	}

}
