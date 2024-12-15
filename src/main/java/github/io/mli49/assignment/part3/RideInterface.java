package github.io.mli49.assignment.part3;

public interface RideInterface {
    /**
     * Add a visitor to the queue
     * @param visitor
     */
    void addVisitorToQueue(Visitor visitor);
    /**
     * Remove a visitor from the queue
     */
    void removeVisitorFromQueue();
    /**
     * Print the queue
     */
    void printQueue();
    /**
     * Run one cycle of the ride
     */
    void runOneCycle();
    /**
     * Add a visitor to the history
     * @param visitor
     */
    void addVisitorToHistory(Visitor visitor);
    /**
     * Check if the visitor has visited the ride before
     * @param visitor
     * @return true if the visitor has visited the ride before, false otherwise
     */
    boolean checkVisitorFromHistory(Visitor visitor);
    /**
     * Get the number of visitors
     * @return the number of visitors
     */
    int numberOfVisitors();
    /**
     * Print the ride history
     */
    void printRideHistory();
}
