
public class CompanyEmpWage {
	public final String company;
    public final int per_hours_wage;
    public final int max_work_days;
    public final int max_work_hours;
    public int salary;

    public CompanyEmpWage(String company, int per_hour_wage, int max_work_days, int max_work_hours) {
        this.company = company;
        this.per_hours_wage = per_hour_wage;
        this.max_work_days = max_work_days;
        this.max_work_hours = max_work_hours;
    }

    public void setTotalEmpWage(int salary){
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Total salary for company " + company + " is : " + this.salary;
    }
}


