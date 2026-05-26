package com;

import java.util.ArrayList;
import java.util.List;

import com.model.Driver;
import com.service.Travel;

public class Test {

	public static void main(String[] args) {
		
		ArrayList<Driver> drivers = new ArrayList<Driver>();
		drivers.add(new Driver(1,"Rajesh","Car",2000.65));
		drivers.add(new Driver(2,"Satya","Lorry",365.65));
		Driver carDriver=new Driver(3,"Siva","Car",897.2);
		drivers.add(carDriver);
		drivers.add(new Driver(4,"Prapul","Car",560.24));
		drivers.add(new Driver(5,"Ram","Auto",89.23));
		drivers.add(new Driver(6,"Narendra","bike",250.81));
		drivers.add(new Driver(7,"tarun","Auto",345.09));

		Travel travel=new Travel();
		boolean isCarDriver =travel.isCarDriver(carDriver);
		System.out.println(isCarDriver);
		
		
		String retriveByDriverId=travel.retriveByDriverId(drivers, 5);
		System.out.println(retriveByDriverId);
		String retriveByDriverId2=travel.retriveByDriverId(drivers, 15);
		System.out.println(retriveByDriverId2);
		
		long retriveCountOfDriver = travel.retriveCountOfDriver(drivers, "Car");
		System.out.println(retriveCountOfDriver);
		
		List<Driver> retriveDriver = travel.retriveDriver(drivers, "bike");
		System.out.println(retriveDriver);
	}
}
