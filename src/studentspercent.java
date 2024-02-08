import java.util.Scanner;

public class studentspercent {
    public static void main(String[] args) {
//        this is a test to calculate percentage for the students
        double sub1, sub2, sub3, sub4, sub5, totalm, outof;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter The Out Of marks of The Subjects : ");
        outof = sc.nextInt();
        System.out.println("Enter Number of Each Subjects on by one: ");
        sub1 = sc.nextInt();
        sub2 = sc.nextInt();
        sub3 = sc.nextInt();
        sub4 = sc.nextInt();
        sub5 = sc.nextInt();

        totalm = sub1 + sub2 + sub3 + sub4 + sub5;
        System.out.print("Total Percentage is = " + (totalm / (outof * 5)) * 100 + "%");

    }
}
