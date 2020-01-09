package runner;

import Objects.*;
import java.util.ArrayList;
import java.util.List;
import static Tools.SalarySetter.*;
import static Tools.SalarySetter.setRandSalaries;
import static Tools.StatisticsAnalizer.*;

public class run {
    public static void main(String[] args) {
        Employee employee = new Employee("dor",11);
        Employee employee2 = new Employee("ron",13);
        Employee employee3 = new Employee("bill",15);
        Employee employee4 = new Employee("yossi",62);
        Employee employee5 = new Employee("davod",82);
        Employee employee6 = new Employee("yossi",19);
        Employee employee7 = new Employee("benzi",62);
        Employee employee8 = new Employee("benzi",42);
        Employee employee9 = new Employee("benzi",12);
        Employee employee10 = new Employee("wario",62);
        Employee employee11 = new Employee("wolen",22);
        Employee employee12 = new Employee("belros",17);
        Boss devBoss = new Boss("omer", 20);
        Boss qaBoss = new Boss("womer", 21);
        Boss hrBoss = new Boss("bomer", 22);
        Boss graphicsBoss = new Boss("lomer", 23);
        List<Employee> devEmps = new ArrayList<>();
        List<Employee> qaEmps = new ArrayList<>();
        List<Employee> hrEmps = new ArrayList<>();
        List<Employee> graphicsEmps = new ArrayList<>();
        devEmps.add(employee);
        devEmps.add(employee2);
        devEmps.add(employee3);
        qaEmps.add(employee4);
        qaEmps.add(employee5);
        qaEmps.add(employee6);
        hrEmps.add(employee7);
        hrEmps.add(employee8);
        hrEmps.add(employee9);
        graphicsEmps.add(employee10);
        graphicsEmps.add(employee11);
        graphicsEmps.add(employee12);
        setRandSalaries(devEmps,Department.DEV, false);
        setRandSalaries(qaEmps,Department.QA, false);
        setRandSalaries(hrEmps,Department.HR, false);
        setRandSalaries(graphicsEmps,Department.GRAPHICS, false);
        setRandSalary(devBoss,Department.DEV,true);
        setRandSalary(qaBoss,Department.QA,true);
        setRandSalary(hrBoss,Department.HR,true);
        setRandSalary(graphicsBoss,Department.GRAPHICS,true);
        Workplace devWP = new Workplace(Department.DEV, devBoss, devEmps);
        Workplace qaWP = new Workplace(Department.QA, qaBoss, qaEmps);
        Workplace hrWP = new Workplace(Department.HR, hrBoss, hrEmps);
        Workplace graphicsWP = new Workplace(Department.GRAPHICS, graphicsBoss, graphicsEmps);
        List<Workplace> workplaces = new ArrayList<>();
        workplaces.add(devWP);
        workplaces.add(qaWP);
        workplaces.add(hrWP);
        workplaces.add(graphicsWP);
        Company intel = new Company(workplaces,"Intel");
        System.out.println(intel);
        companyAVG(intel);
        companyAvgPerDep(intel);
        companyAVGByAge(intel,22,32);
        companyAVGByAge(intel,34);
        bossAVG(intel);
        mostCommonName(intel);
        oldestHighest(intel);
        youngestHighest(intel);


    }


}
