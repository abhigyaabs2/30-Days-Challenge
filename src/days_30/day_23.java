package days_30;

import java.util.Scanner;

public class day_23{
    static int Sum(int n){
        int sum =0;
        if(n == 0)
            return 0;
        else
            return (n%10 + Sum(n/10));
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int result = Sum(num);
        System.out.println("Sum of digits in " + num + " is " + result);
    }
}
