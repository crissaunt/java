/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

import java.util.Scanner;


public class Jpe04_solayao
{
	public static void main(String[] args) {
		System.out.println("Hello World");
		
		Scanner io = new Scanner(System.in);
		
		String emp_fname, emp_lname ;
		int renderDays;
		float rateDays;
		float sssContribution, philHealthContribution, loans,tax, totalDeduc, totalPhp, grossSal ;
		
		System.out.print("Enter your First Name Day/s: ");
		emp_fname = io.nextLine();
		
		System.out.print("Enter your Last Name: ");
		emp_lname = io.nextLine();
		
		System.out.print("Enter  Rendered Days: ");
		renderDays = io.nextInt();
		
		System.out.print("Enter Rate per Day: ");
		rateDays = io.nextFloat();
		
		grossSal = renderDays * rateDays;
		
		
		System.out.print("Enter your SSS/GSIS: ");
		sssContribution = io.nextFloat();
		
		System.out.print("Enter your PhilHealth: ");
		philHealthContribution = io.nextFloat();
		
		System.out.print("Enter your Loans: ");
		loans = io.nextFloat();
		
		tax = grossSal * 0.15f;
		
		
		totalDeduc= sssContribution +  philHealthContribution + loans + tax;
		totalPhp = grossSal- totalDeduc ;
		
	
		
		System.out.println("\n\n===========PAYSLIP=============\n\n");
		
		System.out.format("======EMPLOYEE INFORMATION=====\n");
		System.out.format("Employee Name:    %s %s\n",emp_fname, emp_lname );
		System.out.format("Rendered Day/s:   %d\n", renderDays);
		System.out.format("Rate per Day/s:   %f\n", rateDays);
		System.out.format("Gross Salary:     %f\n", grossSal);
		
		System.out.println("\n");
		
		System.out.format("SSS/GSIS:    %f\n", sssContribution);
		System.out.format("PhilHealth:  %f\n", philHealthContribution);
		System.out.format("Loans:       %f\n", loans);
		System.out.format("Tax:         %f\n",tax);
		System.out.format("Total Deduction: %f\n",totalDeduc);
		
		System.out.println("==========NET SALARY ============\n\n");
		System.out.format("PHP:         %f", totalPhp);
		
	}
}