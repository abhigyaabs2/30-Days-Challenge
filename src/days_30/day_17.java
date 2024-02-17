package days_30;
import java.util.HashMap;
public class day_17 {
    public static char[] RemoveDuplicate(char [] str, int n){
        HashMap<Character,Integer> string = new HashMap<>();
        String gap = "";
        for(int i=0; i<n ; i++){
            if(!string.containsKey(str[i])){
               gap += str[i];
               string.put(str[i], 1);
            }
        }
        return gap.toCharArray();
    }

    public static void main(String[] args) {
        char [] word = "aibohphobia".toCharArray();
        int n = word.length;
        System.out.print(RemoveDuplicate(word,n));
    }
}
