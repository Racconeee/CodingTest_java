import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();
        int count = Integer.parseInt(br.readLine());
        String[] s = new String[count];
        for (int i = 0; i < count; i++) {
            s[i] = br.readLine();
            sb.append(s[i].charAt(0));
            sb.append(s[i].charAt(s[i].length() - 1));
            sb.append("\n");
        }

        System.out.println(sb.toString());
    }
}