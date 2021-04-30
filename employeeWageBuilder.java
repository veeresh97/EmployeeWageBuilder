
public class employeeWageBuilder {
	public static void main(String[] args) {
		int Is_FullTime = 1;
		double empCheck = Math.floor(Math.random() * 10) % 2;
		if (empCheck == Is_FullTime)
			System.out.println("Employee is present");
		else
			System.out.println("Employee is Absent");

	}

}