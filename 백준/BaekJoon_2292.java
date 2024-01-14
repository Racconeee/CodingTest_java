import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BaekJoon_2292 {
    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int count = 1;
        
        for (int i = 0; ; i++) {
            count += 6 * i ;
            if(count >= n){
                System.out.println(i+1);
                break;
            }
        }
    }
}
