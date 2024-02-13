package LearnCollegeCodes;

import java.util.Scanner;

    public class CollegeEncryptNumber {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter a number to encrypt: ");
            int originalNumber = scanner.nextInt();

            // Encryption key (can be any integer value)
            int key = 5;

            // Encrypt the number using bitwise XOR operation with the key
            int encryptedNumber = originalNumber ^ key;

            System.out.println("Original Number: " + originalNumber);
            System.out.println("Encrypted Number: " + encryptedNumber);

            scanner.close();
        }
    }

