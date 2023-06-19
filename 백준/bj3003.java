import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class bj3003 {
    public static void main(String[] args) throws IOException{
        int[] arr = {1,1,2,2,2,8};
        int[] arr2 = new int[6];

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        StringTokenizer st = new StringTokenizer(str," ");

        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = Integer.parseInt(st.nextToken());
        }
        int n =0;
        for( int i =0; i< arr2.length; i++){
            n = arr[i] - arr2[i];

            System.out.print(n + " ");
        }
    }
}
