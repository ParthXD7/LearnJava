package College;

import java.util.Arrays;

public class CollegeArrayOperations {
    public static void main(String[] args) {
        // Create a linear array of numbers
        int[] numbers = {153, 371, 407, 12, 9, 5, 21, 36, 64, 820};

        // a) Replace every number value with its location in array if the location is an Armstrong number
        for (int i = 0; i < numbers.length; i++) {
            if (isArmstrong(i + 1)) {
                numbers[i] = i + 1;
            }
        }

        // b) Delete every multiple of a particular number from the array
        int multipleToDelete = 3; // Change this to the desired number
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] != 0 && numbers[i] % multipleToDelete == 0) {
                numbers[i] = 0;
            }
        }

        // c) Find the sum of largest and smallest number in array and insert it at the middle of the array
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int number : numbers) {
            if (number != 0) {
                min = Math.min(min, number);
                max = Math.max(max, number);
            }
        }
        int sum = min + max;

        // Shift elements to the right to insert sum at the middle
        for (int i = numbers.length - 1; i >= numbers.length / 2; i--) {
            numbers[i] = numbers[i - 1];
        }
        numbers[numbers.length / 2] = sum;
        System.out.println("Middle Element which is sum :- "+sum);
        // d) Reverse the elements of the array without using any other array
        for (int i = 0; i < numbers.length / 2; i++) {
            int temp = numbers[i];
            numbers[i] = numbers[numbers.length - 1 - i];
            numbers[numbers.length - 1 - i] = temp;
        }

        // Print the modified array
        System.out.println("Modified Array: " + Arrays.toString(numbers));
    }

    // Function to check if a number is an Armstrong number
    private static boolean isArmstrong(int num) {
        int originalNum = num;
        int sum = 0;

        while (originalNum != 0) {
            int digit = originalNum % 10;
            sum += Math.pow(digit, 3); // assuming 3-digit Armstrong numbers
            originalNum /= 10;
        }

        return sum == num;
    }
}
