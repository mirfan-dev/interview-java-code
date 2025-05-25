import java.util.Scanner;

public class ExcelSheetColumn {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string");
        String s = sc.nextLine().toUpperCase();  //optional: convert to uppercase for safety

        int columnNumber = columnTitle(s);
        System.out.println("Column number is: " + columnNumber);

    }

    public static int columnTitle(String column){

        char[] c=column.toCharArray();
        int result = 0;

        for (int i=0;i<c.length;i++){
            int num = c[i] - 65 + 1;
            result = result  * 26 + num;
        }
        return result;
    }
}
