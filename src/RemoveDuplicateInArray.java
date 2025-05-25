public class RemoveDuplicateInArray {

    public static void main(String[] args) {

        int arr[]=new int[]{1,2,2,3,4};
        int index=removeDuplicate(arr);

        System.out.print("Array after removing duplicates: ");
        for (int i = 0; i < index; i++) {
            System.out.print(arr[i] + " ");
        }

    }

    public static int removeDuplicate(int[] nums){

        if(nums.length <=1)
            return nums.length;
        int index=1;

        for (int i=1;i<nums.length;i++){
            if(nums[index-1] != nums[i]){
                nums[index]=nums[i];
                index++;
            }
        }
        return index;
    }
}
