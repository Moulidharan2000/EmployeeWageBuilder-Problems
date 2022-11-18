package com.employeewage;

public class PartTimeEmployeeWage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int IsPartTime = 1;
		int IsFullTime = 2;
		int RateperHour = 20;
		int emphrs = 0;
		int empwage = 0;
		double empcheck = Math.floor(Math.random()*10)%3;
		if (empcheck == IsPartTime) {
			emphrs = 4;
		}
		else if (empcheck == IsFullTime ) {
			emphrs = 8;
		}
		else {
			emphrs = 0;
		}
		empwage = emphrs*RateperHour ;
		System.out.println("Employee Wage : "+ empwage);

	}

}
