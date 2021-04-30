
public class employeeWageBuilder {
	public static void main(String[] args) {
		int Is_FullTime = 1;
		int Wage_per_hour = 20;
		
		int emphrs = 0;
		int EmpWage = 0;
		
		double empCheck = Math.floor(Math.random() * 10) % 2;
		if (empCheck == Is_FullTime)
			emphrs = 8;
		else
			emphrs = 0;
		
		EmpWage = Wage_per_hour * emphrs;
		System.out.println("Employee wage is: " + EmpWage);
	}

}