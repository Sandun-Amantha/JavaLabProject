import java.util.Scanner;

public class MiddleCharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an odd-length word: ");
        String word = sc.next();
        if (word.length() % 2 != 0) {
            int middleIndex = word.length() / 2;
            System.out.println("The middle character is: " + word.charAt(middleIndex));
        } else {
            System.out.println("The word length is even.");
        }
        sc.close();
    }
}
