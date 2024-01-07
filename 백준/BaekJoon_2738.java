import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.StringTokenizer;
import java.io.IOException;

public class BaekJoon_2738 {
    
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int first = Integer.parseInt(st.nextToken()); 
        int second = Integer.parseInt(st.nextToken()); 

        int[][] array = new int[first][second];
        int[][] array1 = new int[first][second];

        for(int i=0; i<first; i++){
            st = new StringTokenizer(br.readLine());
            for(int j=0;j<second;j++){
                array[i][j] = Integer.parseInt(st.nextToken());
            }
        }        

        for(int i=0; i<first; i++){
            st = new StringTokenizer(br.readLine());
            for(int j=0;j<second;j++){
                array1[i][j] = Integer.parseInt(st.nextToken());
            }
        }        

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < first; i++) {
            for (int j = 0; j < second; j++) {
                sb.append((array[i][j]+array1[i][j]) + " ");
            }
            sb.append("\n");
        }

        System.out.println(sb.toString());
        
    }
}
