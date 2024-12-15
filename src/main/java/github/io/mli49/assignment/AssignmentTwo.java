package github.io.mli49.assignment;

import github.io.mli49.assignment.part1.Employee;
import github.io.mli49.assignment.part1.Ride;
import github.io.mli49.assignment.part1.Visitor;

public class AssignmentTwo {
    // main method in AssignmentTwo class
    public static void main(String[] args) {
        // Create instances of Employee, Visitor, and Ride
        Employee emp = new Employee("John", 30, "Male", "Ride Operator", "Roller Coaster");
        Visitor visitor = new Visitor("Alice", 25, "Female", "VIP", 10);
        Ride ride = new Ride("Roller Coaster", "Thrill", emp);

        // Display information
        System.out.println(emp.getEmployeeInfo());
        System.out.println(visitor.getVisitorInfo());
        System.out.println(ride.getRideInfo());
    }
    public void partThree(){
    }
    public void partFourA(){
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

