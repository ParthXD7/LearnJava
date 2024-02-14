public class NumberToWords {

    public static int getDigitCount(int number) {
        if (number < 0) {
            return -1;
        }

        if (number == 0) {
            return 1;
        }

        int count = 0;

        while (number != 0) {
            count++;
            number /= 10;
        }

        return count;
    }


    public static int reverse(int number) {
        int reverse = 0;

        while (number != 0) {
            int lastDigit = number % 10;
            reverse = reverse * 10 + lastDigit;
            number /= 10;
        }

        return reverse;
    }


    public static void numberToWords(int number) {
        if (number < 0) {
            System.out.println("Invalid Value");
            return;
        }

        int reverse = reverse(number);
        int leadingZeroes = getDigitCount(number) - getDigitCount(reverse);

        if (number == 0) {
            System.out.println("Zero");
            return;
        }

        while (reverse != 0) {
            int lastDigit = reverse % 10;

            switch (lastDigit) {
                case 0:
                    System.out.print("Zero ");
                    break;
                case 1:
                    System.out.print("One ");
                    break;
                case 2:
                    System.out.print("Two ");
                    break;
                case 3:
                    System.out.print("Three ");
                    break;
                case 4:
                    System.out.print("Four ");
                    break;
                case 5:
                    System.out.print("Five ");
                    break;
                case 6:
                    System.out.print("Six ");
                    break;
                case 7:
                    System.out.print("Seven ");
                    break;
                case 8:
                    System.out.print("Eight ");
                    break;
                case 9:
                    System.out.print("Nine ");
                    break;
            }

            reverse /= 10;
        }

        while (leadingZeroes > 0) {
            System.out.print("Zero ");
            leadingZeroes--;
        }
    }


    public static void main(String[] args) {
        // Test cases
        numberToWords(123); // Output: One Two Three
        System.out.println();
        numberToWords(1000); // Output: One Zero Zero Zero
        System.out.println();
        numberToWords(-123); // Output: Invalid Value
    }
    }