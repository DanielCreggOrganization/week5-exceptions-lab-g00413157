package ie.atu.exceptions;



public class DaysOfTheWeek {
    public static void main(String[] args) {
        try {
            String[] days = {"Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"};
            System.out.println(days[9]);
        } catch (ArrayIndexOutOfBoundsException e) {
           System.out.println("Index Out Of Bounds");
        }
    }
}
