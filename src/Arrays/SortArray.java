package Arrays;

import java.util.Scanner;
import java.util.Arrays;

public class SortArray {
    public static void main(String[] args) {
        int size = 5; // Change the size of the array as needed
        int[] integers = getIntegers(size);
        int[] sortedIntegers = sortIntegers(integers);
        System.out.println("Sorted array:");
        printArray(sortedIntegers);
        String[] sArray = {"one", "two", "three", "four"};
        System.out.println(String.join(",",sArray));
    }
    public static int[] getIntegers(int size) {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[size];
        System.out.println("Enter " + size + " integers:");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }
        return array;
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println("Element " + i + " contents " + array[i]);
        }
    }

    public static int[] sortIntegers(int[] array) {
        int[] sortedArray = Arrays.copyOf(array, array.length);
        Arrays.sort(sortedArray);
        int temp;
        for (int i = 0; i < sortedArray.length / 2; i++) {
            temp = sortedArray[i];
            sortedArray[i] = sortedArray[sortedArray.length - 1 - i];
            sortedArray[sortedArray.length - 1 - i] = temp;
        }
        return sortedArray;
    }
}
