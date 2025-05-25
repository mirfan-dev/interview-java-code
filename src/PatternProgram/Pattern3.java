package PatternProgram;

import java.util.Scanner;


  /*    5 4 3 2 1
          4 3 2 1
            3 2 1
              2 1
                1   */

public class Pattern3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <=i; j++) {
                System.out.print("  ");
            }


            for (int k = n-i+1; k >=1; k--) {
                System.out.print(k+" ");
            }

            System.out.println();
        }

        sc.close();
    }
}
