import java.util.Scanner;

public class BaekJoon_10988 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        boolean bol = false;
        for (int i = 0; i < str.length()/2; i++) {
            System.out.println(str.charAt(i));
            if(str.charAt(i) == str.charAt(str.length()-i-1)){
                bol = true;
            }
            else{
                System.out.println(0);
                break;
            }
        }
        if(bol == true){
            System.out.println(1);

        }
    }

}
