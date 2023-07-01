import java.util.Scanner;

public class codeup_1045 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int first = sc.nextInt();
        int second = sc.nextInt();

        System.out.println(first+second);
        System.out.println(first-second);
        System.out.println(first*second);
        System.out.println(first/second);
        System.out.println(first%second);
        double third = (double)first / second;
        System.out.printf("%.2f",third);

    }
}
