import java.util.*;
class Student implements Comparator{
    String name;
    double gpa;

    public Student(String name, double gpa){
        this.name = name;
        this.gpa = gpa;
    }

    @Override
    public int compare(Object o){
        if(!(o instanceof Student)){
            throw new ClassCastException("Class not found");
        }
    }       
}
public class Main {

    public static void main(String[] args) {

        // Create a max-heap priority queue by comparing GPA in descending order
        PriorityQueue<Student> pq = new PriorityQueue<>(new Comparator<Student>() {
            public int compare(Student s1, Student s2) {
                return Double.compare(s2.gpa, s1.gpa); // Descending order
            }
        });

        List<Student> students = Arrays.asList(
                new Student("Tanzeel", 3.9),
                new Student("Aryan", 4.2),
                new Student("Parvish", 4.5),
                new Student("Rudr", 4.1),
                new Student("Alvin", 4.6),
                new Student("Rishi", 4.4),
                new Student("Suri", 4.0),
                new Student("Nik", 4.3)
        );

        // Add only students with GPA > 4.0 to the priority queue
        for (Student s : students) {
            if (s.gpa > 4.0) {
                pq.add(s);
            }
        }


        System.out.println("Top Students with GPA > 4.0 (Maximum 5):");

        int count = 0;
        while (!pq.isEmpty() && count < 5) {
            Student s = pq.poll(); // Removes and returns student with highest GPA
            System.out.println(s.name + " - GPA: " + s.gpa);
            count++;
        }



    }
}