package com.service;

import java.util.ArrayList;
import java.util.stream.Collectors;

import com.model.Driver;

public class Travel {
	
	public boolean isCarDriver(Driver driver) {
		
		//if(driver.getCategory().equalsIgnoreCase("CAR")) {
		//	return true;
		//}
		//return false;
		
		return driver.getCategory().equalsIgnoreCase("CAR");
	}
    
	public String retriveByDriverId(ArrayList<Driver> drivers, int driverId) {
		
//		for(Driver driver : drivers) {
//			if(driver.getDriverId()== driverId) {
//				return "Driver name id" + driver.getDriverName() + "belonging to the category"
//						+ driver.getCategory() + "traveled" + driver.getTotalDistance() + "KM so far";
//			}
//		}
//		return " No driver matched ";
		
		return drivers
		        .stream()
		        .filter(d -> d.getDriverId() == driverId)
		        .findFirst()
		        .map(d -> String.format(
		                "Driver name is %s belonging to the category %s traveled %.2f KM so far",
		                d.getDriverName(),
		                d.getCategory(),
		                d.getTotalDistance()
		        ))
		        .orElse("No driver matched");
	}
	
	//RetriveCountOfDriver : here return the count of driver
	
	public int retriveCountOfDriver(ArrayList<Driver> drivers, String category) {
//		int  count =0;
//		for(Driver driver : drivers) {
//			if (driver.getCategory().equals(Category)) {
//				count++;
//			}
//		}
//		return count;
		
		return (int) drivers
		        .stream()
		        .filter(d -> d.getCategory().equalsIgnoreCase(category))
		        .count();
	}
	
	//retiveDriver : driver who are belonging to the category should be return as a array list
	
	public ArrayList<Driver> retriveDriver(ArrayList<Driver> drivers, String category){
		
//		ArrayList<Driver> result = new ArrayList<Driver>();
//		for (Driver driver : drivers) {
//			
//			if (driver.getCategory().equalsIgnoreCase(category)) {
//				result.add(driver);
//			}
//		}
//		return result;
		
		
		return drivers
	            .stream()
	            .filter(d -> d.getCategory().equalsIgnoreCase(category))
	            .collect(Collectors.toCollection(ArrayList::new));
	}
	
	//retriveMaximumDistanceTravelledDriver (ArrayList<Driver>): this method will return the driver who traveled maximum distance
	
	public Driver retriveMaximumDistanceTravelledDriver(ArrayList<Driver> drivers) {
		
//		Driver maxDriver = drivers.get(0);
//		for (Driver driver : drivers) {
//			
//			if (driver.getTotalDistance() > maxDriver.getTotalDistance()) {
//				maxDriver = driver;
//			}
//		}
//		return maxDriver;
		
		return drivers
		 .stream()
		 .sorted((d1,d2) -> Double.compare(d2.getTotalDistance(),d1.getTotalDistance()))
		 .findFirst()
		 .get();
	}
	
}
