public class SharedDigit {
    public static boolean hasSharedDigit(int num1, int num2) {
        // Check if numbers are within the valid range
        if ((num1 < 10 || num1 > 99) || (num2 < 10 || num2 > 99)) {
            return false;
        }

        // Extract digits from both numbers
        int digit1 = num1 % 10;
        int tens1 = num1 / 10;
        int digit2 = num2 % 10;
        int tens2 = num2 / 10;

        // Check if any digit from num1 matches any digit from num2
        return digit1 == digit2 || digit1 == tens2 || tens1 == digit2 || tens1 == tens2;
    }

    public static void main(String[] args) {
        // Test cases
        System.out.println("Has shared digit between 12 and 23: " + hasSharedDigit(12, 23)); // Output: true
        System.out.println("Has shared digit between 15 and 23: " + hasSharedDigit(15, 23)); // Output: false
        System.out.println("Has shared digit between 12 and 52: " + hasSharedDigit(12, 52)); // Output: true
        System.out.println("Has shared digit between 9 and 99: " + hasSharedDigit(9, 99)); // Output: false
    }
}
