package github.io.mli49.assignment;


public class AssignmentTwo {
    // main method in AssignmentTwo class
    public static void main(String[] args) {
        AssignmentTwo assignmentTwo = new AssignmentTwo();
//        assignmentTwo.partThree();
//        assignmentTwo.partFourA();
//        assignmentTwo.partFourB();
//        assignmentTwo.partFive();
        assignmentTwo.partSix();
    }
    public  void partThree(){
        // Create a new Employee who will operate the ride
        github.io.mli49.assignment.part3.Employee rideOperator = new github.io.mli49.assignment.part3.
                    Employee("John", 30, "Male", "Ride Operator", "Roller Coaster");

        // Create a new Ride object
        github.io.mli49.assignment.part3.Ride rollerCoaster = new  github.io.mli49.assignment.part3.
                    Ride("Roller Coaster", "Thrill", rideOperator);

        // Create some Visitors
        github.io.mli49.assignment.part3.Visitor visitor1 = new  github.io.mli49.assignment.part3.Visitor("Tom", 25, "Female", "VIP",1);
        github.io.mli49.assignment.part3.Visitor visitor2 = new  github.io.mli49.assignment.part3.Visitor("July", 28, "Male", "Regular",2);
        github.io.mli49.assignment.part3.Visitor visitor3 = new  github.io.mli49.assignment.part3.Visitor("Chen", 28, "Male", "Regular",2);
        github.io.mli49.assignment.part3.Visitor visitor4 = new  github.io.mli49.assignment.part3.Visitor("Kali", 35, "Male", "VIP",0);
        github.io.mli49.assignment.part3.Visitor visitor5 = new github.io.mli49.assignment.part3.Visitor("Bro", 29, "Female", "Regular",0);

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
    public  void partFourA() {
        // Create a new Employee who will operate the ride
        github.io.mli49.assignment.part4a.Employee rideOperator = new github.io.mli49.assignment.part4a.Employee("John", 30, "Male", "Ride Operator", "Roller Coaster");

        // Create a new Ride object
        github.io.mli49.assignment.part4a.Ride rollerCoaster = new github.io.mli49.assignment.part4a.Ride("Roller Coaster", "Thrill", rideOperator);

        // Create some Visitors
        github.io.mli49.assignment.part4a.Visitor visitor1 = new github.io.mli49.assignment.part4a.Visitor("KiKi", 25, "Female", "VIP",1);
        github.io.mli49.assignment.part4a.Visitor visitor2 = new github.io.mli49.assignment.part4a.Visitor("Sam", 22, "Male", "Regular",2);
        github.io.mli49.assignment.part4a.Visitor visitor3 = new github.io.mli49.assignment.part4a.Visitor("Hive", 28, "Male", "Regular",3);
        github.io.mli49.assignment.part4a.Visitor visitor4 = new github.io.mli49.assignment.part4a.Visitor("Doggy", 35, "Male", "VIP",4);
        github.io.mli49.assignment.part4a.Visitor visitor5 = new github.io.mli49.assignment.part4a.Visitor("Mimi", 29, "Female", "Regular",5);

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
    public  void partFourB(){
        // Create a new Employee who will operate the ride
        github.io.mli49.assignment.part4b.Employee rideOperator = new github.io.mli49.assignment.part4b.Employee("John", 30, "Male", "Ride Operator", "Roller Coaster");

        // Create a new Ride object
        github.io.mli49.assignment.part4b.Ride rollerCoaster = new github.io.mli49.assignment.part4b.Ride("Roller Coaster", "Thrill", rideOperator);

        // Create some Visitors
        github.io.mli49.assignment.part4b.Visitor visitor1 = new github.io.mli49.assignment.part4b.Visitor("KiKi", 25, "Female", "VIP",0);
        github.io.mli49.assignment.part4b.Visitor visitor2 = new github.io.mli49.assignment.part4b.Visitor("Bill", 22, "Male", "Regular",0);
        github.io.mli49.assignment.part4b.Visitor visitor3 = new github.io.mli49.assignment.part4b.Visitor("Sam", 28, "Male", "Regular",0);
        github.io.mli49.assignment.part4b.Visitor visitor4 = new github.io.mli49.assignment.part4b.Visitor("Zuul", 35, "Male", "VIP",0);
        github.io.mli49.assignment.part4b.Visitor visitor5 = new github.io.mli49.assignment.part4b.Visitor("Jack", 29, "Female", "Regular",0);
        github.io.mli49.assignment.part4b.Visitor visitor6 = new github.io.mli49.assignment.part4b.Visitor("Jack", 22, "Female", "Regular",0);


        // Add visitors to the ride history
        rollerCoaster.addVisitorToHistory(visitor1);
        rollerCoaster.addVisitorToHistory(visitor2);
        rollerCoaster.addVisitorToHistory(visitor3);
        rollerCoaster.addVisitorToHistory(visitor4);
        rollerCoaster.addVisitorToHistory(visitor5);
        rollerCoaster.addVisitorToHistory(visitor6);

        // Print all visitors before sorting
        System.out.println("Visitors before sorting:");
        rollerCoaster.printRideHistory();

        // Sort the visitors using the custom comparator
        rollerCoaster.sortVisitors();

        // Print all visitors after sorting
        System.out.println("Visitors after sorting:");
        rollerCoaster.printRideHistory();
    }
    public void partFive(){
        // Create a new Employee who will operate the ride
        github.io.mli49.assignment.part5.Employee rideOperator = new github.io.mli49.assignment.part5.Employee("John", 30, "Male", "Ride Operator", "Roller Coaster");

        // Create a new Ride object with a maximum of 3 riders per cycle
        github.io.mli49.assignment.part5.Ride rollerCoaster = new github.io.mli49.assignment.part5.Ride("Roller Coaster", "Thrill", rideOperator, 3);

        // Create and add visitors to the queue
        github.io.mli49.assignment.part5.Visitor visitor1 = new github.io.mli49.assignment.part5.Visitor("KiKi", 25, "Female", "VIP",0);
        github.io.mli49.assignment.part5.Visitor visitor2 = new github.io.mli49.assignment.part5.Visitor("Sam", 22, "Male", "Regular",0);
        github.io.mli49.assignment.part5.Visitor visitor3 = new github.io.mli49.assignment.part5.Visitor("Tommy", 28, "Male", "Regular",0);
        github.io.mli49.assignment.part5.Visitor visitor4 = new github.io.mli49.assignment.part5.Visitor("Jully", 35, "Male", "VIP",0);
        github.io.mli49.assignment.part5.Visitor visitor5 = new github.io.mli49.assignment.part5.Visitor("kenny", 29, "Female", "Regular",0);
        github.io.mli49.assignment.part5.Visitor visitor6 = new github.io.mli49.assignment.part5.Visitor("Frank", 31, "Male", "Regular",0);
        github.io.mli49.assignment.part5.Visitor visitor7 = new github.io.mli49.assignment.part5.Visitor("Zark", 27, "Female", "VIP",0);
        github.io.mli49.assignment.part5.Visitor visitor8 = new github.io.mli49.assignment.part5.Visitor("Hannah", 30, "Female", "Regular",0);
        github.io.mli49.assignment.part5.Visitor visitor9 = new github.io.mli49.assignment.part5.Visitor("Coco", 26, "Female", "VIP",0);
        github.io.mli49.assignment.part5.Visitor visitor10 = new github.io.mli49.assignment.part5.Visitor("Yoxi", 33, "Male", "Regular",0);

        // Add visitors to the queue
        rollerCoaster.addVisitorToQueue(visitor1);
        rollerCoaster.addVisitorToQueue(visitor2);
        rollerCoaster.addVisitorToQueue(visitor3);
        rollerCoaster.addVisitorToQueue(visitor4);
        rollerCoaster.addVisitorToQueue(visitor5);
        rollerCoaster.addVisitorToQueue(visitor6);
        rollerCoaster.addVisitorToQueue(visitor7);
        rollerCoaster.addVisitorToQueue(visitor8);
        rollerCoaster.addVisitorToQueue(visitor9);
        rollerCoaster.addVisitorToQueue(visitor10);

        // Print all visitors in the queue before running the cycle
        System.out.println("Visitors in the queue before running the cycle:");
        rollerCoaster.printQueue();

        // Run one cycle of the ride
        rollerCoaster.runOneCycle();

        // Print all visitors in the queue after one cycle is run
        System.out.println("\nVisitors in the queue after running the cycle:");
        rollerCoaster.printQueue();

        // Print all visitors in the ride history
        System.out.println("\nVisitors in the ride history:");
        rollerCoaster.printRideHistory();
    }
    public void partSix(){
        // Create a new Employee who will operate the ride
        github.io.mli49.assignment.part6.Employee rideOperator = new github.io.mli49.assignment.part6.Employee("John", 30, "Male", "Ride Operator", "Roller Coaster");

        // Create a new Ride object
        github.io.mli49.assignment.part6.Ride rollerCoaster = new github.io.mli49.assignment.part6.Ride("Roller Coaster", "Thrill", rideOperator, 3);

        // Create some Visitors
        github.io.mli49.assignment.part6.Visitor visitor1 = new github.io.mli49.assignment.part6.Visitor("KiKi", 25, "Female", "VIP",0);
        github.io.mli49.assignment.part6.Visitor visitor2 = new github.io.mli49.assignment.part6.Visitor("Bill", 22, "Male", "Regular",0);
        github.io.mli49.assignment.part6.Visitor visitor3 = new github.io.mli49.assignment.part6.Visitor("Sam", 28, "Male", "Regular",0);
        github.io.mli49.assignment.part6.Visitor visitor4 = new github.io.mli49.assignment.part6.Visitor("Zuul", 35, "Male", "VIP",0);
        github.io.mli49.assignment.part6.Visitor visitor5 = new github.io.mli49.assignment.part6.Visitor("Jack", 29, "Female", "Regular",0);
        github.io.mli49.assignment.part6.Visitor visitor6 = new github.io.mli49.assignment.part6.Visitor("Jack", 22, "Female", "Regular",0);


        // Add visitors to the ride history
        rollerCoaster.addVisitorToHistory(visitor1);
        rollerCoaster.addVisitorToHistory(visitor2);
        rollerCoaster.addVisitorToHistory(visitor3);
        rollerCoaster.addVisitorToHistory(visitor4);
        rollerCoaster.addVisitorToHistory(visitor5);
        rollerCoaster.addVisitorToHistory(visitor6);

        // Export the ride history to a file
        String fileName = "history.txt";
        rollerCoaster.exportRideHistory(fileName);
    }
    public void partSeven(){
    }
}

