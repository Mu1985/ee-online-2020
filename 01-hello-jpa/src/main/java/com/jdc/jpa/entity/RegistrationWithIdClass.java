package com.jdc.jpa.entity;

import static javax.persistence.TemporalType.DATE;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;
import javax.persistence.Temporal;

@Entity
@Table(name="Register_tbl1")
@IdClass(RegistrationIdWithIdClass.class)
public class RegistrationWithIdClass implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@Temporal(DATE)
	private Date registrationDt;
	@Id
	private int studentId;
	private int fees;
	private int paid;

	public Date getRegistrationDt() {
		return registrationDt;
	}

	public void setRegistrationDt(Date registrationDt) {
		this.registrationDt = registrationDt;
	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
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
