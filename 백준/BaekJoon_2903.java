import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


//규칙성이 중요했던 문제엿다 
//규칙을 알고나니 생각보다 안어려운 문제

public class BaekJoon_2903 {
    public static void main(String[] args) throws IOException{
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        
        System.out.println((int)Math.pow(Math.pow(2, n)+1, 2));

    }
}
