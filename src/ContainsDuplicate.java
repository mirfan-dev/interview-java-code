import java.util.HashSet;
import java.util.Scanner;

public class ContainsDuplicate {

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the size of an array");
        int n=sc.nextInt();
        int arr[]=new int[n];
        for (int i=0;i<arr.length;i++){
            System.out.println("Enter the element no " +(i+1));
            arr[i]=sc.nextInt();
        }
        if(checkDuplicate(arr)){
            System.out.println("The array contains duplicate elements.");
        }else{
            System.out.println("The array does not contains duplicate elements.");
        }
    }

//    public static boolean checkDuplicate(int[] nums){
//
//        for(int i=0;i<nums.length;i++){
//            for(int j=i+1;j<nums.length-1;j++){
//                if(nums[i]==nums[j]){
//                    return true;
//                }
//            }
//        }
//        return false;
//    }

    public static boolean checkDuplicate(int[] nums){
        HashSet<Integer> numbers=new HashSet<>();
        for(int i=0;i<nums.length;i++) {
            if (numbers.contains(nums[i])) {
                return true;

            }
            numbers.add(nums[i]);
            }
        return false;
        }
}
