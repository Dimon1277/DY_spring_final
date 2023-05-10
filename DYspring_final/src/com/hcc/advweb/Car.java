package com.hcc.advweb;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.id.ResultSetIdentifierConsumer;

@Entity
@Table(name="cars")
public class Car implements Serializable {

	@Id
	@Column(name="ID")
	private int id;
	@Column(name="make")
	private String make;
	@Column(name="model")
	private String model;
	@Column(name="year")
	private int year;
	@Column(name="mileage")
	private String mileage;
	@Column(name="color")
	private String color;
	public int getId()
	{
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getMake() {
		return make;
	}

	public void setMake(String fname) {
		this.make = fname;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String lname) {
		this.model = lname;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int phone) {
		this.year = phone;
	}

	public String getMileage() {
		return mileage;
	}

	public void setMileage(String address1) {
		this.mileage = address1;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String address2) {
		this.color = address2;
	}
	public Car() {
		// TODO Auto-generated constructor stub
	}
	
	public Car(int id,String fname, String lname) {
		this.id = id;
		setMake(fname);
		setModel(lname);		
	}

	@Override
	public String toString() {
		return "Car ["+make+model+mileage+year+color+ "]";
	}
	
	

}
