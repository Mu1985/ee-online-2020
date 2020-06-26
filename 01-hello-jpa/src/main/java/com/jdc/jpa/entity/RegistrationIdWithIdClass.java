package com.jdc.jpa.entity;

import static javax.persistence.TemporalType.DATE;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Temporal;

public class RegistrationIdWithIdClass implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private Date registrationDt;
	private int studentId;

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + studentId;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		RegistrationIdWithIdClass other = (RegistrationIdWithIdClass) obj;
		if (studentId != other.studentId)
			return false;
		return true;
	}

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
}
