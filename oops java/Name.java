class Person {
    private int age;
    private String name;

    Person(String name1, int age1) {
        this.name = name1;
        this.age = age1;
    }

    String getName() {
        return name;
    }

    int getAge() {
        return age;
    }

    public void setName(String newname) {
        this.name = newname;
    }

    public void setAge(int newage) {
        this.age = newage;
    }
}

public class Name {
    public static void main(String[] args) {
        Person s1 = new Person("Siva", 20);
        Person s2 = new Person("Siva", 20);
        System.out.println("Student " + s1.getName() + " is " + s1.getAge() + " years old");
        s2.setName("Kiruthika");
        System.out.println("Student " + s2.getName() + " is " + s2.getAge() + " years old");
    }

}
