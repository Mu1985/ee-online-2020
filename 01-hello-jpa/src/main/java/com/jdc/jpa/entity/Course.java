package com.jdc.jpa.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.GeneratedValue;

@Entity
@SequenceGenerator(name = "Course_seq")
public class Course implements Serializable {

	
	private static final long serialVersionUID = 1L; //to control Class version
	
	@Id
	@GeneratedValue(generator = "Course_seq")
	private int id;
	private String name;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public int getFees() {
		return fees;
	}
	public void setFees(int fees) {
		this.fees = fees;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	private String description;
	private int fees;
}
