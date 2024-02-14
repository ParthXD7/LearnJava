public class PerfectNumber {

    public static boolean isPerfectNumber(int number) {
        // Check if the number is less than 1
        if (number < 1) {
            return false;
        }

        // Initialize sum of divisors to 0
        int sum = 0;

        // Find divisors and add them to the sum
        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                sum += i;
            }
        }

        // Check if the sum of divisors equals the number
        return sum == number;
    }

    public static void main(String[] args) {
        // Test cases
        System.out.println("Is 6 a perfect number? " + isPerfectNumber(6)); // Output: true
        System.out.println("Is 28 a perfect number? " + isPerfectNumber(28)); // Output: true
        System.out.println("Is 12 a perfect number? " + isPerfectNumber(12)); // Output: false
        System.out.println("Is -5 a perfect number? " + isPerfectNumber(-5)); // Output: false
    }
}
