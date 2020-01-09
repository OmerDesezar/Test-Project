package Objects;

import java.util.ArrayList;
import java.util.List;

public class Workplace {
    private Department department;
    private Boss boss;
    private List<Employee> employeeList;

    public Workplace(Department department, Boss boss, List<Employee> employeeList) {
        this.department = department;
        this.boss = boss;
        this.employeeList = employeeList;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public Boss getBoss() {
        return boss;
    }

    public void setBoss(Boss boss) {
        this.boss = boss;
    }

    public List<Employee> getEmployeeList() {
        return employeeList;
    }
    public void addEmployee(Employee employee) {
        employeeList.add(employee);
    }

    public void setEmployeeList(List<Employee> employeeList) {
        this.employeeList = employeeList;
    }

    @Override
    public String toString() {
        return "\ndepartment: " + department +
                ",\nboss: " + boss +
                ",employeeList:\n" + employeeList;
    }
}
