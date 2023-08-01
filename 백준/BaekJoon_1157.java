import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BaekJoon_1157 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] arr = new int[26];
        String str = br.readLine();

        for (int i = 0; i < str.length(); i++) {

            if (65 <= str.charAt(i) && 97 <= str.charAt(i)){
                arr[str.charAt(i) - 97]++;
            }
            else{
                arr[str.charAt(i) - 65]++;
            }

        }

        int max = -1;
        char answer = '?';

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max){
                max = arr[i];
                answer = (char)(i+65);
            }
            else if (arr[i] == max){
                answer = '?';
            }
        }
        System.out.print(answer);
    }    
    
}

