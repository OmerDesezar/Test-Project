package Objects;

import java.util.ArrayList;
import java.util.List;

public class Salary {
    private List<Integer> salary;

    public Salary() {
        salary = new ArrayList<>();
    }

    public List<Integer> getSalary() {
        return salary;
    }

    public void setSalary(List<Integer> salary) {
        this.salary = salary;
    }
    public void addSalary(int num) {
        salary.add(num);
    }

    @Override
    public String toString() {
        return "salary=" + salary;
    }
}
