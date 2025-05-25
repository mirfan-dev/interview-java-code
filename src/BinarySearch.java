import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {



        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the size of an array");
            int n = sc.nextInt();
            int arr[]= new int[n];
            for (int i=0;i<arr.length;i++){
                System.out.println("Enter the element no:  " +(i+1));
                arr[i]=sc.nextInt();
            }
            Arrays.sort(arr); // Sort the array
            System.out.println("Sorted array: " + Arrays.toString(arr)); // Correct way to print array

            System.out.println("Enter the target element:");
            int target = sc.nextInt();

            int value = search(arr, target);

            if (value != -1) {
                System.out.println("Element is found at index: " + value);
            } else {
                System.out.println("Element not found in the array.");
            }

        }

        public static int search(int[] a, int target){

            int low=0;
            int high= a.length-1;

            while (low < high){
                int mid = low +(high-low)/2;
                if (a[mid] < target){
                    low= mid+1;

                }else {
                    high=mid;
                }
            }
            return a[low]==target ? low : -1;
        }
    }


