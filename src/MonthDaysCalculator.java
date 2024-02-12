public class MonthDaysCalculator {
    public static boolean isLeapYear(int year) {
        if (year < 1 || year > 9999) {
            return false;
        } else {
            return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
        }
    }

    public static int getDaysInMonth(int month, int year) {
        if (month < 1 || month > 12 || year < 1 || year > 9999) {
            return -1;
        } else {
            switch (month) {
                case 2:
                    return isLeapYear(year) ? 29 : 28;
                case 4:
                case 6:
                case 9:
                case 11:
                    return 30;
                default:
                    return 31;
            }
        }
    }

    public static void main(String[] args) {
        System.out.println(getDaysInMonth(2, 2024)); // 29
        System.out.println(getDaysInMonth(2, 2021)); // 28
        System.out.println(getDaysInMonth(4, 2021)); // 30
        System.out.println(getDaysInMonth(9, 2021)); // 30
        System.out.println(getDaysInMonth(11, 2021)); // 30
        System.out.println(getDaysInMonth(13, 2021)); // -1
        System.out.println(getDaysInMonth(2, 10000)); // -1
    }
}
