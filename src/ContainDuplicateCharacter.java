import java.util.HashSet;
import java.util.Scanner;

public class ContainDuplicateCharacter {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string");
        String s=sc.nextLine().toLowerCase();
        if(containDuplicate(s)){
            System.out.println("Duplicate character found");
        }else {
            System.out.println("Duplicate character not found");
        }

    }
    public  static boolean containDuplicate(String s){

        HashSet<Character> set=new HashSet<>();
        for(int i=0;i<s.length();i++){
            if(set.contains(s.charAt(i))){
                return true;
            }
            set.add(s.charAt(i));
        }
        return false;
    }
}
