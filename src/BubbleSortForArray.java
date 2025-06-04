
/*
            input: [5,3,8,4,2]
            output:[2,3,4,5,8]
 */


public class BubbleSortForArray {

    public static void main(String[] args) {

        int[] nums = {5, 3, 8, 4, 2};

        int[] sorted = sort(nums);

        // Print sorted array
        for (int num : sorted) {
            System.out.print(num + " ");
        }
    }
    public static int[] sort(int[] nums){

        for(int i=0;i<nums.length;i++){
            int flag=0;
            for(int j=0;j<nums.length-1-i;j++){
                if(nums[j]>nums[j+1]){
                    int temp=nums[j];
                    nums[j]=nums[j+1];
                    nums[j+1]=temp;
                    flag=1;
                }
            }
            if(flag==0)
                break;
        }
        return nums;
    }
}
