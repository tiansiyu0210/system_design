package CompositeDesignPatternDemo;

import java.util.ArrayList;
import java.util.List;

public class Department extends EmployeeSystem {
    private List<EmployeeSystem> employees = new ArrayList<>();

    public Department(int id) {
        super(id);
    }


    public void add(EmployeeSystem e) {
        this.employees.add(e);
    }

    public void remove(EmployeeSystem e) {
        this.employees.remove(e);
    }


    @Override
    public int getSalary() {
        int sum = 0;
        for (EmployeeSystem e : employees) {
            sum += e.getSalary();
        }
        return sum;
    }

    public int count() {
        return this.employees.size();
    }
}
