package ie.atu.exceptions;

import java.io.FileReader;
// import java.io.IOException;

public class CheckedExceptionHandling {
    public static void main(String[] args) {
        try(FileReader reader = new FileReader("example.txt"); ) {
            // This line may throw IOException
            System.out.println("File opened successfully");
        } catch (Exception e) {
            System.out.println("there is an error");
        }

    }
}
