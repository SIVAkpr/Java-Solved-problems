class Person {
    public int id;
    public String name;
    public int age;

    Person(int id1, String name1, int age1) {
        this.id = id1;
        this.name = name1;
        this.age = age1;
    }
}

class Employee extends Person {
    String dept;

    Employee(int id1, String name1, int age1, String dept1) {
        super(id1, name1, age1);
        this.dept = dept1;
    }

    String getName() {
        return name;
    }

    int getId() {
        return id;
    }

    int getAge() {
        return age;
    }

    String getDept() {
        return dept;
    }
}

public class Employ {
    public static void main(String[] args) {
        Employee emp = new Employee(120, "Siva", 20, "ECE");
        System.out.println(emp.getName());
    }
}
