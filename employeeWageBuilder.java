
public class employeeWageBuilder {
	public static final int Is_FullTime = 1;
	public static final int Is_PartTime = 2;
	public static final int Wage_per_hour = 20;
	public static final int Total_work_days = 20;
	
		public static void main(String [] args) {
		int emphrs = 0;
		int EmpWage = 0;
		int TotalWage = 0;
		for (int day = 0; day<Total_work_days; day++) {
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
		TotalWage += EmpWage;
		System.out.println("Employee wage is: " + EmpWage);
	}
	System.out.println("Total Employee wage is :" + TotalWage);
  }
}