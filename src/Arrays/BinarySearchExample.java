package Arrays;

import java.util.Arrays;

public class BinarySearchExample {

    // Method to perform binary search on a sorted array
    public static int binarySearch(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            // Check if target is present at mid
            if (arr[mid] == target) {
                return mid;
            }

            // If target is greater, ignore left half
            if (arr[mid] < target) {
                left = mid + 1;
            } else { // If target is smaller, ignore right half
                right = mid - 1;
            }
        }

        // If we reach here, then the element was not present
        return -1;
    }

    // Method to test the binary search function
    public static void testBinarySearch() {
        int[] arr = {2, 3, 4, 10, 40};
        int target = 10;
        int expectedIndex = 3;

        int resultIndex = binarySearch(arr, target);

        if (resultIndex == expectedIndex) {
            System.out.println("Binary Search Test Passed!");
        } else {
            System.out.println("Binary Search Test Failed!");
        }
    }
    public static void arrayeq(){

    }

    public static void main(String[] args) {
        testBinarySearch();
    }
}
