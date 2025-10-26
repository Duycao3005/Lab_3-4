package Bai_4;

public class Employee implements Comparable<Employee> {

    private String employeeId;
    private String employeeName;
    private int salaryPerHour;
    private int noOfLeavingDay;
    private int noOfTravelDay;

    // --- Constructor ---
    public Employee(String employeeId, String employeeName, int salaryPerHour, 
                    int noOfLeavingDay, int noOfTravelDay) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.salaryPerHour = salaryPerHour;
        this.noOfLeavingDay = noOfLeavingDay;
        this.noOfTravelDay = noOfTravelDay;
    }

    public Integer calculateWeeklySalary() {
        double travelDayBonus = (double) this.noOfTravelDay / 2.0;
        double effectiveDays = 5 - this.noOfLeavingDay + travelDayBonus;

        double weeklySalary = this.salaryPerHour * 8 * effectiveDays;
        return (int) weeklySalary;
    }

    @Override
    public String toString() {
        return "[Name: " + this.employeeName + 
               " - Salary Per Hour: " + this.salaryPerHour + 
               " - Weekly Salary: " + this.calculateWeeklySalary() + "]";
    }

    @Override
    public int compareTo(Employee other) {
        if (this.noOfTravelDay != other.noOfTravelDay) {
            return Integer.compare(this.noOfTravelDay, other.noOfTravelDay);
        }
        if (this.noOfLeavingDay != other.noOfLeavingDay) {
            return Integer.compare(other.noOfLeavingDay, this.noOfLeavingDay);
        }
        return 0;
    }
    // --- Getters and Setters ---

    public String getEmployeeId() {
        return employeeId;
    }
    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }
    public String getEmployeeName() {
        return employeeName;
    }
    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }
    public int getSalaryPerHour() {
        return salaryPerHour;
    }
    public void setSalaryPerHour(int salaryPerHour) {
        this.salaryPerHour = salaryPerHour;
    }
    public int getNoOfLeavingDay() {
        return noOfLeavingDay;
    }
    public void setNoOfLeavingDay(int noOfLeavingDay) {
        this.noOfLeavingDay = noOfLeavingDay;
    }
    public int getNoOfTravelDay() {
        return noOfTravelDay;
    }
    public void setNoOfTravelDay(int noOfTravelDay) {
        this.noOfTravelDay = noOfTravelDay;
    }
}
