public class LeapYear {
    public static boolean isLeapYear(int year) {
        if (year < 1 || year > 9999) {
            return false;
        } else {
            if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
                return true;
            } else {
                return false;
            }
        }
    }

    public static void main(String[] args) {
        // Test cases
        System.out.println(isLeapYear(1700));  // false
        System.out.println(isLeapYear(1800));  // false
        System.out.println(isLeapYear(2000));  // true
        System.out.println(isLeapYear(2024));  // true
    }
}
