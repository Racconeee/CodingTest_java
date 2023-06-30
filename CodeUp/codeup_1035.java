import java.util.Scanner;

public class codeup_1035 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.next();

        int n = Integer.parseInt(str,16);
        System.out.printf("%o",n);
    }
}
