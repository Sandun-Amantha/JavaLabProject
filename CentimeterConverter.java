import java.util.Scanner;

public class CentimeterConverter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the measurement in centimeters: ");
        double cm = sc.nextDouble();
        double inches = cm / 2.54;
        int feet = (int) inches / 12;
        inches = inches % 12;
        System.out.println(feet + " feet and " + inches + " inches.");
        sc.close();
    }
}
