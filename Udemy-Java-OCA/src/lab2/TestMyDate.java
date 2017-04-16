/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2;

/**
 *
 * @author SEBASTIAN.DUQUE
 */
public class TestMyDate {

    public static void main(String[] args) {
        
        MyDate date1 = new MyDate(11, 11, 1918);
        MyDate date2 = new MyDate();
        date2.day = 11;
        date2.month = 11;
        date2.year = 1918;
        MyDate date3 = new MyDate();
        date3.setDate(4, 21, 1968);
        MyDate date4 = new MyDate();        
        String str1 = date1.toString();
        String str2 = date2.toString();
        String str3 = date3.toString();
        String str4 = date4.toString();
        
        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3);
        System.out.println(str4);

    }

}
