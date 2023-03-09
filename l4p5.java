class Person {
    String name;
    int age;
    String phoneNumber;
    String address;
    double salary;

    Person(String name, int age, String phoneNumber, String address, double salary) {
        this.name = name;
        this.age = age;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.salary = salary;
    }

    void printSalary() {
        System.out.println("Salary: " + salary);
    }
}

class Employee extends Person {
    String specialization;

    Employee(String name, int age, String phoneNumber, String address, double salary, String specialization) {
        super(name, age, phoneNumber, address, salary);
        this.specialization = specialization;
    }

    @Override
    void printSalary() {
        super.printSalary();
        System.out.println("Specialization: " + specialization);
    }
}

class Manager extends Person {
    String department;

    Manager(String name, int age, String phoneNumber, String address, double salary, String department) {
        super(name, age, phoneNumber, address, salary);
        this.department = department;
    }

    @Override
    void printSalary() {
        super.printSalary();
        System.out.println("Department: " + department);
    }
}

public class l4p5 {
    public static void main(String[] args) {
        Employee emp = new Employee("Jay", 20, "999-999-999", "vasai", 60000, "wes development");
        emp.printSalary();

        Manager mgr = new Manager("raj", 20, "111-555-1111", "surat", 40000, "Marketing");
        mgr.printSalary();
    }
}
