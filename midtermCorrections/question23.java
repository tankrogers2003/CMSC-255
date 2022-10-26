import java.util.Scanner;

public class question23 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number of students: ");
        int numStudents = input.nextInt();

        int count = 1;
        System.out.println("Enter Student Name: ");
        String firstName = input.nextLine();

        while (count < numStudents) {
            System.out.println("Enter Student Name: ");
            String name = input.nextLine();
            
            if (name.compareTo(firstName) < 0) {
                firstName = name;
            }
            count += 1;
        }
        System.out.println(firstName);
    }
}