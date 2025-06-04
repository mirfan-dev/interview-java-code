package LamdaExpression;

import java.util.Scanner;




public class AddTwoNumber {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.println("Enter first number:");
            int a = sc.nextInt();

            System.out.println("Enter second number:");
            int b = sc.nextInt();

            // Step 2: Lambda Expression
            Add add = (x, y) -> {
                System.out.println("Addition of two is: " + (x + y));
            };
            add.sum(a,b);
    }
}
