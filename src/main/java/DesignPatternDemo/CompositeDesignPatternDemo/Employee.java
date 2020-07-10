package DesignPatternDemo.CompositeDesignPatternDemo;

public class Employee extends EmployeeSystem {

    public Employee(int id, String name, int salary) {
        super(id);
        this.name = name;
        this.salary = salary;
    }

    @Override
    public int getSalary() {
        return this.salary;
    }

    @Override
    public int getCount() {
        return 1;
    }
}
