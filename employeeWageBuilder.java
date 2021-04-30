
public class employeeWageBuilder {
	public static final int Is_FullTime = 1;
	public static final int Is_PartTime = 2;
	public static final int Wage_per_hour = 20;
	
		public static void main(String [] args) {
		int emphrs = 0;
		int EmpWage = 0;
		
		int empCheck =(int) Math.floor(Math.random() * 10) % 3;
		switch (empCheck) {
		case Is_FullTime:
			emphrs = 8;
			break;
		case Is_PartTime:
			emphrs = 4;
			break;
		default:
		   emphrs = 0;
		}
		
		EmpWage = Wage_per_hour * emphrs;
		System.out.println("Employee wage is: " + EmpWage);
	}
}