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
        String[] st;
        
        for (int i = 0; i < n; i++) {
            str[i] = br.readLine();
        }
        for (int i = 0; i < str.length; i++) {
            if(str.contains(str[i]))
        }





        System.out.println(str);

    }
}
