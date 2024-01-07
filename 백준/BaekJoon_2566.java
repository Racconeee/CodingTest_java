import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BaekJoon_2566 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int max = -1;
        int max_i = 0;
        int max_j = 0;
        int[][] array = new int[10][10];


        for (int i = 0; i < 9; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < 9; j++) {
                array[i][j] = Integer.parseInt(st.nextToken());
                if(max < array[i][j]){
                    max = array[i][j];
                    max_i = i+1;
                    max_j = j+1;
                }
            }
        }
        System.out.println(max);
        System.out.println(max_i + " " + max_j);


    }
}
