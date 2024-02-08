public class DecimalComparator {
    public static boolean areEqualByThreeDecimalPlaces(double num1, double num2) {
        // Multiply by 1000 to shift the decimal point three places to the right
        // Convert to long to truncate any remaining decimal places
        long num1Scaled = (long) (num1 * 1000);
        long num2Scaled = (long) (num2 * 1000);

        // Check if the scaled numbers are equal
        return num1Scaled == num2Scaled;
    }

    public static void main(String[] args) {
        // Test cases
        System.out.println(areEqualByThreeDecimalPlaces(3.175, 3.176));  // true
        System.out.println(areEqualByThreeDecimalPlaces(3.0, 3.0));       // true
        System.out.println(areEqualByThreeDecimalPlaces(-3.123, 3.123));  // false
    }
}
