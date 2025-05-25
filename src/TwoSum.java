import java.util.HashMap;

/*
    input : nums:[2,7,11,15], target =9
    ouput : [0,1]
 */

public class TwoSum {

    public static void main(String []args){

        int []arr=new int[]{2,7,11,15};
        int target=9;
        int value[] =twoSum(arr,target);

        for (int index:value){
            System.out.print(index+" ");
        }


    }

    public static int[] twoSum(int[] nums, int target){

        HashMap<Integer,Integer> map=new HashMap<>();

        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i])){
                return new int[]{map.get(nums[i]),i};
            }else{
                map.put(target-nums[i],i);
            }
        }

        return new int[]{};
    }
}
