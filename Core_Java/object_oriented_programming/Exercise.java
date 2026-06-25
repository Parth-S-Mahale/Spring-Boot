package Core_Java.object_oriented_programming;

// TODO: Create an class called Employee
class Employee {
    private String name;
    private double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getDetails() {
        return "Name: " + name + ", Salary: " + salary ;
    }
}

// TODO: Create a class Manager that Extends Employee
class Manager extends Employee {
    private String department;

    public Manager(String name, double salary, String department) {
        super(name, salary);
        this.department = department;
    }

    public String getDetails() {
        return super.getDetails() + ", Department: " + department;
    }

}



public class Exercise {
    public static void main(String[] args) {
        // TODO: Create Employee and Manager objects
        Employee emp = new Employee("Parth", 5000);

        Manager mgr = new Manager("Rahul", 80000,"IT");

        // TODO: Print their details using getDetails()
        System.out.println(emp.getDetails());
        System.out.println(mgr.getDetails());
    }

}

