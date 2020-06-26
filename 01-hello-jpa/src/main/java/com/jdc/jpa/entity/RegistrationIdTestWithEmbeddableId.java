package com.jdc.jpa.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.Temporal;
import javax.persistence.Basic;
import static javax.persistence.FetchType.EAGER;
import static javax.persistence.FetchType.LAZY;
import static javax.persistence.TemporalType.DATE;


@Embeddable
public class RegistrationIdTestWithEmbeddableId implements Serializable {

	private static final long serialVersionUID = 1L;
	
	
	@Temporal(DATE)
	private Date registrationDt;
	private int studentId;

	public Date getRegistrationDt() {
		return registrationDt;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((registrationDt == null) ? 0 : registrationDt.hashCode());
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
		RegistrationIdTestWithEmbeddableId other = (RegistrationIdTestWithEmbeddableId) obj;
		if (registrationDt == null) {
			if (other.registrationDt != null)
				return false;
		} else if (!registrationDt.equals(other.registrationDt))
			return false;
		if (studentId != other.studentId)
			return false;
		return true;
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
