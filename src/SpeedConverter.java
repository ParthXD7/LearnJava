public class SpeedConverter {
    public static void main(String[] args) {
    printConversion(95.75);
    }
    public static long toMilesPerHour(double kilometersPerHour) {
        double value = 0;
        if (kilometersPerHour < 0) {
            value = -1;
        } else {
            value = 0.621 * Math.round(kilometersPerHour);
        }

        return Math.round(value);
    }

    public static void printConversion(double kilometersPerHour) {
        if (kilometersPerHour < 0) {
            System.out.println("Invalid Value");
            return;
        }
        System.out.println(kilometersPerHour + " km/h = " + Math.round(toMilesPerHour(kilometersPerHour)) + " mi/h");
    }

}
