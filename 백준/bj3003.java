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
        // br.close();

        
        // System.out.println(Arrays.toString(arr2));

        
        int i = 0;
        int n = 0;
        int count = 0;
        while(true){
            // System.out.println(arr[i] +","+ arr2[i]);
            n = arr2[i];
            if(arr[i] == arr2[i]){
                if(i == arr2.length-1){
                    break;
                }
                System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
                i++;
                System.out.println(count);
            }
            else if(arr[i] > arr2[i]){
                // arr2[i]++;
                n++;
                count++;
                
                System.out.println(count);
            }
            else if(arr[i] < arr2[i]){
                // arr2[i]--;
                n--;
                count--;
                System.out.println(count);
            }
            arr2[i] = n;
        }
    }
}
