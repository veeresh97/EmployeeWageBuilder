import java.util.*;

public class employeeWageBuilder implements IComputeEmpWage {
    public static final int PRESENT_FULL_TIME = 2;
    public static final int PRESENT_PART_TIME = 1;
    public static final int IS_FULL_TIME = 8;
    public static final int IS_PART_TIME = 4;

    private LinkedList<CompanyEmpWage> companyEmpWageLinkedList;
    private Map<String, CompanyEmpWage> companyToEmpWageMap;
    private ArrayList<CompanyEmpWage> companyEmpWageArray;

    public employeeWageBuilder() {
        companyEmpWageLinkedList = new LinkedList<>();
        companyToEmpWageMap = new HashMap<>();
        companyEmpWageArray = new ArrayList<CompanyEmpWage>();
    }

    public void addCompanyEmpWage(String company, int per_hour_wage, int max_work_days, int max_work_hours) {
        CompanyEmpWage companyEmpWage = new CompanyEmpWage(company, per_hour_wage, max_work_days, max_work_hours);
        companyEmpWageLinkedList.add(companyEmpWage);
        companyToEmpWageMap.put(company, companyEmpWage);
    }

    @Override
    public int getTotalWage(String company) {
        return companyToEmpWageMap.get(company).salary;
    }

    public void calculateSalary() {
        for (int i = 0; i < companyEmpWageLinkedList.size(); i++) {
            CompanyEmpWage companyEmpWage = companyEmpWageLinkedList.get(i);
            companyEmpWage.setTotalEmpWage(this.calculateSalary(companyEmpWage));
            System.out.println(companyEmpWage);
        }
    }

    public int calculateSalary(CompanyEmpWage companyEmpWage) {
        int work_hours = 0, work_days = 0, daily_wage = 0;
        while (work_hours < companyEmpWage.max_work_hours && work_days < companyEmpWage.max_work_days) {
            work_days++;
            double empcheck = Math.floor(Math.random() * 10) % 3;
            int check = (int) empcheck;
            switch (check) {
                case PRESENT_FULL_TIME:
                    work_hours += IS_FULL_TIME;
                    daily_wage = 8 * companyEmpWage.per_hours_wage;
                    break;
                case PRESENT_PART_TIME:
                    work_hours += IS_PART_TIME;
                    daily_wage = 4 * companyEmpWage.per_hours_wage;
                    break;
                default:
                    work_hours += 0;
            }
            System.out.println("Day" + work_days + " daily wage :" + daily_wage + " Total working hrs :" + work_hours);
            daily_wage = 0;
        }
        return companyEmpWage.salary = work_hours * companyEmpWage.per_hours_wage;
    }

    public ArrayList getCompanydetails() {
        ArrayList details = new ArrayList();
        Scanner obj = new Scanner(System.in);
        System.out.println("enter the company name");
        details.add(obj.nextLine());
        System.out.println("enter the per hour wage");
        details.add(obj.nextInt());
        System.out.println("enter the max work days");
        details.add(obj.nextInt());
        System.out.println("enter the max work hours");
        details.add(obj.nextInt());
        System.out.println(details);
        return details;
    }

    public static void main(String[] args) {
        employeeWageBuilder empWageBuilder = new employeeWageBuilder();
        ArrayList company1details = empWageBuilder.getCompanydetails();
        empWageBuilder.addCompanyEmpWage((String) company1details.get(0), (Integer) company1details.get(1),
                (Integer) company1details.get(2), (Integer) company1details.get(3));
        ArrayList company2details = empWageBuilder.getCompanydetails();
        empWageBuilder.addCompanyEmpWage((String) company2details.get(0), (Integer) company2details.get(1),
                (Integer) company2details.get(2), (Integer) company2details.get(3));
        empWageBuilder.calculateSalary();
        System.out.println("total wage for dmart " + empWageBuilder.getTotalWage("dmart"));
    }
}	
