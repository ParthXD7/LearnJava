public class EvenDigitSum {
    public static int getEvenDigitSum(int number) {
        if (number < 0) {
            return -1; // Return -1 for negative numbers
        }

        int sum = 0;

        // Iterate through each digit of the number
        while (number > 0) {
            int digit = number % 10;
            // Check if the digit is even
            if (digit % 2 == 0) {
                sum += digit; // Add the even digit to the sum
            }
            // Remove the last digit from the number
            number /= 10;
        }

        return sum; // Return the sum of even digits
    }

    public static void main(String[] args) {
        // Test cases
        System.out.println("Sum of even digits in 123456: " + getEvenDigitSum(123456)); // Output: 12
        System.out.println("Sum of even digits in 13579: " + getEvenDigitSum(13579)); // Output: 0 (no even digits)
        System.out.println("Sum of even digits in -2468: " + getEvenDigitSum(-2468)); // Output: -1
    }
}
