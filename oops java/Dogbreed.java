class Dog {
    private String name;
    private String breed;

    Dog(String name1, String breed1) {
        this.name = name1;
        this.breed = breed1;
    }

    String getName() {
        return name;
    }

    String getBreed() {
        return breed;
    }

    public void setName(String dogname) {
        this.name = dogname;
    }

    public void setBreed(String dogbreed) {
        this.breed = dogbreed;
    }
}

public class Dogbreed {
    public static void main(String[] args) {
        Dog dog1 = new Dog("tiger", "German shpard");
        System.out.println("Dog " + dog1.getName() + " is belongs to breed " + dog1.getBreed());
    }

}
