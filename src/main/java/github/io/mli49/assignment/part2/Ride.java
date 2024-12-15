package github.io.mli49.assignment.part2;

import github.io.mli49.assignment.part2.Employee;

public class Ride {
    // 3 instance variables
    /**
     * The name of the ride
     */
    private String rideName;
    /**
     * The type of the ride
     */
    private String rideType;
    /**
     * The employee who is a ride operator in charge running the ride
     */
    private Employee rideOperator;

    // Default constructor
    public Ride() {}

    // Constructor with parameters
    public Ride(String rideName, String rideType, Employee rideOperator) {
        this.rideName = rideName;
        this.rideType = rideType;
        this.rideOperator = rideOperator;
    }

    // Getters and setters
    public String getRideName() {
        return rideName;
    }

    public void setRideName(String rideName) {
        this.rideName = rideName;
    }

    public String getRideType() {
        return rideType;
    }

    public void setRideType(String rideType) {
        this.rideType = rideType;
    }

    public Employee getRideOperator() {
        return rideOperator;
    }
    /**
     * Set the ride operator for the ride
     * @param rideOperator the employee who is a ride operator
     */
    public void setRideOperator(Employee rideOperator) {
        this.rideOperator = rideOperator;
    }

    // Additional method to display ride info
    public String getRideInfo() {
        return "Ride: " + rideName + ", Type: " + rideType + ", Operator: " + rideOperator.getName();
    }
}

