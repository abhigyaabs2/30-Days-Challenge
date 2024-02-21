package days_30;

public class day_21 {
    public static int factorial (int n){
        if(n==0)
            return 1;
        else
            return (n*factorial(n-1));
    }
    public static void main(String[] args) {
        int x = 5;
        System.out.println(factorial(x));

    }
}