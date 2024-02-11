public class AreaCalculator {
    public static void main(String[] args) {
        System.out.println(area(75.0));
        System.out.println(area(10,20));
    }
    public static double area(double radius){
        if (radius<=-1){
            return -1;
        }

        return (Math.PI*radius*radius);
    }

    public static double area(double x,double y){
        if (x <= -1 || y <= -1){
            return -1;
        }
        return y*x;
    }

}
