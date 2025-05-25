package PatternProgram;

import java.util.Scanner;

  /*        1
          1 2 3
        1 2 3 4 5
      1 2 3 4 5 6 7
    1 2 3 4 5 6 7 8 9  */

public class Pattern4 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            for(int j=1;j<=n-i;j++){
                System.out.print("  ");
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
