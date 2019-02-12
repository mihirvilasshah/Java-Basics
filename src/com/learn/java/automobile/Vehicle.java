package com.learn.java.automobile;

public class Vehicle {
	private String regno;
    private int model;
    private int noofwheel;
    
    public String getRegno() {
		return regno;
	}
	public void setRegno(String regno) {
		this.regno = regno;
	}
	public int getModel() {
		return model;
	}
	public void setModel(int model) {
		this.model = model;
	}
	public int getNoofwheel() {
		return noofwheel;
	}
	public void setNoofwheel(int noofwheel) {
		this.noofwheel = noofwheel;
	}
	public Vehicle(String r, int m, int n)
    {
        regno=r;
        model=m;
        noofwheel=n;
    }
    void display()
    {
        System.out.println("Registration no: "+regno);
        System.out.println("Model no: "+model);
    }
	public void test() {
		System.out.println("Driving Test");
		
	}
    
    //Driver d3 = new Driver(two/four);

}
