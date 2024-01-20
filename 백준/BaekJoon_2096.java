import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BaekJoon_2096 {
    public static void main(String[] args) {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        int[] array = new int[3];
        char[] array_c = {'n','n','n'};
        int max = 0;
        int min = 100;

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < 3; j++) {
                array[j] = Integer.parseInt(st.nextToken());    
            }
            if (max < array[0]) {
                max = array[0];
            } else if (max < array[1]){
                max = array[1];
            } else if (max < array[2]){
                max = array[2];
            }

            if (min > array[0]) {
                min = array[0];
            } else if (min > array[1]){
                min = array[1];
            } else if (min > array[2]){
                min = array[2];
            }
        }

    }
}
