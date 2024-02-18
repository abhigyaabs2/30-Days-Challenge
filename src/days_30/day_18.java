package days_30;

import java.util.HashMap;

public class day_18 {
    public static void main(String[] args) {
        int count1 =0;
        int count2 =0;
        String str = "I have Aibohphobia";
        System.out.println(str = str.toLowerCase());
        for(int i =0; i<str.length();i++){
            if(str.charAt(i)=='a'|| str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u'){
               count1++;
            }
            else if(str.charAt(i) >= 'a' && str.charAt(i)<='z'){
                count2++;
            }
        }
        System.out.println("Number of vowels: " + count1);
        System.out.println("Number of consonants: " + count2);

    }
}
