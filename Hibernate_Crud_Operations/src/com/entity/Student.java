package com.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "StudentsRecord")
public class Student {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int studid;
	private String sname;
	private int studAge;
	@Column(name = "Address")
	private String city;

	public Student() {

	}

	public Student(int studid, String sname, int studAge, String city) {
		super();
		this.studid = studid;
		this.sname = sname;
		this.studAge = studAge;
		this.city = city;
	}

	public int getStudid() {
		return studid;
	}

	public void setStudid(int studid) {
		this.studid = studid;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public int getStudAge() {
		return studAge;
	}

	public void setStudAge(int studAge) {
		this.studAge = studAge;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return "Student [studid=" + studid + ", sname=" + sname + ", studAge=" + studAge + ", city=" + city + "]";
	}

}
