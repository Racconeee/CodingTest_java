import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BaekJoon_2531 {
    public static void main(String[] args) throws IOException{
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int d = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());
        int[] sushi = new int[n];
        int[] eated = new int[d+1];

        
        //입력된 값을 배열에 저장
        for (int i = 0; i < n; i++) {
            sushi[i] = Integer.parseInt(br.readLine());
        }
        int count = 0;
        //최대값에 해당하는 배열 공간을 만들어서 초밥을 먹었을때 배열에 카운팅을 시작
        //동시에 몇 종류의 초밥을 먹었는지 count 에 저장
        for (int i = 0; i < k; i++) {
            if(eated[sushi[i]] == 0){
                count++;
            }
            eated[sushi[i]]++;
        }
        int maxLen = count;
        for (int i = 1; i < n; i++) {
            if(maxLen <= count) {
                if(eated[c] == 0){ // 쿠폰 받은 초밥이 0이라면 아직 쿠폰 초밥을 먹지 않은것
                    maxLen = count + 1;
                }
                else{
                    maxLen = count;
                }
            }

            //end 이동 
            int end = (i + k - 1) % n;
            if(eated[sushi[end]] == 0){ 
                //0이라는 것은 배열에 값은 종류의 값이 들어간적 이 없다는 뜻 즉 처음 먹는 초밥이라는 뜻
                count++;
            }
            eated[sushi[end]]++; //당연하게 배열의 값 증가
            
            //start 이동
            eated[sushi[i-1]]--;
            if(eated[sushi[i-1]] == 0){
                count--;
            }
        }
        System.out.println(maxLen);


    }
}
