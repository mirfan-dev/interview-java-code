import java.util.Scanner;

/*
      input : s1= silent, s2= listen
      output: true
 */

public class Anagram {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first word");
        String s1 = sc.nextLine().toLowerCase();
        System.out.println("Enter second word");
        String s2 = sc.nextLine().toLowerCase();

        if (checkAnagram(s1, s2)) {
            System.out.println(s1 + " and " + s2 + " are anagram");
        } else {
            System.out.println(s1 + " and " + s2 + " are not anagram");
        }

    }

    public static boolean checkAnagram(String s1, String s2) {

        if (s1.length() != s2.length()) {
            return false;
        }

        int[] arr = new int[26];
        for (int i = 0; i < s1.length(); i++) {
            arr[s1.charAt(i) - 'a']++;
        }
        for (int i = 0; i < s2.length(); i++) {
            arr[s2.charAt(i) - 'a']--;
            if (arr[s2.charAt(i) - 'a'] < 0) {
                return false;
            }
        }
        return true;
    }
}
