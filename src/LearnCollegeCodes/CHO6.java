package CollegeCHO;

import java.util.*;

public class CHO6 {
    Scanner s1 = new Scanner(System.in);
    static CHO6[][] q;
    static int rows, cols;
    // array as a data member. which means it is visible to all the functions
    String name, city, designation, phone;
    Double salary;

    void get() {
        rows = 4;
        q = new CHO6[rows][];
        for (int i = 0; i < rows; i++) {
            System.out.println("\n Enter number of employees for " + i + " th row");
            cols = s1.nextInt();
            q[i] = new CHO6[cols];
        }
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < q[i].length; j++) //q[i].length because columns are not fixed
            {
                q[i][j] = new CHO6(); // objects
                System.out.println("\n Enter name, city, designation, phone number and  salary: ");
                q[i][j].name = s1.next();
                q[i][j].city = s1.next();
                q[i][j].designation = s1.next();
                q[i][j].phone = s1.next();
                q[i][j].salary = s1.nextDouble();
            }
        }
    }

    void display() {
        System.out.println("Name: " + name + "\ncity" + city + "\nDesignation:" + designation + "phone no: " + phone + "salary" + salary);
    }

    static void query1() {
        String search;
        int count = 0;
        Scanner s1 = new Scanner(System.in);
        System.out.println("Enter the city you want to search: ");
        search = s1.next();

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < q[i].length; j++) {
                if (((q[i][j].city).equalsIgnoreCase(search) && (q[i][j].designation).equalsIgnoreCase("manager")) || ((q[i][j].city).equalsIgnoreCase(search) && (q[i][j].designation).equalsIgnoreCase("engineer"))) {
                    count++;
                }
            }
        }

        System.out.println("Number of managers and engineers in " + search + ": " + count);
    }


    static void query2() {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < q[i].length; j++) {
                if (q[i][j].salary > 10000) {
                    q[i][j].display();
                }
            }
        }
    }

    static void query3() {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < q[i].length; j++) {
                if ((q[i][j].designation.equalsIgnoreCase("Accountant") || q[i][j].designation.equalsIgnoreCase("clerk"))) {
                    String name = q[i][j].name.toLowerCase();
                    char firstChar = name.charAt(0);
                    if (firstChar == 'a' || firstChar == 'e' || firstChar == 'i' || firstChar == 'o' || firstChar == 'u') {
                        q[i][j].display();
                    }
                }
            }
        }
    }

    static void query4() {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < q[i].length; j++) {
                System.out.println("Enter the new surname for employee " + q[i][j].name + ": ");
                String surname = scanner.next();
                q[i][j].name += " " + surname;
            }
        }
        System.out.println("Employee names updated successfully!");
    }

    static void query5() {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < q[i].length; j++) {
                q[i][j].display();
            }
        }
    }

    public static void main(String[] arr) {
        System.out.println(" NAME: Parth \n ROLL NO: 2201997170");
        CHO6 q = new CHO6();
        q.get();

        Scanner s1 = new Scanner(System.in);
        int choice;

        do {
            System.out.println(" Enter your choice: \n 1. Count the number of managers and engineers belonging to a particular city\n 2. Display details of all employees drawing salary more than 10,000\n 3. Display details of all Accountants and clerk whose name starts with a vowel \n 4. Change the name of each employee in such a way that the sir name of the employee gets attached to the respective name.\n 5. Display the array");
            choice = s1.nextInt();

            switch (choice) {
                case 1:
                    query1();
                    break;
                case 2:
                    query2();
                    break;
                case 3:
                    query3();
                    break;
                case 4:
                    query4();
                    break;
                case 5:
                    query5();
                    break;
                default:
                    System.out.println("Invalid Choice!");
            }

            System.out.println("Do you want to continue? 1 for yes and 0 for no.");
            int c = s1.nextInt();
            if (c == 0) break;
        } while (true);

        s1.close();
    }
}
