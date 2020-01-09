package Tools;

import Objects.Department;
import Objects.Employee;
import Objects.Person;

import java.time.Month;
import java.util.List;
import java.util.Random;

public class SalarySetter {
    public static void setRandSalaries(List<Employee> employeeList, Department department, boolean isboss) {
        for (Employee employee: employeeList) {
            setRandSalary(employee,department,isboss);
        }
    }

    public static void setRandSalary(Person person, Department department, boolean isboss) {
        Random rand = new Random();
        int[]minMax = getSalaries(department, isboss);
        for (int i = 0; i< Month.values().length; i++) {
            person.getSalary().addSalary(rand.nextInt(minMax[1]-minMax[0]) + minMax[0]);
        }
    }

    private static int[] getSalaries(Department department, boolean isBoss) {
        int[]minMax = new int[2];
        if (isBoss) {
            switch (department) {
                case DEV:
                    minMax[0] = 30000;
                    minMax[1] = 32000;
                    break;
                case QA:
                    minMax[0] = 14000;
                    minMax[1] = 18000;
                    break;
                case HR:
                    minMax[0] = 15000;
                    minMax[1] = 17000;
                    break;
                case GRAPHICS:
                    minMax[0] = 16000;
                    minMax[1] = 19000;
                    break;
            }
        } else {
            switch (department) {
                case DEV:
                    minMax[0] = 14000;
                    minMax[1] = 18000;
                    break;
                case QA:
                    minMax[0] = 8000;
                    minMax[1] = 12000;
                    break;
                case HR:
                    minMax[0] = 11000;
                    minMax[1] = 13000;
                    break;
                case GRAPHICS:
                    minMax[0] = 12000;
                    minMax[1] = 15000;
                    break;
            }
        }
        return minMax;
    }

}
