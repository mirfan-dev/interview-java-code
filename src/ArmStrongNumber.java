import java.util.Scanner;

public class ArmStrongNumber {

//    public static void main(String[] args) {
//
//        Scanner sc=new Scanner(System.in);
//        System.out.println("Enter a number");
//        int n=sc.nextInt();
//        if(checkArmStrong(n)){
//            System.out.print(n+" is a ArmStrong number");
//        }else{
//            System.out.println(n+" is not a ArmStrong Number");
//        }
//
//    }

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int n=sc.nextInt();
        int count=0;
        for(int i=1;i<=n;i++)
        if(checkArmStrong(i)){
            System.out.print(i+" ");
            count++;
        }
        System.out.println("\n The total ArmStrong no. are : "+count);
        }



    public static int countDigit(int n){
        int count =0;
        while(n>0){
            count=count+1;
            n=n/10;
        }
        return count;
    }
    public static int findPower(int base,int exponent){

        int pow=1;
        for (int i=1;i<=exponent;i++){
            pow=pow*base;
        }
        return pow;
    }

    public static boolean checkArmStrong(int n){
        int a=n;
        int sum=0;
        int count =countDigit(n);
        while (n>0){
            int rem=n%10;
            sum=sum+findPower(rem,count);
            n=n/10;
        }
        return a==sum;
    }
}
