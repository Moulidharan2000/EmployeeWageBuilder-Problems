package com.employeewage;

public class EmployeeWageforTotalWorkingHours {
	public static final int IsPartTime = 1;
	public static final int IsFullTime = 2;
	public static final int RateperHour = 20;
	public static final int NumofWorkingDays = 2;
	public static final int MaxhoursinMonth = 10;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int emphrs = 0;
		int totalemphrs = 0;
		int totalWorkingDays = 0;
		while (totalemphrs <= MaxhoursinMonth && totalWorkingDays < NumofWorkingDays) {
			totalWorkingDays++;
			int empcheck = (int) Math.floor(Math.random()*10)%3;
			switch (empcheck) {
			case IsPartTime :
				emphrs = 4;
				break;
			case IsFullTime :
				emphrs = 8;
				break;
			default :
				emphrs = 0;
			}
			totalemphrs += emphrs;
			System.out.println("Day : "+totalWorkingDays+ " Employee Hour : "+emphrs);
		}
		int totalempwage = totalemphrs * RateperHour;
		System.out.println("Total Employee Wage : "+totalempwage);

	}

}
