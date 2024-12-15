package github.io.mli49.assignment.part4b;

import java.util.Comparator;

public class VisitorComparator implements Comparator<Visitor> {
    @Override
    public int compare(Visitor visitor1, Visitor visitor2) {
        // Compare by name first, if names are equal then compare by age
        int nameComparison = visitor1.getName().compareTo(visitor2.getName());
        
        if (nameComparison != 0) {
            return nameComparison;
        } else {
            // If names are the same, compare by age
            return Integer.compare(visitor1.getAge(), visitor2.getAge());
        }
    }
}
