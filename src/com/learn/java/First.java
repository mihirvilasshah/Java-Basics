package com.learn.java;

import com.learn.java.arrays.ThreeDArray;
import com.learn.java.arrays.TwoDArray;
import com.learn.java.automobile.Driver;
import com.learn.java.automobile.FourWheeler;
import com.learn.java.automobile.Maruti;
import com.learn.java.automobile.Porsche;
import com.learn.java.automobile.TwoWheeler;
import com.learn.java.automobile.Vehicle;
import com.learn.java.bool.BooleanLogicalOp;
import com.learn.java.control.SwitchEx;
import com.learn.java.encapsulation.Car;
import com.learn.java.inheritance.BabyDog;
import com.learn.java.inheritance.Cat;
import com.learn.java.inheritance.Dog;
import com.learn.java.inheritance.Programmer;
import com.learn.java.polymorphism.Add;
import com.learn.java.print.PrintAtoZ;

public class First {

	public static void main(String[] args) {
		//Hello World | main class
		System.out.println("Hello...");
		
		//Encapsulation | getters, setters
		Car car = new Car();
		car.setName("McLaren");
		System.out.println(car.getName());
		
		//Inheritance
		Programmer p=new Programmer();  
		System.out.println("Programmer salary is: "+p.getSalary());  
		System.out.println("Bonus of Programmer is: "+p.getBonus());
		System.out.println("Total income of Programmer is: "+p.totalIncome());
		
		//Single Inheritance
		Dog d = new Dog();  
		d.bark();  
		d.eat();
		
		//Multilevel Inheritance
		BabyDog bd = new BabyDog();  
		bd.weep();   
		bd.bark();  
		bd.eat();  
		
		//Hierarchical Inheritance
		Cat c = new Cat();  
		c.meow();  
		c.eat();  
		//c.bark();//Compile.Time.Error 
		
		//Polymorphism
		Add adder = new Add();
		adder.add(4, 5);
		adder.add("Hello", "World");
		
		//Automobile
		TwoWheeler t1;
		FourWheeler f1;
		t1=new TwoWheeler("KA 74 A 2345", 1,2);
	    f1=new FourWheeler("KA 34 B 5677",5,4);
		t1.display();
		f1.display();
		        
		Porsche p1=new Porsche("KA 01 A 0001",911,4);
		p1.steering();
		p1.brake();
		p1.accelerate();
		        
		Maruti m1=new Maruti("KA 01 G 4867",10,4);
		m1.steering();
		m1.brake();
		m1.accelerate();
		m1.display();
		
		Vehicle vehicle = new Vehicle("KA 01 A 0001",911,2);
		Driver d1 = new Driver(vehicle);
		d1.test();
		
		//PrintAtoZ
		PrintAtoZ pr = new PrintAtoZ();
		pr.printAtoZ();
		System.out.println();
		
		//Arrays
		TwoDArray twod = new TwoDArray();
		twod.printStepArray(-9);
		twod.printStepArray(6);
		twod.printProduct(4);
		
		ThreeDArray threed= new ThreeDArray();
		threed.print3DArray(3,4,2);
		
		//Switch case Example
		SwitchEx switchEx = new SwitchEx();
		switchEx.printDay(3);
		
		//Logical Boolean Operators
		BooleanLogicalOp boolOp = new BooleanLogicalOp();
		boolOp.boolLogicalOpDemo();
		       
	}

}
