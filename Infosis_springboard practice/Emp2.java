class Employee {
    // static int count = 100;
    static int id = 100;
    String name;
    String dept;

    Employee(String y, String z) {
        id = id++;
        name = y;
        dept = z;

    }

    int getEmpId() {
        return id;
    }

    String getEmpName() {
        return name;
    }

    String getEmpDept() {
        return dept;
    }
}

public class Emp2 {
    static void printEmployee(Employee e) {
        System.out.println("ID " + e.getEmpId() + " Name " + e.getEmpName() + " Department " + e.getEmpDept());
    }

    public static void main(String[] args) {
        Employee e1 = new Employee("Arun", "ECE");
        Employee e2 = new Employee("siva", "ECE");
        Employee e3 = new Employee("Vishnu", "ECE");
        Employee emp[] = { e1, e2, e3 };

        for (Employee e : emp) {
            printEmployee(e);
        }
    }
}