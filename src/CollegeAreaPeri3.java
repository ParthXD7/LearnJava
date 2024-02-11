import java.util.Scanner;

public class CollegeAreaPeri3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Choose a shape to calculate its area and perimeter:");
        System.out.println("1. Circle");
        System.out.println("2. Square");
        System.out.println("3. Rectangle");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Enter the radius of the circle:");
                double radius = scanner.nextDouble();
                double circleArea = Math.PI * radius * radius;
                double circlePerimeter = 2 * Math.PI * radius;
                System.out.println("Area of the circle: " + circleArea);
                System.out.println("Perimeter of the circle: " + circlePerimeter);
                break;
            case 2:
                System.out.println("Enter the side length of the square:");
                double sideLength = scanner.nextDouble();
                double squareArea = sideLength * sideLength;
                double squarePerimeter = 4 * sideLength;
                System.out.println("Area of the square: " + squareArea);
                System.out.println("Perimeter of the square: " + squarePerimeter);
                break;
            case 3:
                System.out.println("Enter the length and width of the rectangle:");
                double length = scanner.nextDouble();
                double width = scanner.nextDouble();
                double rectangleArea = length * width;
                double rectanglePerimeter = 2 * (length + width);
                System.out.println("Area of the rectangle: " + rectangleArea);
                System.out.println("Perimeter of the rectangle: " + rectanglePerimeter);
                break;
            default:
                System.out.println("Invalid choice!");
        }

        scanner.close();
    }
}
