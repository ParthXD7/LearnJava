public class NumberPalidrome {

    public static boolean isPalindrome(int number) {
        int originalNumber = number;
        int reverse = 0;
        // Handle negative numbers
        if (number < 0) {
            number = Math.abs(number);
            originalNumber = number;
        }
        // Reverse the number
        while (number > 0) {
            int lastDigit = number % 10;
            reverse = reverse * 10 + lastDigit;
            number /= 10;
        }

        // Check if the original number is equal to its reverse
        return originalNumber == reverse;
    }

        public static void main(String[] args) {
            // Test cases
            int num1 = -222;
            int num2 = 101;
            int num3 = 12345;

            System.out.println(num1 + " is palindrome: " + isPalindrome(num1)); // true
            System.out.println(num2 + " is palindrome: " + isPalindrome(num2)); // true
            System.out.println(num3 + " is palindrome: " + isPalindrome(num3)); // false
        }
    }
