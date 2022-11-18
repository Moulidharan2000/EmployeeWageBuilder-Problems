package com.employeewage;

public class EmployeeWageforMonth {
	public static final int IsPartTime = 1;
	public static final int IsFullTime = 2;
	public static final int RateperHour = 20;
	public static final int NumofWorkingDays = 2;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int emphrs = 0;
		int empwage = 0;
		int totalEmpWage = 0;
		for (int i=0; i<NumofWorkingDays; i++) {
			int empcheck = (int) Math.floor(Math.random()*10)%3;
			switch (empcheck) {
			case IsPartTime:
				emphrs = 4;
				break;
			case IsFullTime:
				emphrs = 8;
				break;
			default :
				emphrs = 0;
			}
			empwage = emphrs * RateperHour;
			totalEmpWage += empwage;
		}
		System.out.println("Total Employee Wage : "+ totalEmpWage);

	}

}
