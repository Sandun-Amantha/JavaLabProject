import java.util.Scanner;

public class NameFormatter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your full name (first middle last): ");
        String firstName = sc.next();
        String middleName = sc.next();
        String lastName = sc.next();
        System.out.println(lastName + ", " + firstName + " " + middleName.charAt(0) + ".");
        sc.close();
    }
}
