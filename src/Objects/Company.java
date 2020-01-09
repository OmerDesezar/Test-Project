package Objects;

import java.util.List;

public class Company {
    private List<Workplace> workplaces;
    private String name;

    public Company(List<Workplace> workplaces, String name) {
        this.workplaces = workplaces;
        this.name = name;
    }

    public List<Workplace> getWorkplaces() {
        return workplaces;
    }

    public void setWorkplaces(List<Workplace> workplaces) {
        this.workplaces = workplaces;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Company" + " name= '" + name + "\'\n" + workplaces;
    }
}
