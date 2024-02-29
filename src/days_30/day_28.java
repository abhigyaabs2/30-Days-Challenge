package days_30;

public class day_28 {
    int value(char r)
    {
        if (r == 'I')
            return 1;
        if (r == 'V')
            return 5;
        if (r == 'X')
            return 10;
        if (r == 'L')
            return 50;
        if (r == 'C')
            return 100;
        if (r == 'D')
            return 500;
        if (r == 'M')
            return 1000;
        return -1;
    }
    int roman(String str)
    {
        int result = 0;
        for (int i = 0; i < str.length(); i++) {
            int ans1 = value(str.charAt(i));
            if (i + 1 < str.length()) {
                int ans2 = value(str.charAt(i + 1));
                if (ans1 >= ans2) {
                    result = result + ans1;
                }
                else {
                    result = result + ans2 - ans1;
                    i++;
                }
            }
            else {
                result = result + ans1;
            }
        }
        return result;
    }
    public static void main(String args[])
    {
        day_28 ob = new day_28();
        String str = "MMIV";
        System.out.println("Integer form of Roman Numeral" + " is " + ob.roman(str));
    }
}
