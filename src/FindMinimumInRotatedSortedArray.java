import java.util.Scanner;

public class FindMinimumInRotatedSortedArray {

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

        System.out.println("Enter the size of an array");
        int n = sc.nextInt();
        int arr[]= new int[n];
        for (int i=0;i<arr.length;i++){
            System.out.println("Enter the element no " +(i+1));
            arr[i]=sc.nextInt();
        }
        int value = findMin(arr);
        System.out.println(value +" is a min element");
    }
    public static int findMin(int[] nums){
        int low=0;
        int high= nums.length-1;

        while (low < high){
            int mid = low+ (high-low)/2;
            if(nums[mid] > nums[high]){
                low= mid+1;
            }else {
                high=mid;

            }

        }
        return nums[low];
    }
}
