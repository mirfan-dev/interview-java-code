import java.util.Scanner;

public class BestTimeToBuyAndSell {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array:");
        int n = sc.nextInt();
        int arr[] = new int[n];

        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter the element no. " + (i + 1) );
            arr[i] = sc.nextInt();
        }

        int maxPro = maxProfit(arr);
        System.out.println("Maximum Profit: " + maxPro);

        sc.close(); // Always good to close scanner
    }

    public static int maxProfit(int[] price) {
        int minPrice = Integer.MAX_VALUE; // buying price
        int maxProfit = 0;

        for (int i = 0; i < price.length; i++) {
            if (price[i] < minPrice) {
                minPrice = price[i];
            } else if (price[i] - minPrice > maxProfit) {
                maxProfit = price[i] - minPrice;
            }
        }
        return maxProfit;
    }
}
