package Bai_4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;

public class Project {

    // --- Fields ---
    private String projectId;
    private Date startDate;
    private Date endDate;
    private ArrayList<Employee> listOfEmployee;

    public Project(String projectId, Date startDate, Date endDate) {
        this.projectId = projectId;
        this.startDate = startDate;
        this.endDate = endDate;
        this.listOfEmployee = new ArrayList<>();
    }

    public void addEmployee(Employee employee) {
        this.listOfEmployee.add(employee);
    }

    // --- Business Methods ---
    public Integer estimateBudget() {
        if (startDate == null || endDate == null || startDate.after(endDate)) {
            return 0; // Cannot calculate budget
        }

        int totalWeeklyCost = 0;
        for (Employee e : listOfEmployee) {
            totalWeeklyCost += (e.getSalaryPerHour() * 40);
        }

        long diffInMillis = endDate.getTime() - startDate.getTime();
        long diffInDays = (diffInMillis / (1000 * 60 * 60 * 24)) + 1;
        long numWeeks = (long) Math.ceil((double) diffInDays / 7.0);
        return (int) (totalWeeklyCost * numWeeks);
    }

    @Override
    public String toString() {
        Collections.sort(this.listOfEmployee);

        StringBuilder sb = new StringBuilder();
        sb.append("--- Project: " + this.projectId + " ---\n");
        sb.append("Start Date: " + this.startDate + "\n");
        sb.append("End Date: " + this.endDate + "\n");
        sb.append("--- Employees (Sorted) ---\n");
        
        for (Employee e : listOfEmployee) {
            sb.append(e.toString() + "\n");
        }
        return sb.toString();
    }

    // --- Getters and Setters ---

    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public ArrayList<Employee> getListOfEmployee() {
        return listOfEmployee;
    }

    public void setListOfEmployee(ArrayList<Employee> listOfEmployee) {
        this.listOfEmployee = listOfEmployee;
    }
}
