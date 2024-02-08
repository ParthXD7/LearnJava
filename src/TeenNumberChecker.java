public class TeenNumberChecker {
    public static boolean hasTeen(int num1, int num2, int num3) {
        return isTeen(num1) || isTeen(num2) || isTeen(num3);
    }

    public static boolean isTeen(int num) {
        return num >= 13 && num <= 19;
    }

    public static void main(String[] args) {
        // Test cases
        System.out.println(hasTeen(13, 20, 10)); // true
        System.out.println(hasTeen(20, 21, 22)); // false
    }
}
