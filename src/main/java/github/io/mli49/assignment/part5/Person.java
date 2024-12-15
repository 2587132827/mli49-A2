package github.io.mli49.assignment.part5;

public abstract class Person { //part2: make the class as abstract as the class will never be instantiated
    // 3 instance variables of a person
    /**
     * The name of the person
     */
    private String name;
    /**
     * The age of the person
     */
    private int age;
    /**
     * The gender of the person.
     */
    private String gender;

    // Default constructor
    public Person() {}

    // Constructor with parameters
    public Person(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    // Getters and setters for all Person instance variables
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}

