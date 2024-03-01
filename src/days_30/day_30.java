package days_30;

import java.util.Scanner;

public class day_30 {
    public static void main(String[] args) {
        System.out.print("Name:");
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        System.out.println("Feedback:");
        String feedback = sc.next();
        feedback += sc.nextLine();
        System.out.println("Dear"+" "+name);
        System.out.println("Thank you for sharing your feedback. We're delighted to hear about your positive " +
                "experience and the valuable lessons you've gained during the 30 Days of Code challenge."+
        "Your dedication and enthusiasm have been inspiring. Farewell and best wishes for your future coding endeavours.");

    }
}
