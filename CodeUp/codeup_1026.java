import java.util.Scanner;

public class codeup_1026 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        String[] str = sc.nextLine().split("\\:");

        System.out.println(Integer.parseInt(str[1]));
    }
}
