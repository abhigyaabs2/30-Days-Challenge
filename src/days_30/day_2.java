package days_30;

import java.util.Scanner;

public class day_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Name:");
        String Name = sc.nextLine();
        System.out.print("Age:");
        int age = sc.nextInt();
        System.out.println("Hello!"+" "+Name+" "+"your age is:" +age);
    }
}
