package com.hcc.advweb;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.hibernate.SessionFactory;

@Repository
public class CarDAOImpl implements CarDAO {
	
	@Autowired
	private SessionFactory sessionFactory;
	
	public CarDAOImpl() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void addCar(Car student) {
		sessionFactory.getCurrentSession().saveOrUpdate(student);
		// TODO Auto-generated method stub

	}

	@Override
	public ArrayList<Car> getStudentsList() {
		ArrayList<Car> studentsList = 
				(ArrayList<Car>)sessionFactory.
				getCurrentSession().createQuery("FROM Car").
				list();
		return studentsList;
	}

	@Override
	public Car getCar(int Id) {
		Car student = (Car)sessionFactory.getCurrentSession().get(Car.class, Id);
		return student;
	}

	@Override
	public Car updateCar(Car student) {
		
		return null;
	}
}
