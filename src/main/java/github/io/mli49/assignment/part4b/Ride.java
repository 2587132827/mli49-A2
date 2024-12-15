package github.io.mli49.assignment.part4b;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class Ride implements RideInterface {
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
    private final Queue<Visitor> visitorQueue;

    /**
     * The list of visitors who have ridden the ride
     */
    private LinkedList<Visitor> visitorsRidden;

    // Default constructor
    public Ride() {
        visitorQueue = new LinkedList<>();
        visitorsRidden = new LinkedList<>();
    }

    // Constructor with parameters
    public Ride(String rideName, String rideType, Employee rideOperator) {
        this.rideName = rideName;
        this.rideType = rideType;
        this.rideOperator = rideOperator;
        visitorQueue = new LinkedList<>();
        visitorsRidden = new LinkedList<>();
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

    @Override
    public void runOneCycle() {
        // will implement in part5
    }

    // part4a methods
    /**
     * Add a visitor to the history
     * @param visitor
     */
    @Override
    public void addVisitorToHistory(Visitor visitor) {
        visitorsRidden.add(visitor);
    }

    /**
     * Check if a visitor has ridden the ride before
     * @param visitor
     * @return true if the visitor has ridden the ride before, false otherwise
     */
    @Override
    public boolean checkVisitorFromHistory(Visitor visitor) {
        return visitorsRidden.contains(visitor);
    }

    /**
     * Get the number of visitors
     * @return the number of visitors
     */
    @Override
    public int numberOfVisitors() {
        return visitorsRidden.size();
    }

    /**
     * Print the ride history
     */
    @Override
    public void printRideHistory() {
        if (visitorsRidden.isEmpty()) {
            System.out.println("No visitors have taken the " + rideName + " yet.");
        } else {
            System.out.println("Ride history for " + rideName + ":");
            Iterator<Visitor> iterator = visitorsRidden.iterator();
            while (iterator.hasNext()) {
                Visitor visitor = iterator.next();
                System.out.println(visitor.getVisitorInfo());
            }
        }
    }
    // part4b methods
    /**
     * Sort the visitors who have ridden the ride by name and age
     */
    public void sortVisitors() {
        Collections.sort(visitorsRidden, new VisitorComparator());
        System.out.println("Visitors sorted by name and age.");
    }
}

