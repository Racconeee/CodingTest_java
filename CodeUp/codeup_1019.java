import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class codeup_1019 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] str = br.readLine().split("\\.");

        int year = Integer.parseInt(str[0]);
        int month = Integer.parseInt(str[1]);
        int day = Integer.parseInt(str[2]);

        System.out.println(String.format("%04d", year)+ "." + String.format("%02d" , month) + "." + String.format("%02d", day) );

    }
}
