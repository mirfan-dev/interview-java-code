
/*

        input : [1,2,4,5]
        output: 3
 */

public class FindMissingNumberInArray {

    public static void main(String[] args) {
        int [] a=new int[]{1,2,4,5};
        int sum1=0;
        for(int i=0;i<a.length;i++){
            sum1=sum1+a[i];
        }
        int sum2=0;
        for (int i=1;i<=5;i++){
            sum2=sum2+i;
        }
        System.out.println("The missing number is : "+(sum2-sum1));
    }
}
