import java.util.Scanner;

/*
      input : arman
      output: aamnr
 */

public class BubbleSortForString {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a word");
        String s=sc.nextLine().toLowerCase();
        String value=sort(s);
        System.out.println("After sorting the word : "+value);

    }
    public static String sort(String s){

        char[] ch =s.toCharArray();

        for(int i=0;i<ch.length;i++){
            int flag=0;

            for (int j=0;j<ch.length-1-i;j++){
                if(ch[j]>ch[j+1]){
                    char temp=ch[j];
                    ch[j]=ch[j+1];
                    ch[j+1]=temp;
                    flag=1;
                }

            }
            if(flag==0)
                break;
        }
        return new String(ch);
    }
}
