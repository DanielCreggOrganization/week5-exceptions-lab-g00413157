package ie.atu.exceptions;

import java.util.Scanner;
public class TempetureArray {
    public static void main(String[] args) {
        int[] tempetures ={20,22,19,23,21,18,25};
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a day(1-7): ");
        int day =scanner.nextInt();

        try {
            System.out.println("Temepetures for day " + day + ": "+ tempetures[day - 1]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println( "Invalid day please enter another number between 1 and 7");
        }
       
    }
}
