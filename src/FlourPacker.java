public class FlourPacker {

    public static boolean canPack(int bigCount, int smallCount, int goal) {
        if (bigCount < 0 || smallCount < 0 || goal < 0) {
            return false;
        }

        int bigKilos = bigCount * 5;
        int smallKilos = smallCount;

        if (bigKilos + smallKilos < goal) {
            return false;
        } else if (bigKilos + smallKilos == goal) {
            return true;
        } else {
            if (bigKilos >= goal) {
                return smallKilos >= goal % 5;
            } else {
                return smallKilos >= goal - bigKilos;
            }
        }
    }

    public static void main(String[] args) {
        // Test cases
        System.out.println(canPack(1, 0, 4)); // Output: false
        System.out.println(canPack(1, 5, 9)); // Output: true
        System.out.println(canPack(0, 5, 4)); // Output: true
        System.out.println(canPack(2, 2, 11)); // Output: true
        System.out.println(canPack(-3, 2, 12)); // Output: false
    }
}
