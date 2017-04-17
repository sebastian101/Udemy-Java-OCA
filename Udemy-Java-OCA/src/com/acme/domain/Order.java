package com.acme.domain;

import com.acme.utils.MyDate;

public class Order {
	MyDate orderDate;
	double orderAmount = 0.00;
	String customer;
	String product;
	int quantity;
	public static double taxRate = 0.05;
	char size;
	double discount;
	double orderTotal;

	// Methods

	public char jobsize() {
		size = (quantity <= 25) ? 'S' : (quantity <= 75) ? 'M'
				: (quantity <= 150) ? 'L' : 'X';
		return size;
	}

	public double computeTotal()
	{		
		discount = (size == 'S') ? orderAmount * 0.0 : (size == 'M') ? orderAmount * 0.01 : (size == 'L') ? orderAmount * 0.02 : orderAmount * 0.03;		
		if (orderAmount > 1500) {
			orderTotal = orderAmount - discount; 
		}
		else{
			orderTotal = orderAmount - discount + computeTax();
		}
		return orderTotal;
	}

	public static void setTaxRate(double newRate) {
		taxRate = newRate;
	}

	public static void computeTaxOn(double anAmount) {
		System.out.println("The tax for " + anAmount + " is: " + anAmount
				* Order.taxRate);
	}

	public Order(MyDate d, double amt, String c, String p, int q) {
		orderDate = d;
		orderAmount = amt;
		customer = c;
		product = p;
		quantity = q;
	}

	public String toString() {
		return quantity + " ea. " + product + " for " + customer;
	}

	public double computeTax() {
		System.out.println("The tax for this order is: " + orderAmount
				* Order.taxRate);
		return orderAmount * Order.taxRate;
	}
}