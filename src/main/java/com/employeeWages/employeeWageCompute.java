package com.employeeWages;

import java.util.Random;

public class employeeWageCompute {
	
	final static int FULL_TIME_WORKER = 1;
    final static int PART_TIME_WORKER = 2;    
    public static void calculation(String company, int EMP_RATE_PER_HOUR, int Total_no_Working_Day, int EMP_TOTAL_HOURS) {
        int totalworkingdays = 0;
        int empHours = 0;
        int empWage = 0;
        int Totalemphrs = 0;

        int Total_emp_wage = 0;
        while (Totalemphrs <= EMP_TOTAL_HOURS && totalworkingdays <= Total_no_Working_Day) {
            totalworkingdays++;
            Random random = new Random();

            int empCheck = random.nextInt(2);

            switch (empCheck) {
                case FULL_TIME_WORKER:
                    empHours = 8;

                    break;
                case PART_TIME_WORKER:
                    empHours = 4;

                    break;
                default:
                    empHours = 0;
            }
        }
            Totalemphrs = Totalemphrs + empHours;
            empWage = empHours * EMP_RATE_PER_HOUR;
            System.out.println("Daily emp wage is : "+empWage+"\n");
            Total_emp_wage = empWage + Totalemphrs;
            Total_emp_wage = Total_emp_wage * Total_no_Working_Day;

            System.out.println("The Monthly Wage of Employee of " + company + " is " + Total_emp_wage);
        }
	public void calculation() {
		System.out.println("Welcome to Employee Wage Builder ");
		System.out.println();
		calculation("Google", 20, 20, 200);
        System.out.println();
        calculation("Amazon", 30, 30, 300);
        System.out.println();
        calculation("TCS", 50, 20, 220);
		
	}


	
	}
