package github.io.mli49.assignment;


public class AssignmentTwo {
    // main method in AssignmentTwo class
    public static void main(String[] args) {
//        partThree();
        partFourA();
    }
    public static void partThree(){
        // Create a new Employee who will operate the ride
        github.io.mli49.assignment.part3.Employee rideOperator = new github.io.mli49.assignment.part3.
                    Employee("John", 30, "Male", "Ride Operator", "Roller Coaster");

        // Create a new Ride object
        github.io.mli49.assignment.part3.Ride rollerCoaster = new  github.io.mli49.assignment.part3.
                    Ride("Roller Coaster", "Thrill", rideOperator);

        // Create some Visitors
        github.io.mli49.assignment.part3.Visitor visitor1 = new  github.io.mli49.assignment.part3.Visitor("Alice", 25, "Female", "VIP",1);
        github.io.mli49.assignment.part3.Visitor visitor2 = new  github.io.mli49.assignment.part3.Visitor("tom", 28, "Male", "Regular",2);
        github.io.mli49.assignment.part3.Visitor visitor3 = new  github.io.mli49.assignment.part3.Visitor("Charlie", 28, "Male", "Regular",2);
        github.io.mli49.assignment.part3.Visitor visitor4 = new  github.io.mli49.assignment.part3.Visitor("David", 35, "Male", "VIP",0);
        github.io.mli49.assignment.part3.Visitor visitor5 = new github.io.mli49.assignment.part3.Visitor("Eva", 29, "Female", "Regular",0);

        // Add 5 visitors to the ride queue
        rollerCoaster.addVisitorToQueue(visitor1);
        rollerCoaster.addVisitorToQueue(visitor2);
        rollerCoaster.addVisitorToQueue(visitor3);
        rollerCoaster.addVisitorToQueue(visitor4);
        rollerCoaster.addVisitorToQueue(visitor5);

        // Print all visitors in the queue
        rollerCoaster.printQueue();

        // Remove one visitor from the queue
        rollerCoaster.removeVisitorFromQueue();

        // Print the updated queue after removal
        rollerCoaster.printQueue();
    }
    public static void partFourA() {
        // Create a new Employee who will operate the ride
        github.io.mli49.assignment.part4a.Employee rideOperator = new github.io.mli49.assignment.part4a.Employee("John", 30, "Male", "Ride Operator", "Roller Coaster");

        // Create a new Ride object
        github.io.mli49.assignment.part4a.Ride rollerCoaster = new github.io.mli49.assignment.part4a.Ride("Roller Coaster", "Thrill", rideOperator);

        // Create some Visitors
        github.io.mli49.assignment.part4a.Visitor visitor1 = new github.io.mli49.assignment.part4a.Visitor("Alice", 25, "Female", "VIP",1);
        github.io.mli49.assignment.part4a.Visitor visitor2 = new github.io.mli49.assignment.part4a.Visitor("Bob", 22, "Male", "Regular",2);
        github.io.mli49.assignment.part4a.Visitor visitor3 = new github.io.mli49.assignment.part4a.Visitor("Charlie", 28, "Male", "Regular",3);
        github.io.mli49.assignment.part4a.Visitor visitor4 = new github.io.mli49.assignment.part4a.Visitor("David", 35, "Male", "VIP",4);
        github.io.mli49.assignment.part4a.Visitor visitor5 = new github.io.mli49.assignment.part4a.Visitor("Eva", 29, "Female", "Regular",5);

        // Add visitors to the ride history
        rollerCoaster.addVisitorToHistory(visitor1);
        rollerCoaster.addVisitorToHistory(visitor2);
        rollerCoaster.addVisitorToHistory(visitor3);
        rollerCoaster.addVisitorToHistory(visitor4);
        rollerCoaster.addVisitorToHistory(visitor5);

        // Check if a specific visitor is in the ride history
        boolean isVisitorInHistory = rollerCoaster.checkVisitorFromHistory(visitor2);
        System.out.println("Is Bob in the ride history? " + (isVisitorInHistory ? "Yes" : "No"));

        // Print the number of visitors in the ride history
        System.out.println("Number of visitors who have taken the ride: " + rollerCoaster.numberOfVisitors());

        // Print all visitors in the ride history
        rollerCoaster.printRideHistory();
    }
    public void partFourB(){
    }
    public void partFive(){
    }
    public void partSix(){
    }
    public void partSeven(){
    }
}

