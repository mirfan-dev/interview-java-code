import java.util.Scanner;

public class PrimeNumber {

//    public static void main(String[] args) {
//
//        Scanner sc=new Scanner(System.in);
//        System.out.println("Enter a number");
//        int n=sc.nextInt();
//        if(checkPrime(n)){
//            System.out.println(n+" is a prime number");
//        }else {
//            System.out.println(n+" n is not a prime number");
//        }
//
//    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int count = 0;
        int n = sc.nextInt();
        for (int i = 2; i <= n; i++) {
            if (checkPrime(i)) {
                System.out.print(i + " ");
                count++;
            }

        }
        System.out.println("\n The total no. of prime no. is : " + count);
    }


    public static boolean checkPrime(int n) {
        if (n <= 1)
            return false;
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}

