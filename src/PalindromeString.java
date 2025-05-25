import java.util.Scanner;

/*
     i/p : madam
     o/p : madam
 */

public class PalindromeString {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String ");
        String s=sc.nextLine().toLowerCase();

        if(palindrome(s)){
            System.out.println(s+ " is a palindrome");
        }else {
            System.out.println(s+" is not a palindrome");
        }

    }

    public static boolean palindrome(String s){

        StringBuilder sb=new StringBuilder();



        for(int i=0;i<s.length();i++) {
            if (s.charAt(i) >= 97 && s.charAt(i) <= 122 || s.charAt(i) >= 48 && s.charAt(i) <= 57) {
                sb.append(s.charAt(i));
            }
        }
            for(int i=0;i<sb.length()/2;i++){
                if(sb.charAt(i) != sb.charAt(sb.length()-1-i)){
                    return false;
                }
            }
        return true;
    }
}
