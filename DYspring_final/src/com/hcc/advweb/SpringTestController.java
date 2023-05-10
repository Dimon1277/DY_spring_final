package com.hcc.advweb;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/")
public class SpringTestController {


	@Autowired
	private CarService carService;
	
	@RequestMapping(value = "/index", method = RequestMethod.GET)
	public String viewCarDetails(ModelMap model) {
	    model.addAttribute("greetings", "Hi, You are entering in Dmitry's car database!");
	    return "hello";
	}
	
	@RequestMapping(value = "/fine", method = RequestMethod.GET)
	public String viewStudentDetails2(ModelMap model) {
	    model.addAttribute("greetingsFine", "Please enter database");
	    return "fine";
	}
	
	@RequestMapping(value = "/carslist", method = RequestMethod.GET)
	public ModelAndView viewCarList() {
	    ArrayList<Car> carList = carService.getCarsList();
	    
	    return new ModelAndView("carslist","carsList", carList);
	}

	@RequestMapping(value = "/addnewcar", method = {RequestMethod.GET,RequestMethod.POST})
	public ModelAndView addNewStudent(@RequestParam(name = "year") String year,
			@RequestParam(name = "make") String make,
			@RequestParam(name = "model") String model,
			@RequestParam(name = "color") String color,
			@RequestParam(name = "mileage") String mileage
			) {
		System.out.println("---------Here is all the info for adding this car -------"+
			year + "," + make + "," + model );
		// Create a newcar and add the new student to the list
		Car car = new Car(Integer.parseInt(year), make, model);
		car.setColor(color);
		car.setMileage(mileage);
		carService.addCar(car);
		// get the latestcar list and set the model with the list
		ArrayList<Car> carList = carService.getCarsList();
		
	    return new ModelAndView("carslist","carsList",carList);
	}

	
	@RequestMapping(value = "/removecar", method = {RequestMethod.GET,RequestMethod.POST})
	public ModelAndView removeCar(
			@RequestParam(name = "deletemake") String make,
			@RequestParam(name = "deletemodel") String model
			) {
		
		ArrayList<Car> carList = carService.getCarsList();
		
	    return new ModelAndView("carslist","carsList",carList);
	}
	


}
