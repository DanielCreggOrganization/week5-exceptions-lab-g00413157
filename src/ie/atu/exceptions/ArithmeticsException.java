package ie.atu.exceptions;

public class ArithmeticsException {
    public static void main(String[] args) {
        try {
            int division = 6/3;
            System.out.println(division);
        } catch (ArithmeticException e) {
            System.out.println("Cannot Divide By zero");
        }finally{
            System.out.println("Calculation Completed");
        }
    }
}
