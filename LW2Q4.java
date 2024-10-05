import java.util.Scanner;
import java.util.Arrays;

public class LW2Q4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numbers[] = new int[5] ;

        System.out.println("Enter 5 integers : ");

        for(int i = 0 ; i < 5 ; i++){
            numbers[i] = scanner.nextInt();
        }

        Arrays.sort(numbers);


        int secondMax = numbers[3];


        System.out.println("The second largest value is: " + secondMax);


    }
}
