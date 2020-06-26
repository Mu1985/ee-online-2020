package com.jdc.jpa.entity;

import java.io.Serializable;
import java.lang.String;
import java.util.Date;

import javax.persistence.*;
import static javax.persistence.GenerationType.AUTO;
import static javax.persistence.GenerationType.IDENTITY;
import static javax.persistence.GenerationType.SEQUENCE;
import static javax.persistence.GenerationType.TABLE;
import static javax.persistence.TemporalType.DATE;
import static javax.persistence.EnumType.STRING;

/**
 * Entity implementation class for Entity: Student
 *
 */
@Entity
@Table(name = "Student_tbl")
//@SecondaryTable(name="Personal_tbl")
//@SecondaryTables({ @SecondaryTable(name = "Personal_tbl"), @SecondaryTable(name = "Phone_tbl") })

@SequenceGenerator(name = "Student_seq")
public class Student implements Serializable {

	public enum Gender {
		Male, Female
	};

	@Id
	@GeneratedValue(strategy = TABLE, generator = "Student_seq")
	private int Id;
//	@Column(table = "Personal_tbl")
	private String Name;
//	@Column(table="Phone_tbl")
	private String Phone;
	private SecurityInfo security;

	@Enumerated(STRING)
	@Column(length = 10)
	private Gender gender;

	@Temporal(DATE)
	
	@Column(nullable = true)
	private Date dob;
	private static final long serialVersionUID = 1L;

	public Student() {
		super();
	}

	public int getId() {
		return this.Id;
	}

	public void setId(int Id) {
		this.Id = Id;
	}

	public String getName() {
		return this.Name;
	}

	public void setName(String Name) {
		this.Name = Name;
	}

	public String getPhone() {
		return this.Phone;
	}

	public void setPhone(String Phone) {
		this.Phone = Phone;
	}

}
