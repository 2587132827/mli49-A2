package github.io.mli49.assignment.part7;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
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
    // part5 instance variables
    /**
     * The maximum number of visitors per cycle
     */
    private int maxRider;
    /**
     * The number of times the ride has been run
     */
    private int numOfCycles;
    // Default constructor
    public Ride() {
        visitorQueue = new LinkedList<>();
        visitorsRidden = new LinkedList<>();
    }

    // Constructor with parameters
    public Ride(String rideName, String rideType, Employee rideOperator, int maxRider) {
        this.rideName = rideName;
        this.rideType = rideType;
        this.rideOperator = rideOperator;
        this.maxRider = maxRider;
        this.numOfCycles = 0;
        visitorQueue = new LinkedList<>();
        visitorsRidden = new LinkedList<>();
    }

    // Getters and setters

    public int getMaxRider() {
        return maxRider;
    }

    public void setMaxRider(int maxRider) {
        this.maxRider = maxRider;
    }

    public int getNumOfCycles() {
        return numOfCycles;
    }

    public void setNumOfCycles(int numOfCycles) {
        this.numOfCycles = numOfCycles;
    }
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
    @Override
    public void addVisitorToQueue(Visitor visitor) {
        visitorQueue.add(visitor);
        System.out.println(visitor.getName() + " has joined the queue for " + rideName);
    }
    /**
     * Remove a visitor from the queue for the ride
     */
    @Override
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
    @Override
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

    // part5 methods
    /**
     * Add a visitor to the queue
     */
    @Override
    public void runOneCycle() {
        // If no ride operator is assigned to the ride, the ride cannot be run, and a message is
        //printed out
        if (rideOperator == null) {
            System.out.println("Cannot run the ride: No ride operator assigned.");
            return;
        }
        // If the queue is empty, the ride cannot be run, and a message is printed out
        if (visitorQueue.isEmpty()) {
            System.out.println("Cannot run the ride: No visitors in the queue.");
            return;
        }

        int ridersThisCycle = Math.min(visitorQueue.size(), maxRider);
        for (int i = 0; i < ridersThisCycle; i++) {
            Visitor visitor = visitorQueue.poll();  // Remove the visitor from the queue
            visitorsRidden.add(visitor);  // Add the visitor to the ride history
            System.out.println(visitor.getName() + " has taken the ride.");
        }

        numOfCycles++;  // Increment the number of cycles
        System.out.println("Ride has been run for " + ridersThisCycle + " visitors. Total cycles: " + numOfCycles);
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

    /**
     * Export the ride history to a file
     * @param fileName
     */
    public void exportRideHistory(String fileName) {
        BufferedWriter writer = null;

        try {
            // Create a new file object
            File file = new File(fileName);

            // Create a BufferedWriter to write data to the file
            writer = new BufferedWriter(new FileWriter(file));

            // Iterate through the ride history and write each visitor to the file
            for (Visitor visitor : visitorsRidden){
                writer.write(visitor.getVisitorInfo());
                writer.newLine();  // Write each visitor on a new line
            }

            System.out.println("Ride history exported successfully to " + fileName);

        } catch (IOException e) {
            System.out.println("Error exporting ride history: " + e.getMessage());
        } finally {
            try {
                if (writer != null) {
                    writer.close();  // Close the writer
                }
            } catch (IOException e) {
                System.out.println("Error closing the file writer: " + e.getMessage());
            }
        }
    }

}

