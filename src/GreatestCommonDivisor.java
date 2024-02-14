public class GreatestCommonDivisor {
    public static int getGreatestCommonDivisor(int first, int second) {
        // Check if either parameter is less than 10
        if (first < 10 || second < 10) {
            return -1; // Return -1 for invalid value
        }

        // Find the smaller number between first and second
        int smaller = Math.min(first, second);

        // Initialize the greatest common divisor (gcd) to 1
        int gcd = 1;

        // Iterate from 1 to the smaller number
        for (int i = 1; i <= smaller; i++) {
            // Check if both numbers are divisible by the current iteration index
            if (first % i == 0 && second % i == 0) {
                gcd = i; // Update gcd if the current index is a common divisor
            }
        }

        // Return the greatest common divisor
        return gcd;
    }

    public static void main(String[] args) {
        // Test cases
        System.out.println("Greatest common divisor of 25 and 15: " + getGreatestCommonDivisor(25, 15)); // Output: 5
        System.out.println("Greatest common divisor of 81 and 153: " + getGreatestCommonDivisor(81, 153)); // Output: 9
        System.out.println("Greatest common divisor of 12 and 5: " + getGreatestCommonDivisor(12, 5)); // Output: -1 (invalid value)
    }
}
