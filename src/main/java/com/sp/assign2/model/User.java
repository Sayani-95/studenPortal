package com.sp.assign2.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class User {
	
	@Id
	@Column(name="User_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	    int id;
	    String username;
	    String password;

	    public User(String username, String password) {
	        this.username = username;
	        this.password = password;
	    }

	    public User(int id, String username, String password) {
	        this.id = id;
	        this.username = username;
	        this.password = password;
	    }

	    public User() {
	    }

	    public int getId() {
	        return id;
	    }

	    public void setId(int id) {
	        this.id = id;
	    }

	    public String getUsername() {
	        return username;
	    }

	    public void setUsername(String username) {
	        this.username = username;
	    }

	    public String getPassword() {
	        return password;
	    }

	    public void setPassword(String password) {
	        this.password = password;
	    }
}
