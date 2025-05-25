import java.util.Scanner;

public class Power {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int n = sc.nextInt();

        for (int i = 2; i <= n; i++) {
            if (isPowerOfTwo(i)) {
                System.out.println(i + " is a power of 2");
            }
        }

        sc.close(); // Good practice
    }



//public class Power {
//
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the number:");
//        int n = sc.nextInt();
//
//
//            if (isPowerOfTwo(n)) {
//                System.out.println(n + " is a power of 2");
//            }else {
//                System.out.println(n + " is a power of 2");
//            }
//
//    }

    public static boolean isPowerOfTwo(int n) {
        int i = 1;
        while (i < n) {
            i = i * 2;
        }
        return i == n;
    }
}
