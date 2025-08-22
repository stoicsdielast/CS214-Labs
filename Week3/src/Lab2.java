import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Comparator;

public class Lab2 {

    static class Student {
        String name;
        double gpa;

        Student(String name, double gpa) {
            this.name = name;
            this.gpa = gpa;
        }

        public String toString() {
            return name + " - GPA: " + gpa;
        }
    }

    //pq sorting in descending order
    private static void descendingGPA(){
        // pq for descending order of decimal numbers
        Queue<Student> sortGPA = new PriorityQueue<>(Comparator.comparingDouble((Student s) -> s.gpa).reversed());

        // add decimal numbers
        sortGPA.add(new Student("Aryan", 3.7));
        sortGPA.add(new Student("Parvish", 4.5));
        sortGPA.add(new Student("Rishi", 2.0));
        sortGPA.add(new Student("Alvin", 2.5));
        sortGPA.add(new Student("Tanzeel", 4.3));

        System.out.println("Decimal numbers in descending order:");
        while (!sortGPA.isEmpty()) {
            System.out.println(sortGPA.poll());
        }
    }

    public static void main(String[] args) {
        descendingGPA();
    }
}