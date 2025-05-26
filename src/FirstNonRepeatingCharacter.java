import java.util.Scanner;

/*
            input : "leetcode"
            output: 0
 */

public class FirstNonRepeatingCharacter {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string");
        String s=sc.nextLine();
        int index = findFirstNonRepeatingChar(s);
        if (index != -1) {
            System.out.println("The first non-repeating character is '" + s.charAt(index) + "' at index: " + index);
        } else {
            System.out.println("The first non-repeating character is not found");
        }

    }
    public static int findFirstNonRepeatingChar(String s){

        int []arr=new int[26];
        for (int i=0;i<s.length();i++){
            arr[s.charAt(i)-'a']++;
        }
        for (int i=0;i<s.length();i++){
            if(arr[s.charAt(i)-'a']==1){
                return i;
            }
        }
        return -1;
    }
}
