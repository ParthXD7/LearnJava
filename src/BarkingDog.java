public class BarkingDog {
    public static boolean shouldWakeUp(boolean barking, int hourOfDay) {
        if (hourOfDay < 0 || hourOfDay > 23) {
            return false;
        } else if (barking && (hourOfDay < 8 || hourOfDay > 22)) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        // Test cases
        System.out.println(shouldWakeUp(true, 1));   // true
        System.out.println(shouldWakeUp(false, 2));  // false
        System.out.println(shouldWakeUp(true, 8));   // false
        System.out.println(shouldWakeUp(true, -1));  // false
        System.out.println(shouldWakeUp(true, 24));  // false
    }
}
