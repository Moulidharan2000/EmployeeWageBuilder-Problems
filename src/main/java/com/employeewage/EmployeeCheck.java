package com.employeewage;

public class EmployeeCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int isFullTime = 1;
		int empcheck =(int) Math.floor(Math.random()*10)/2;
		if (empcheck == isFullTime) {
			System.out.println("Employee is Present");
		}
		else {
			System.out.println("Employee is Absent");                     
		
		}

}

}