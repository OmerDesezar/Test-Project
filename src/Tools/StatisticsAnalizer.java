package Tools;

import Objects.*;

import java.util.ArrayList;
import java.util.List;

public class StatisticsAnalizer {

    private  static int salaryAVG(Salary salary) {
        int avg = 0;
        for (int num:salary.getSalary()) {
            avg += num;
        }
        avg /= 12;
        return avg;
    }

    public static void companyAVG(Company company) {
        int avg = 0;
        int counter = 0;
        for (Workplace wp: company.getWorkplaces()) {
            avg += salaryAVG(wp.getBoss().getSalary());
            counter++;
            for (Employee employee : wp.getEmployeeList()){
                avg += salaryAVG(employee.getSalary());
                counter++;
            }
        }
        avg/=counter;
        System.out.printf("%s's total average is: %d\n",company.getName(), avg);
    }

    public static void companyAvgPerDep(Company company) {
        int avg = 0;
        int counter = 0;
        for (Workplace wp: company.getWorkplaces()) {
            avg += salaryAVG(wp.getBoss().getSalary());
            counter++;
            for (Employee employee : wp.getEmployeeList()){
                avg += salaryAVG(employee.getSalary());
                counter++;
            }
            avg /= counter;
            System.out.printf("%s department's average is: %d\n",wp.getDepartment(),avg);
            avg = 0;
            counter = 0;
        }
    }

    public static void companyAVGByAge(Company company, int minAge, int maxAge) {
        int avg = 0;
        int counter = 0;
        for (Workplace wp: company.getWorkplaces()) {
            if (wp.getBoss().getAge() < maxAge && wp.getBoss().getAge() > minAge) {
                avg += salaryAVG(wp.getBoss().getSalary());
                counter++;
            }
            for (Employee employee : wp.getEmployeeList()){
                if (employee.getAge() < maxAge && employee.getAge() > minAge) {
                    avg += salaryAVG(employee.getSalary());
                    counter++;
                }
            }
        }
        avg/=counter;
        System.out.printf("total average of people in %s from ages %d - %d is: %d\n",company.getName(),minAge,maxAge, avg);
    }
    public static void companyAVGByAge(Company company, int age) {
        companyAVGByAge(company,age,Integer.MAX_VALUE);
    }

    public static void bossAVG(Company company) {
        int avg = 0;
        int counter = 0;
        for (Workplace wp: company.getWorkplaces()) {
            avg += salaryAVG(wp.getBoss().getSalary());
            counter++;
            }
        avg /= counter;
        System.out.printf("bosses total avg int %s is %d\n",company.getName(),avg);
    }

    public static void mostCommonName(Company company) {
        List <String> allNames = new ArrayList<>();
        for (Workplace workplace : company.getWorkplaces()) {
            allNames.add(workplace.getBoss().getName());
            for (Employee employee : workplace.getEmployeeList()) {
                allNames.add(employee.getName());
            }
        }
        String commonName = null;
        int nameCounter = 0;
        int currentNameCounter = -1;
        for (String name: allNames) {
            for (String name2: allNames) {
                if (name.equals(name2)) {
                    currentNameCounter++;
                }
            }
            if (currentNameCounter > nameCounter) {
                nameCounter = currentNameCounter;
                commonName = name;
            }
            currentNameCounter = -1;
        }
        System.out.printf("most popular name in %s is %s\n",company.getName(), commonName);
    }
        private static int highestPaycheck(Person person) {
        int maxPay = 0;
            for (int pay: person.getSalary().getSalary()) {
                if (pay > maxPay) {
                    maxPay = pay;
                }
            }
            return maxPay;
        }

        public static void oldestHighest(Company company) {
        Person oldest = company.getWorkplaces().get(0).getBoss();
        int maxAge = company.getWorkplaces().get(0).getBoss().getAge();
        for (Workplace workplace: company.getWorkplaces()) {
            if (workplace.getBoss().getAge() > maxAge) {
                maxAge = workplace.getBoss().getAge();
                oldest = workplace.getBoss();
            }
            for (Employee employee: workplace.getEmployeeList()) {
                if (employee.getAge() > maxAge) {
                    maxAge = employee.getAge();
                    oldest = employee;
                }
            }
        }
            System.out.printf("oldest person in %s is %s and his highest paycheck is %d\n"
                    ,company.getName(),oldest.getName(), highestPaycheck(oldest));
        }

        public static void youngestHighest(Company company) {
            Person youngest = company.getWorkplaces().get(0).getBoss();
            int minAge = company.getWorkplaces().get(0).getBoss().getAge();
            for (Workplace workplace: company.getWorkplaces()) {
                if (workplace.getBoss().getAge() < minAge) {
                    minAge = workplace.getBoss().getAge();
                    youngest = workplace.getBoss();
                }
                for (Employee employee: workplace.getEmployeeList()) {
                    if (employee.getAge() < minAge) {
                        minAge = employee.getAge();
                        youngest = employee;
                    }
                }
            }
            System.out.printf("youngest person in %s is %s and his highest paycheck is %d\n"
                    ,company.getName(),youngest.getName(), highestPaycheck(youngest));

        }

}
