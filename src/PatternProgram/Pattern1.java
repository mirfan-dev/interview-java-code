package PatternProgram;

import java.util.Scanner;

/*
   India
        India
             India
                  India
                       India  */

public class Pattern1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n=sc.nextInt();
        for(int i=0;i<5;i++){
            for(int j=0;j<=5*i;j++){
                System.out.print(" ");

            }
            System.out.println("India");
        }
    }
}
