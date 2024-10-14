package ie.atu.exceptions;

public class TryCatchExample {
    public static void main(String[] args) {
        try {
            int division = 10 / 0; // May throw ArithmeticException
            System.out.println(division);
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero!");
        }
    }
}
