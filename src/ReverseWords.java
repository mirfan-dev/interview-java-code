
/*
        input: The sky is blue
        output: blue is sky the
 */

public class ReverseWords {
    public static void main(String[] args) {

        String s="The sky is blue";
        System.out.println("The reverse word is : "+reverseWord(s));

    }
    public static String reverseWord(String s){

        String[] words=s.split(" ");
        StringBuilder res=new StringBuilder();
        for(int i=words.length-1;i>=0;i--){
            res.append(words[i]);
            res.append(" ");
        }
        return res.toString().trim();
    }
}
