package days_30;

public class day_20 {
    public static void main(String[] args) {
        String str ="AiBoHpHoBiA";
        StringBuffer string = new StringBuffer(str);

        for(int i =0;i<str.length();i++){
            if(Character.isLowerCase(str.charAt(i))){
                string.setCharAt(i, Character.toUpperCase(str.charAt(i)));
            }
            else if(Character.isUpperCase(str.charAt(i))){
                string.setCharAt(i, Character.toLowerCase(str.charAt(i)));
            }
        }
        System.out.println("New string: "+string);
    }
}
