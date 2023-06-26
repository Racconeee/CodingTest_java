import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class codeup_1015 {
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();

        float n = Float.parseFloat(str);

        System.out.printf( "%.2f", n);
    }
}
