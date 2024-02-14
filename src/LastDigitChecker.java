public class LastDigitChecker {
    public static boolean hasSameLastDigit(int num1, int num2, int num3) {
        // Check if numbers are within the valid range
        if (!isValid(num1) || !isValid(num2) || !isValid(num3)) {
            return false;
        }

        // Extract last digits from all three numbers
        int lastDigit1 = num1 % 10;
        int lastDigit2 = num2 % 10;
        int lastDigit3 = num3 % 10;

        // Check if at least two numbers share the same rightmost digit
        return lastDigit1 == lastDigit2 || lastDigit1 == lastDigit3 || lastDigit2 == lastDigit3;
    }

    // Helper method to check if a number is within the range of 10 (inclusive) - 1000 (inclusive)
    public static boolean isValid(int num) {
        return num >= 10 && num <= 1000;
    }

    public static void main(String[] args) {
        // Test cases
        System.out.println("Has same last digit between 41, 22, and 71: " + hasSameLastDigit(41, 22, 71)); // Output: true
        System.out.println("Has same last digit between 23, 32, and 42: " + hasSameLastDigit(23, 32, 42)); // Output: true
        System.out.println("Has same last digit between 9, 99, and 999: " + hasSameLastDigit(9, 99, 999)); // Output: false
    }
}
