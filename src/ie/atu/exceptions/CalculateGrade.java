package ie.atu.exceptions;


public class CalculateGrade {
    public static void main(String[] args) {

        try {
            calculateGrade(80);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
    public static void calculateGrade(int grade) {
        if (grade > 100) {
            throw new IllegalArgumentException("Grade must be below 100.");
        }
        System.out.println("Grade is valid.");
    }
}
