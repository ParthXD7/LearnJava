package College;

public class CollegeDigit3Combination {
        public static void main(String[] args) {
            int num1 = 1234;
            int num2 = 4321;
            int num3 = 9012;

            int key = generateKey(num1, num2, num3);
            System.out.println("The generated key is: " + key);
        }

        public static int generateKey(int num1, int num2, int num3) {
            int[] nums = {num1, num2, num3};
            int[] maxDigits = new int[4];
            int[] minDigits = {9, 9, 9, 9};

            for (int num : nums) {
                for (int i = 0; i < 4; i++) {
                    int digit = num % 10;
                    num /= 10;

                    maxDigits[i] = Math.max(maxDigits[i], digit);
                    minDigits[i] = Math.min(minDigits[i], digit);
                }
            }

            int key = 0;
            for (int i = 3; i >= 0; i--) {
                key = key * 10 + (maxDigits[i] - minDigits[i]);
            }

            return key;
        }
    }
