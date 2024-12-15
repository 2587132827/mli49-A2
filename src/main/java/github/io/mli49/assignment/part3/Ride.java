package github.io.mli49.assignment.part3;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

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
    /**
     * The queue of visitors waiting to ride
     */
    private Queue<Visitor> visitorQueue;


    // Default constructor
    public Ride() {
        visitorQueue = new LinkedList<>();
    }

    // Constructor with parameters
    public Ride(String rideName, String rideType, Employee rideOperator) {
        this.rideName = rideName;
        this.rideType = rideType;
        this.rideOperator = rideOperator;
        visitorQueue = new LinkedList<>();
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
    // part3 methods
    /**
     * Add a visitor to the queue for the ride
     * @param visitor the visitor to add to the queue
     */
    public void addVisitorToQueue(Visitor visitor) {
        visitorQueue.add(visitor);
        System.out.println(visitor.getName() + " has joined the queue for " + rideName);
    }
    /**
     * Remove a visitor from the queue for the ride
     */
    public void removeVisitorFromQueue() {
        Visitor removedVisitor = visitorQueue.poll();
        if (removedVisitor != null) {
            System.out.println(removedVisitor.getName() + " has been removed from the queue for " + rideName);
        } else {
            System.out.println("The queue for " + rideName + " is empty.");
        }
    }
    /**
     * Print the queue for the ride
     */
    public void printQueue() {
        if (visitorQueue.isEmpty()) {
            System.out.println("The queue for " + rideName + " is empty.");
        } else {
            System.out.println("Queue for " + rideName + ":");
            for (Visitor visitor : visitorQueue) {
                System.out.println("- " + visitor.getName());
            }
        }
    }
}

