import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class codeup_1023 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        String[] str = br.readLine().split("\\.");

        System.out.println(str[0]);
        System.out.println(str[1]);


    }
}
