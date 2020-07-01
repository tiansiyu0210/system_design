package CompositeDesignPatternDemo;

public abstract class EmployeeSystem {
    //use protected here
    protected int id;
    protected String name;
    protected int salary;

    public EmployeeSystem(int id) {
        this.id = id;
    }

    public abstract int getSalary();

    public abstract int getCount();
}
