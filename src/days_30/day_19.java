package days_30;

import java.util.HashMap;

public class day_19 {
    public static int nonRepeating(String str) {
        HashMap<Character,Integer> string = new HashMap<>();
        if (str == null || str.isEmpty()) {
            return -1;
        }
        for (char c : str.toCharArray()) {
            string.put(c, string.getOrDefault(c, 0) + 1);
        }
        for (int i = 0; i < str.length(); i++) {
            if (string.get(str.charAt(i)) == 1) {
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        String str = "aibohphobia";
        int index = nonRepeating(str);
        System.out.println(nonRepeating(str));
    }
}
