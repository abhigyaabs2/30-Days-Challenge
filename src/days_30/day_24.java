package days_30;

public class day_24 {
    static boolean isPal(String str,
                                int start, int end)
        {
            if (start == end) {
                return true;
            }
            if ((str.charAt(start)) != (str.charAt(end))) {
                return false;
            }
            if (start < end + 1) {
                return isPal(str, start + 1, end - 1);
            }
            return true;
        }

        static boolean isPalindrome(String str)
        {
            int n = str.length();

            if (n == 0)
                return true;

            return isPal(str, 0, n - 1);
        }

        // Driver Code
        public static void main(String args[])
        {
            String str = "abbbbcbbbba";

            if (isPalindrome(str))
                System.out.println("Yes"+" "+str+" "+"is palindrome");
            else
                System.out.println("No"+" "+str+" "+"is not palindrome");
        }
    }




