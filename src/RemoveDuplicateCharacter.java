import java.util.HashSet;
import java.util.Scanner;

/*
            input: Programming
            output: progamin
 */

public class RemoveDuplicateCharacter {

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter a word");
        String input = sc.nextLine();
        String result = removeDuplicate(input.toLowerCase());

        System.out.println("After removing duplicates: " + result);
    }

    public static String removeDuplicate(String s) {
        StringBuilder result = new StringBuilder();
        HashSet<Character> set = new HashSet<>();

        for (int i = 0; i < s.length(); i++) {

            if (!set.contains(s.charAt(i))) {
                set.add(s.charAt(i));
                result.append(s.charAt(i));
            }
        }

        return result.toString();
    }
}
