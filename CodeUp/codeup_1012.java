import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class codeup_1012{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        double n = Double.parseDouble(str);
        System.out.printf("%D",n);
    }
}