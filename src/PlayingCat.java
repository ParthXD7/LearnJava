public class PlayingCat {

    public static void main(String[] args) {
        System.out.println(isCatPlaying(true, 10)); // Output: false
        System.out.println(isCatPlaying(false, 35)); // Output: true
        System.out.println(isCatPlaying(true, 45)); // Output: true
    }

    public static boolean isCatPlaying(boolean summer, int temperature) {
        int upperLimit = (summer) ? 45 : 35;
        return temperature >= 25 && temperature <= upperLimit;
    }
}
