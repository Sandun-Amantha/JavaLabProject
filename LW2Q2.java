import java.util.*;

public class LW2Q2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int number;

        do {

            System.out.print("Enter integer value : ");


            number = scanner.nextInt();
            String num = Integer.toString(number);

            System.out.println("The number of digits is " + num.length());

        }while(number >= 0)  ;

    }
}
