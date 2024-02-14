public class FactorPrinter {
    public static void printFactors(int number) {
        // Check if the number is less than 1
        if (number < 1) {
            System.out.println("Invalid Value");
            return;
        }

        // Loop to find factors and print them
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                System.out.println(i);
            }
        }
    }

    public static void main(String[] args) {
        // Test cases
        System.out.println("Factors of 6:");
        printFactors(6); // Output: 1, 2, 3, 6

        System.out.println("Factors of 20:");
        printFactors(20); // Output: 1, 2, 4, 5, 10, 20

        System.out.println("Factors of -1:");
        printFactors(-1); // Output: Invalid Value
    }
}
