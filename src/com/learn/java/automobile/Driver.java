package com.learn.java.automobile;

public class Driver {
	private Vehicle vehicle;

	public Driver(Vehicle v)
    {
		vehicle = v;
    }
	
	public void test(){
		if(vehicle.getNoofwheel() == 2) {
			vehicle = new TwoWheeler(vehicle.getRegno(), vehicle.getModel(), vehicle.getNoofwheel());
			
		} else if(vehicle.getNoofwheel() == 4){
			vehicle = new FourWheeler(vehicle.getRegno(), vehicle.getModel(), vehicle.getNoofwheel());
		}
		
		vehicle.test();
	}

}
