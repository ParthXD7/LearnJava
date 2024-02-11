import java.util.Scanner;

// Define a class to represent a Student
class Student {
    String name;
    int rollNumber;
    String branch;
    String city;
    String phoneNumber;
    double cgpa;

    // Constructor to initialize student details
    public Student(String name, int rollNumber, String branch, String city, String phoneNumber, double cgpa) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.branch = branch;
        this.city = city;
        this.phoneNumber = phoneNumber;
        this.cgpa = cgpa;
    }
}

public class CollegeStudentDetails {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create an array to store student records
        Student[] students = new Student[10];

        // Initialize student records
        initializeStudents(students);

        // Query 1: Count the number of students whose name starts with a particular character
        countStudentsWithCharacter(scanner, students);

        // Query 2: Display the details of students who belong to a particular city and whose cgpa is more than 8
        displayStudentsInCityWithHighCGPA(scanner, students);

        // Query 3: Count the number of students in each particular branch
        countStudentsInEachBranch(students);
    }

    // Function to initialize student records
    private static void initializeStudents(Student[] students) {
        students[0] = new Student("John", 1, "Computer Science", "New York", "1234567890", 8.5);
        students[1] = new Student("Emma", 2, "Electrical Engineering", "Los Angeles", "2345678901", 9.0);
        students[2] = new Student("Michael", 3, "Mechanical Engineering", "Chicago", "3456789012", 7.8);
        students[3] = new Student("Sophia", 4, "Civil Engineering", "Houston", "4567890123", 8.2);
        students[4] = new Student("William", 5, "Computer Science", "New York", "5678901234", 9.5);
        students[5] = new Student("Olivia", 6, "Electrical Engineering", "Los Angeles", "6789012345", 8.9);
        students[6] = new Student("James", 7, "Computer Science", "Chicago", "7890123456", 7.5);
        students[7] = new Student("Amelia", 8, "Mechanical Engineering", "Houston", "8901234567", 8.3);
        students[8] = new Student("Benjamin", 9, "Computer Science", "New York", "9012345678", 9.2);
        students[9] = new Student("Isabella", 10, "Electrical Engineering", "Los Angeles", "0123456789", 7.7);
    }

    // Query 1: Count the number of students whose name starts with a particular character
    private static void countStudentsWithCharacter(Scanner scanner, Student[] students) {
        System.out.print("Enter the character to count: ");
        char character = scanner.next().charAt(0);
        int count = 0;
        for (Student student : students) {
            if (student.name.charAt(0) == character) {
                count++;
            }
        }
        System.out.println("Number of students whose name starts with " + character + ": " + count);
    }

    // Query 2: Display the details of students who belong to a particular city and whose cgpa is more than 8
    private static void displayStudentsInCityWithHighCGPA(Scanner scanner, Student[] students) {
        System.out.print("Enter the city to search: ");
        String cityToSearch = scanner.next();
        System.out.println("Students from " + cityToSearch + " with CGPA more than 8:");
        for (Student student : students) {
            if (student.city.equalsIgnoreCase(cityToSearch) && student.cgpa > 8.0) {
                System.out.println("Name: " + student.name + ", Roll Number: " + student.rollNumber +
                        ", Branch: " + student.branch + ", Phone Number: " + student.phoneNumber + ", CGPA: " + student.cgpa);
            }
        }
    }

    // Query 3: Count the number of students in each particular branch
    private static void countStudentsInEachBranch(Student[] students) {
        int[] branchCount = new int[3]; // Assuming there are 3 branches: Computer Science, Electrical Engineering, Mechanical Engineering
        for (Student student : students) {
            switch (student.branch) {
                case "Computer Science":
                    branchCount[0]++;
                    break;
                case "Electrical Engineering":
                    branchCount[1]++;
                    break;
                case "Mechanical Engineering":
                    branchCount[2]++;
                    break;
            }
        }
        System.out.println("Number of students in each branch:");
        System.out.println("Computer Science: " + branchCount[0]);
        System.out.println("Electrical Engineering: " + branchCount[1]);
        System.out.println("Mechanical Engineering: " + branchCount[2]);
    }
}
