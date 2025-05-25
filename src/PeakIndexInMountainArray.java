import java.util.Scanner;

public class PeakIndexInMountainArray {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array");
        int n = sc.nextInt();
        int arr[]= new int[n];
        for (int i=0;i<arr.length;i++){
            System.out.println("Enter the element no:  " +(i+1));
            arr[i]=sc.nextInt();
        }
        int value = peakIndex(arr);
        System.out.println(value +" is a peak index");

    }

    public static int peakIndex(int[] a){

        int low=0;
        int high= a.length-1;

        while (low < high){
            int mid = low +(high-low)/2;
            if (a[mid] < a[mid+1]){
                low= mid+1;

            }else {
                high=mid;
            }
        }
        return low;
    }
}
