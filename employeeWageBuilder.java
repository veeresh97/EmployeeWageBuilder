
public class employeeWageBuilder {
	public static final int PRESENT_FULL_TIME = 2;
    public static final int PRESENT_PART_TIME = 1;
    public static final int IS_FULL_TIME = 8;
    public static final int IS_PART_TIME = 4;
    public static final int PER_HOUR_WAGE = 20;

    public static void main(String[] args) {
        int work_hours = 0, work_days = 0;
        double salary = 0;
        while (work_hours < 100 && work_days < 20) {
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
            System.out.println("Day" +work_days + " Total working hrs "+work_hours);
        }
        salary = work_hours * PER_HOUR_WAGE;
        System.out.println("total working hours " + work_hours + " total working days " + work_days);
        System.out.println("salary : " + salary);
    }
}