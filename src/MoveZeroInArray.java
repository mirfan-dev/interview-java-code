public class MoveZeroInArray {

    public static void main(String[] args) {

        int arr[]=new int[]{3,0,12,0,6,0};
        moveZero(arr);

        // Print the result
        System.out.print("Array after moving at end : ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

    public static void moveZero(int[] nums){

        int nonZeroIndex=0;

        for (int i=0;i<nums.length;i++){
            if(nums[i]!=0){
                nums[nonZeroIndex] = nums[i];
                nonZeroIndex++;
            }
        }
        for (int i=nonZeroIndex;i<nums.length;i++){
            nums[i]=0;

        }
    }
}
