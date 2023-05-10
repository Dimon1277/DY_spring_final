package com.hcc.advweb;

import java.util.ArrayList;

public interface CarService {

	
	public void addCar(Car student);
	
	public Car getCar(int Id);
	
	public ArrayList<Car> getCarsList();
	
	public Car updateCar(Car student);
	
}
