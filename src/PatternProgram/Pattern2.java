package PatternProgram;

import java.util.Scanner;

   /*             1
                1 2
              1 2 3
            1 2 3 4
          1 2 3 4 5   */

public class Pattern2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            // Print spaces to right-align the triangle
            for (int j = 1; j <= n - i; j++) {
                System.out.print("  ");
            }

            // Print numbers from 1 to i
            for (int k = 1; k <= i; k++) {
                System.out.print(k +" ");
            }

            System.out.println();
        }

        sc.close();
    }
}
