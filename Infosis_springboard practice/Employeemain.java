class Employee {
    static int count = 100;
    int id;
    String name;
    String dept;

    Employee(String y, String z) {
        id = count++;
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

public class Employeemain {
    static void printEmployee(Employee e) {
        System.out.println("ID " + e.getEmpId() + " Name " + e.getEmpName() + " Department " + e.getEmpDept());
    }

    public static void main(String[] args) {
        Employee e1 = new Employee("Arun", "ECE");
        Employee e2 = new Employee("siva", "ECE");
        Employee e3 = new Employee("Vishnu", "ECE");
        int caseNo = 1;
        Employee emp[] = { e1, e2, e3 };

        if (caseNo == 1) {
            for (Employee e : emp) {
                printEmployee(e);
            }
        } else {
            for (int i = 0; i < emp.length - 1; i++) {
                for (int j = i + 1; j < emp.length; j++) {
                    if (emp[i].getEmpId() > emp[j].getEmpId()) {
                        Employee temp = emp[i];
                        emp[i] = emp[j];
                        emp[j] = temp;
                    }
                }
            }
            for (Employee e : emp) {
                printEmployee(e);
            }
        }
    }
}