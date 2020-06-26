package com.jdc.jpa.entity;

import java.io.Serializable;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="Register_tbl")
public class RegistrationTestWithEmbeddableId implements Serializable {

	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private RegistrationIdTestWithEmbeddableId id;
	private int fees;
	private int paid;

	public RegistrationIdTestWithEmbeddableId getId() {
		return id;
	}

	public void setId(RegistrationIdTestWithEmbeddableId id) {
		this.id = id;
	}

	public int getFees() {
		return fees;
	}

	public void setFees(int fees) {
		this.fees = fees;
	}

	public int getPaid() {
		return paid;
	}

	public void setPaid(int paid) {
		this.paid = paid;
	}

	

}
