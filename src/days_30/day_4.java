package days_30;

public class day_4 {
    static int factorial(int n){
        if(n==0)
            return 1;
        else
            return (n)*(factorial(n-1));
    }

    public static void main(String[] args) {
        int n;
        int fact;
        fact = factorial(5);
        System.out.println(fact);
    }

}


