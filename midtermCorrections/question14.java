import java.util.Scanner;

public class question14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter dive value: ");
        double diveValue = input.nextDouble();
        
        if (diveValue < 6.0) {
            System.out.println("Needs Improvement");
        } else if (diveValue < 8.0) {
            System.out.println("Good");
        } else if (diveValue < 9.0) {
            System.out.println("Very Good");
        } else {
            System.out.println("Excellent");
        }
    }
}