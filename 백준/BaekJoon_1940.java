import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BaekJoon_1940 {
    public static void main(String[] args) throws IOException {
    
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int N = Integer.parseInt(br.readLine());
        int M = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        int[] array = new int[N];

        for (int i = 0; i < N; i++) {
            array[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(array);

        int count = 0;
        int i = 0;
        int j = N-1;
        while (i < j) {
            System.out.println(i);
            System.out.println(j);
            System.out.println();
            if(array[i] + array[j] > M){
                j--;
            }
            else if(array[i] + array[j] < M){
                i++;
            }
            else if(array[i] + array[j] == M){
                count++;
                i++;
                j--;
            }
        }
        System.out.println(count);
    }
}
