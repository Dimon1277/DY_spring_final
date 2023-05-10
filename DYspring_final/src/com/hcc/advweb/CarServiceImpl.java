package com.hcc.advweb;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class CarServiceImpl implements CarService {

	@Autowired
	private CarDAO studentDAO;
	
	public CarServiceImpl() {
		// TODO Auto-generated constructor stub
	}

	@Override
	@Transactional
	public void addCar(Car student) {
		studentDAO.addCar(student);		
	}

	@Override
	@Transactional
	public ArrayList<Car> getCarsList() {
		return studentDAO.getStudentsList();
	}

	@Override
	@Transactional
	public Car getCar(int Id) {
		return studentDAO.getCar(Id);
	}

	@Override
	@Transactional
	public Car updateCar(Car student) {
		return studentDAO.updateCar(student);
	}
	
	

}
