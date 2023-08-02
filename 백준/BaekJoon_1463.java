

import java.util.Scanner;

public class BaekJoon_1463 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int n =0;

        for ( ; ;) {
            if(num == 1){
                break;
            }

            if(num % 3 == 0){
                num /= 3;
                n++;
            }else if(num % 2 == 0){
                num /= 2;
                n++;
            }else{
                num--;
            }
            
        }

        System.out.println(n);

        
    }    
}
