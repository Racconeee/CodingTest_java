import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class BaekJoon_2563 {
    public static void main(String[] args) throws IOException {
    
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        int[][] num = new int[101][101];
        int first = 0;
        int second = 0;

        for (int i = 0; i < 100; i++) {
            for (int j = 0; j < 100; j++) {
                num[i][j] = 1;
            }
        }

        for (int i = 0; i < n; i++) {

            st = new StringTokenizer(br.readLine());
            
            first = Integer.parseInt(st.nextToken());
            second = Integer.parseInt(st.nextToken());
            for (int j = first; j < first+10; j++) {
                for (int j2 = second; j2 < second+10; j2++) {
                    num[j][j2] = 0;
                }
            }

        }

        int result = 0;
        for (int i = 0; i < 100; i++) {
            for (int j = 0; j < 100; j++) {
                if (num[i][j] == 0) {
                    result++;
                }
            }
        }
        System.out.println(result);
        
        


    }
}