package com.learn.java.inheritance;

public class Programmer extends Employee{
	int bonus=10000;  
	
	public int getBonus() {
		return bonus;
	}
	public void setBonus(int bonus) {
		this.bonus = bonus;
	}
	
	public float totalIncome() {
		float income = salary + bonus;
		return income;
	}
	
	

}
