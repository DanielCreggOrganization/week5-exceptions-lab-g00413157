package ie.atu.exceptions;

public class ProcessData {
    public static void main(String[] args) {
        try {
            processData();
        } catch (Exception e) {
            System.out.println("Exception handled: " + e.getMessage());
        }
        
    }
    public static void processData()throws Exception{
        throw new Exception("An Error Occurred");   
    }
}
