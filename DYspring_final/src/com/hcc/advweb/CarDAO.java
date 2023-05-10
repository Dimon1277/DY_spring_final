package com.hcc.advweb;

import java.util.ArrayList;

public interface CarDAO {

	public void addCar(Car car);
	
	public ArrayList<Car> getStudentsList();
	
	public Car getCar(int Id);
	
	public Car updateCar(Car car);



}
