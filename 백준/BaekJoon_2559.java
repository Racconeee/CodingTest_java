import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BaekJoon_2559 {
    public static void main(String[] args) throws IOException{
        
        //슬라이딩 알고리즘 사용 

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());        //??일간의 온도
        int sum_N = Integer.parseInt(st.nextToken());      //며칠을 더할건지 의 값
        int[] array = new int[N];                       //??일간의 온도 담을 배열
        int[] sum_array = new int[N - sum_N + 1];
        int max = 0; 

        st = new StringTokenizer(br.readLine());

        for (int i = 0; i < N; i++) {
            array[i] = Integer.parseInt(st.nextToken());
        }

        //처음 배열만 합하기            
        for (int i = 0; i < sum_N; i++) {
            sum_array[0] += array[i];
        }
        max = sum_array[0];

        //처음 배열의 값을 다음 값에 넣어주고 배열을 이동하면서 앞에있는 값 제거 , 이후 값 삽입해서 더해준다
        for (int i = 1; i < sum_array.length; i++) {
            sum_array[i] = sum_array[i-1];
            sum_array[i] -= array[i-1];
            sum_array[i] += array[i+sum_N-1];
            if(max < sum_array[i]) max = sum_array[i];
            
        }

        System.out.println(max);


    }
}
