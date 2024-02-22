package days_30;

import java.util.Scanner;

public class day_22 {
    static int n1=0,n2=1,n3=0;
    public static void Fibonacci(int count){
        if(count>0){
            n3 = n1 + n2;
            n1 = n2;
            n2 = n3;
            System.out.print(" "+n3);
            Fibonacci(count-1);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.print(n1+" "+n2);
        Fibonacci(n-2);
    }
}
