package PatternProgram;

import java.util.Scanner;

/*              A
              B C D
            E F G H I
          J K L M N O P
        Q R S T U V W X Y      */

public class Pattern6 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        char c = 'A';

        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print("  ");
            }
            for (int k=1;k<=2*i-1;k++){
                System.out.print(c+" ");
                c++;
            }
            System.out.println();
        }
    }

}
