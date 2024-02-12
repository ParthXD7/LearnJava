public class ForStatementCalcInterest {
    public static void main(String[] args) {
        for (int i = 1;i<=5;i++){
            System.out.println(i);
        }

        for (double rate = 2.0;rate<=5.0; rate++){
            double interestAmount = calcInterest(1000.0, rate);
            System.out.println("1000 at "+ rate+"% interest = $"+ interestAmount);
        }
        for (double i = 7.0;i<=9; i +=0.25){
            double interestAmount = calcInterest(100.0, i);
            if (interestAmount > 8.5){
              //  System.out.println("error");
                break;
            }
            System.out.println("1000 at "+ i+"% interest = $"+ interestAmount);
        }
    }
    public static double calcInterest(double amount, double interestRate){
        return (amount *(interestRate/100));
    }

}
