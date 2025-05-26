package PatternProgram;

import java.util.Scanner;

/*
            *
          *    *
         *       *
        *          *
       *             *
 */

public class Pattern7 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int n=sc.nextInt();
        int px=n;
        int py=n;
        for(int i=1;i<=n;i++){
            for(int j=1;j<2*n;j++){
                if(j==px || j==py){
                    System.out.print(j+" ");
                }else {
                    System.out.print("  ");
                }
            }
            px--;
            py++;
            System.out.println();
        }
    }
}
