/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.acme.utils;

/**
 *
 * @author SEBASTIAN.DUQUE
 */
public class MyDate {

    // Variables
    public int day;
	public int year;
	public int month;

    // Initialization block
    {
        day = 1;
        month = 1;
        year = 2000;
        
    }

    // Non-Args Const
    public MyDate() {
    }

    // 3 parameters Const
    public MyDate(int month, int day, int year) {
        setDate(month, day, year);
    }

    @Override
    //Method which return the date in format (M/D/Y)
    public String toString() {
        return month + "/" + day + "/" + year;
    }
    
    // Static method to list all the leap years
    public static void leapYears()
    {
    	for (int currentYear = 1752; currentYear <= 2020; currentYear = currentYear + 4){
    		if((currentYear % 100 != 0) || (currentYear % 400 == 0)){
    			System.out.println(currentYear + " is a leap year");
    		}
    	}
    	
    }

    public void setDate(int month, int day, int year) {
        this.month = month;
        this.day = day;
        this.year = year;
    }

}
