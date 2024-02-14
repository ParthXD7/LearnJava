public class FirstLastDigitSum {
    public static int sumFirstAndLastDigit(int number) {
        if (number < 0) {
            return -1; // Return -1 for negative numbers
        }

        int lastDigit = number % 10;

        // Find the first digit by repeatedly dividing by 10 until the number is less than 10
        while (number >= 10) {
            number /= 10;
        }
        int firstDigit = number;

        // Return the sum of the first and last digit
        return firstDigit + lastDigit;
    }

    public static void main(String[] args) {
        // Test cases
        System.out.println("Sum of first and last digit of 123: " + sumFirstAndLastDigit(123)); // Output: 4
        System.out.println("Sum of first and last digit of 2578: " + sumFirstAndLastDigit(2578)); // Output: 10
        System.out.println("Sum of first and last digit of -121: " + sumFirstAndLastDigit(-121)); // Output: -1
    }
}
