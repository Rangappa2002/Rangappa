
public class Student {
    private int age;
    private String name;

    // Constructor to initialize age and name
    public Student(int age, String name) {
        this.age = age;
        this.name = name;
    }

    // Getters for age and name (optional but good practice)
    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }
    
    public class Solution {
        public static void main(String[] args) {
            // Create an array to store Student objects
            Student[] students = new Student[2];
    
            // Create instances of Student and store them in the array
            students[0] = new Student(20, "Alice");
            students[1] = new Student(22, "Bob");
    
            // Traverse the array using a for loop and print details of each student
            System.out.println("Student Details:");
            for (int i = 0; i < students.length; i++) {
                System.out.println("Student " + (i + 1) + ":");
                System.out.println("Name: " + students[i].getName());
                System.out.println("Age: " + students[i].getAge());
                System.out.println(); // Print an empty line for separation
            }
        }
    }
    
}
