import java.util.HashMap;
import java.util.Scanner;

public class CompressString {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a string"); // aabbccc
        String s=sc.nextLine();
        String value=compress(s);
        System.out.println("The compress value is : "+value);

    }

    public static String compress(String str){

        HashMap<Character,Integer> map = new HashMap<>();
        for (int i=0;i<str.length();i++){
            if(map.containsKey(str.charAt(i))){
                map.put(str.charAt(i),map.get(str.charAt(i))+1);
            }else {
                map.put(str. charAt(i),1);
            }

        }
        // Build result string from map
        StringBuilder sb = new StringBuilder();
        for (char key : map.keySet()) {
            sb.append(key).append(map.get(key));
        }

        return sb.toString();

    }
}
