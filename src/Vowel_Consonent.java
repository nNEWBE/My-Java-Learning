import java.util.Scanner;
import java.util.stream.IntStream;

public class Vowel_Consonent {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a character : ");
        char ch = input.next().charAt(0);

        char[] arr = new char[] { 'a', 'e', 'i', 'o', 'u' };
        boolean isVowel = IntStream.range(0, arr.length)
                .mapToObj(i -> arr[i])
                .anyMatch(element -> element == Character.toLowerCase(ch));

        if (isVowel) {
            System.out.println("The character is Vowel");
        } else {
            System.out.println("This character is Consonant");
        }

        input.close();
    }
}