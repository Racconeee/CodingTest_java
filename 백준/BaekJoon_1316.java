import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.Buffer;

public class BaekJoon_1316 {
    public static void main(String[] args) throws IOException{

        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        String[] str = new String[n];
        int count = n;
        
        for (int j = 0; j < n; j++) {
            str[j] = br.readLine();
            for (int i = 0; i < str[j].length(); i++) {

                System.out.println(str[j].charAt(i));
                if(str[j].indexOf(str[j].charAt(i)) != -1) {
                    n--;
                    System.out.println("zzzzz");
                }
            }
        }
        System.out.println(count);





    }
}
