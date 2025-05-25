import java.util.Scanner;

public class LowerCase {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string");
        String s = sc.nextLine();
        String value= lowerCase(s);
        System.out.println(value);
    }

    public static String lowerCase(String s){
        char[] c = s.toCharArray();

        for(int i=0;i<c.length;i++){
            if(c[i]>=65 && c[i]<=90){
                c[i]= (char)(c[i]+32);
            }
        }
        return String.valueOf(c);
    }


}
