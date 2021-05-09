
public class employeeWageBuilder {
	public static final int PRESENT_FULL_TIME = 2;
    public static final int PRESENT_PART_TIME = 1;
    public static final int IS_FULL_TIME = 8;
    public static final int IS_PART_TIME = 4;

    private int numOfCompany = 0;
    private CompanyEmpWage[] companyEmpWageArray;

    public employeeWageBuilder(){
        companyEmpWageArray = new CompanyEmpWage[5];
    }

    private void addCompanyEmpWage(String company, int per_hour_wage, int max_work_days, int max_work_hours){
        companyEmpWageArray[numOfCompany]= new CompanyEmpWage(company,per_hour_wage,max_work_days,max_work_hours);
        numOfCompany++;
    }

    private void calculateSalary(){
        for(int i=0;i<numOfCompany;i++){
            companyEmpWageArray[i].setTotalEmpWage(this.calculateSalary(companyEmpWageArray[i]));
            System.out.println(companyEmpWageArray[i]);
        }
    }

    private int calculateSalary(CompanyEmpWage companyEmpWage) {
        int work_hours = 0, work_days = 0;
        while (work_hours < companyEmpWage.max_work_hours && work_days < companyEmpWage.max_work_days) {
            work_days++;
            double empcheck = Math.floor(Math.random() * 10) % 3;
            int check = (int) empcheck;
            switch (check) {
                case PRESENT_FULL_TIME:
                    work_hours += IS_FULL_TIME;
                    break;
                case PRESENT_PART_TIME:
                    work_hours += IS_PART_TIME;
                    break;
                default:
                    work_hours += 0;
            }
            System.out.println("Day" + work_days + " Total working hrs " + work_hours);
        }
        return companyEmpWage.salary = work_hours * companyEmpWage.per_hours_wage;
    }


    public static void main(String[] args) {
    	employeeWageBuilder empWageBuilder = new employeeWageBuilder();
        empWageBuilder.addCompanyEmpWage("DMart", 20, 25, 100);
        empWageBuilder.addCompanyEmpWage("tcs", 25, 25, 100);
        empWageBuilder.calculateSalary();
    }
}

	
