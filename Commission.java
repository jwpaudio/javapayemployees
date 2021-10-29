//----------------------------------------------------------------------------------------------------------
//Assignment: Lab 5 II
//File Name: Commission.java
//Author: Joshua Pardridge
//ID: 1219443316
//Topic: Extending the hourly class
//Description: Create a commission employee which is a type of hourly employee and pay them
//----------------------------------------------------------------------------------------------------------

package com.joshuapardridge.anothertypeofemployee;

public class Commission extends Hourly{

    //Instance data
    private double totalSales, commissionRate;

    //Default constructor for an commission hourly employee
    public Commission(String eName, String eAddress, String ePhone,
                      String socSecNumber, double rate, double commissionRate)
    {
        super(eName, eAddress, ePhone, socSecNumber, rate);
        this.commissionRate = commissionRate;
        hoursWorked = 0;
    }

    //Method that adds in the total sales of the employee
    public void addSales(double totalSales){
        this.totalSales = totalSales;
    }

    //Implements pay method but adds in commission
    public double pay()
    {
        double payment = super.pay() + (commissionRate * totalSales);
        totalSales = 0;
        return payment;
    }

    //Returns information about the employee and adds in the commission
    public String toString()
    {
        String result = super.toString();
        result += "\nTotal Sales: " + totalSales;
        return result;
    }
}
