package github.io.mli49.assignment.part2;

public class Employee extends Person {
    private String role;
    private String assignedRide;

    // Default constructor
    public Employee() {}

    // Constructor with parameters
    public Employee(String name, int age, String gender, String role, String assignedRide) {
        super(name, age, gender); // Call the constructor of Person
        this.role = role;
        this.assignedRide = assignedRide;
    }

    // Getters and setters
    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getAssignedRide() {
        return assignedRide;
    }

    public void setAssignedRide(String assignedRide) {
        this.assignedRide = assignedRide;
    }

    // Additional method to display employee info
    public String getEmployeeInfo() {
        return "Employee: " + getName() + ", Age: " + getAge() + ", Gender: " + getGender() +
                ", Role: " + role + ", Assigned Ride: " + assignedRide;
    }
}

