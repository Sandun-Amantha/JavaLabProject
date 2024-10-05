import java.util.StringTokenizer;
import java.util.Scanner;

public class LW2Q5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("Enter a sentence: ");
        String sentence = scanner.nextLine();

        // Use StringTokenizer to split the sentence into words
        StringTokenizer tokenizer = new StringTokenizer(sentence, " ,.!?;:-\"\'");


        StringBuilder cleanSentence = new StringBuilder();
        while (tokenizer.hasMoreTokens()) {
            String word = tokenizer.nextToken().toLowerCase();
            cleanSentence.append(word);
        }


        String cleanedString = cleanSentence.toString();
        boolean isPalindrome = checkPalindrome(cleanedString);


        if (isPalindrome) {
            System.out.println("The sentence is a palindrome.");
        } else {
            System.out.println("The sentence is not a palindrome.");
        }

        scanner.close();
    }


    public static boolean checkPalindrome(String str) {
        int start = 0;
        int end = str.length() - 1;

        while (start < end) {
            if (str.charAt(start) != str.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}
