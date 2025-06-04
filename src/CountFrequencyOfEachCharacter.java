import java.util.HashMap;

/*
        input: hello world
        output: { =1, r=1, d=1, e=1, w=1, h=1, l=3, o=2}
 */

public class CountFrequencyOfEachCharacter {

    public static void main(String[] args) {
        String input = "hello world";
        String result = countFrequency(input);
        System.out.println(result);
    }

    public static String countFrequency(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        char[] chars = s.toCharArray();

        for (char ch : chars) {
            if (map.containsKey(ch)) {
                map.put(ch, map.get(ch) + 1);
            } else {
                map.put(ch, 1);
            }
        }

        return map.toString(); // returns something like: { =1, a=2, b=1}
    }
}
