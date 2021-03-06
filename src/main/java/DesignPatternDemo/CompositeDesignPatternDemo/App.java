package DesignPatternDemo.CompositeDesignPatternDemo;

public class App {
    public static void main(String[] args) {
        Department parentDept = new Department(1);
        Department childDept1 = new Department(1001);
        Department childDept2 = new Department(1002);

        Employee e1 = new Employee(9001, "e1", 1000);
        Employee e2 = new Employee(9001, "e2", 2000);
        Employee e3 = new Employee(9001, "e3", 3000);
        Employee e4 = new Employee(9001, "e4", 4000);
        Employee e5 = new Employee(9001, "e5", 5000);
        Employee e6 = new Employee(9001, "e6", 6000);
        Employee e7 = new Employee(9001, "e7", 7000);
        Employee e8 = new Employee(9001, "e8", 8000);

        parentDept.add(childDept1);
        parentDept.add(childDept2);

        childDept1.add(e1);
        childDept1.add(e2);
        childDept1.add(e3);
        childDept1.add(e4);

        childDept2.add(e5);
        childDept2.add(e6);
        childDept2.add(e7);
        childDept2.add(e8);

        System.out.println("parent department total salary is: " + parentDept.getSalary());
        System.out.println("child 1 department total salary is: " + childDept1.getSalary());
        System.out.println("child 2 department total salary is: " + childDept2.getSalary());
        System.out.println();
        System.out.println("parent department total employee is: " + parentDept.getCount());
        System.out.println("childDept1 department total employee is: " + childDept1.getCount());
        System.out.println("childDept2 department total employee is: " + childDept2.getCount());

        Employee e9 = new Employee(9001, "e9", 100000);
        Employee e10 = new Employee(9001, "e10", 100000);

        childDept1.add(e9);
        childDept2.add(e10);

        System.out.println("==========================================");
        System.out.println("===after adding one employee in each child department===");
        System.out.println("parent department total salary is: " + parentDept.getSalary());
        System.out.println("child 1 department total salary is: " + childDept1.getSalary());
        System.out.println("child 2 department total salary is: " + childDept2.getSalary());
        System.out.println();
        System.out.println("parent department total employee is: " + parentDept.getCount());
        System.out.println("childDept1 department total employee is: " + childDept1.getCount());
        System.out.println("childDept2 department total employee is: " + childDept2.getCount());

        System.out.println();
        System.out.println("==========================================");
        System.out.println("adda employee into Parent department");

        Employee e11 = new Employee(9001, "e11", 1);
        parentDept.add(e11);
        System.out.println("parent department total salary is: " + parentDept.getSalary());
        System.out.println("parent department total employee is: " + parentDept.getCount());
    }
}
