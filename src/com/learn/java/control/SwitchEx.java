package com.learn.java.control;

public class SwitchEx {
 
    private String dayType; 
    private String dayString;
    
	public void printDay(int day) {
		switch (day) { 
        case 1: 
            dayString = "Monday"; 
            break; 
        case 2: 
            dayString = "Tuesday"; 
            break; 
        case 3: 
            dayString = "Wednesday"; 
            break; 
        case 4: 
            dayString = "Thursday"; 
            break; 
        case 5: 
            dayString = "Friday"; 
            break; 
        case 6: 
            dayString = "Saturday"; 
            break; 
        case 7: 
            dayString = "Sunday"; 
            break; 
        default: 
            dayString = "Invalid day"; 
        }
		
		switch (day) {  
        case 1: 
        case 2: 
        case 3: 
        case 4: 
        case 5: 
            dayType = "Weekday"; 
            break; 
        case 6: 
        case 7: 
            dayType = "Weekend"; 
            break; 
  
        default: 
            dayType = "Invalid daytype"; 
        } 
  
        System.out.println(dayString + " is a " + dayType); 
	}

}
