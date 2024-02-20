package Inheritance;

public class Main {
    public static void main(String[] args) {
        SimpleCalculator calculator = new SimpleCalculator();
        calculator.setFirstNumber(10);
        calculator.setSecondNumber(5);

        System.out.println("Addition result: " + calculator.getAdditionResult());
        System.out.println("Subtraction result: " + calculator.getSubtractionResult());
        System.out.println("Multiplication result: " + calculator.getMultiplicationResult());
        System.out.println("Division result: " + calculator.getDivisionResult());

        Person person = new Person();
        person.setFirstName("John");
        person.setLastName("Doe");
        person.setAge(25);

        System.out.println("First Name: " + person.getFirstName());
        System.out.println("Last Name: " + person.getLastName());
        System.out.println("Age: " + person.getAge());
        System.out.println("Is Teen: " + person.isTeen());
        System.out.println("Full Name: " + person.getFullName());
    }
}
