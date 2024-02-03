package days_30;
import java.util.Scanner;
public class day_3 {
    public static void main(String[] args) {
        System.out.println("Enter the number");
        Scanner ab = new Scanner(System.in);
        int num = ab.nextInt();
        if(num%2==0)
            System.out.println(num+" "+"is Even");
        else
            System.out.println(num+" "+"is Odd");

    }
}
