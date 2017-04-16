/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3;

/**
 *
 * @author SEBASTIAN.DUQUE
 */
public class MyDate {

    // Variables
    int day, year, month;

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

    public void setDate(int month, int day, int year) {
        this.month = month;
        this.day = day;
        this.year = year;
    }

}
