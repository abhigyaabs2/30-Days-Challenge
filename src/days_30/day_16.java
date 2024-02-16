package days_30;

public class day_16 {
    public static void main (String[] args) {

            String str= "Foolish", gap="";
            char ch;

            System.out.println("Original word: " +str);
            for (int i=0; i<str.length(); i++)
            {
                ch= str.charAt(i);
                gap= ch + gap;
            }
            System.out.println("New Word: "+ gap);
        }
    }




