public class PositiveNegativeZero {
    public static void main(String[] args) {
        checkNumber(20);
        checkNumber(-20);
        checkNumber(0);
    }
    public static void checkNumber(int number){
        String value = "zero";
        if (number<0){
            value="negative";
        }else if (number>0){
            value="positive";
        }
        System.out.println(value);
    }

}
