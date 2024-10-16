package ie.atu.exceptions;

import java.util.Scanner;
import java.util.InputMismatchException;

public class MenuExample {
    public static void main(String[] args) {
        boolean validInput = false;
        try (Scanner userInput = new Scanner(System.in);) {

            while (!validInput) {
                try {
                    System.out.print("Enter First Number: ");
                    int num1 = userInput.nextInt();

                    System.out.print("Enter First Number: ");
                    int num2 = userInput.nextInt();

                    int result = num1 / num2;
                    System.out.println("Result: " + result);
                    validInput = true;
                } catch (ArithmeticException e) {
                    System.out.println("Error: " + e.getMessage());
                } catch (InputMismatchException e) {
                    System.out.println("Error: " + e.getMessage());
                    userInput.nextLine();
                }
            }
        }

    }// End of Main method
}// End of Class MenuExample
