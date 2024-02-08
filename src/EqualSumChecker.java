public class EqualSumChecker {

    public static boolean hasEqualSum(int a,int b, int c){
        if ((a+b)==c){
        return true;
        }else return false;
    }

    public static void main(String[] args) {
        System.out.println(hasEqualSum(5,5,10));
    }
}
