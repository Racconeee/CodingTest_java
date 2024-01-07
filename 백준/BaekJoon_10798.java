import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BaekJoon_10798 {
    public static void main(String[] args) throws IOException{
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        
        char[][] str = new char[5][15];

        int max = -1;
        for (int i = 0; i < str.length; i++) {
            String munja = br.readLine();
            if( max < munja.length()){
                max = munja.length();
            }

            for (int j = 0; j < munja.length(); j++) {
                str[i][j] = munja.charAt(j);
            }
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < max; i++) {

            for (int j = 0; j < 5; j++) {
                if(str[j][i] != '\0'){
                    sb.append(str[j][i]);
                }    
            }
        }

        System.out.println(sb);

        
    }    
}
