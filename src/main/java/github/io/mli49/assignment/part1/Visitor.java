package github.io.mli49.assignment.part1;

import github.io.mli49.assignment.part1.Person;

public class Visitor extends Person {
    // 2 instance variable
    /**
     * The membership status of the visitor
     */
    private String membershipStatus;
    /**
     * The number of times the visitor has visited the park
     */
    private Integer visitCount;

    // Default constructor
    public Visitor() {}

    // Constructor with parameters
    public Visitor(String name, int age, String gender, String membershipStatus, Integer visitCount) {
        super(name, age, gender); // Call the constructor of Person
        this.membershipStatus = membershipStatus;
        this.visitCount = visitCount;
    }

    // Getter and setter
    public String getMembershipStatus() {
        return membershipStatus;
    }

    public void setMembershipStatus(String membershipStatus) {
        this.membershipStatus = membershipStatus;
    }

    public Integer getVisitCount() {
        return visitCount;
    }

    public void setVisitCount(Integer visitCount) {
        this.visitCount = visitCount;
    }

    // Additional method to display visitor info
    public String getVisitorInfo() {
        return "Visitor: " + getName() + ", Age: " + getAge() + ", Gender: " + getGender() +
                ", Membership Status: " + membershipStatus+ ", Visit Count: " + visitCount;
    }
}

