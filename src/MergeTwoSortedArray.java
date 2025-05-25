import java.util.Arrays;

/*
   input :  int [] nums1=new int[]{1,2,3,0,0,0};
            int n=3;
            int [] nums2=new int[]{2,5,6};
            int m=3;

   output : [1, 2, 2, 3, 5, 6]

 */

public class MergeTwoSortedArray {

    public static void main(String[] args) {

        int [] nums1=new int[]{1,2,3,0,0,0};
        int n=3;
        int [] nums2=new int[]{2,5,6};
        int m=3;

        merge(nums1,n,nums2,m);
        System.out.println(Arrays.toString(nums1)); // Output: [1, 2, 2, 3, 5, 6]


    }

    public static void merge(int[] nums1 , int n, int[] nums2, int m){

        int p1=n-1;
        int p2=m-1;
        int p=m+n-1;

        while(p1>=0 && p2>=0){
            if(nums1[p1]>=nums2[p2]){
                nums1[p] =nums1[p1];
                        p1--;
            }else{
                nums1[p]=nums2[p2];
                p2--;
            }
            p--;
        }
        while(p2 >=0){
            nums1[p]=nums2[p2];
            p2--;
            p--;
        }
    }
}
