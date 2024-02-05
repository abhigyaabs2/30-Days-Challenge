package days_30;

public class day_5 {
    public static void main(String[] args) {
        int n1=0,n2=1,n3;
        System.out.println("Enter the number of elements:");
        System.out.print(n1+"\t"+n2+"\t");
        for(int i=2;i<10;++i) {
            n3=n1+n2;
            System.out.print(n3+"\t");
            n1=n2;
            n2=n3;
        }
    }
}
