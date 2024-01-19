import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BaekJoon_12891 {

    static int[] Check_Arr;
    static int[] myArr;
    static int checkSecret;

    public static void main(String[] args) throws IOException{
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int S = Integer.parseInt(st.nextToken());
        int P = Integer.parseInt(st.nextToken());
        char[] A = new char[S];
        int result = 0;

        Check_Arr = new int[4];
        myArr = new int[4];
        checkSecret =0;
        

        A = br.readLine().toCharArray();            //DNA 문자열 받기
        st = new StringTokenizer(br.readLine());    //부분 문자열에 포함돼야 할 최소 개수 Ex) 2 0 1 1
        for (int i = 0; i < 4; i++) {
            Check_Arr[i] = Integer.parseInt(st.nextToken());
            if(Check_Arr[i] == 0){
                checkSecret++;                           //0으로 들어오면 result값 그냥 올려주기 
            } 
        }

        for (int i = 0; i < P; i++) {
            Add(A[i]);
        }
        //슬라이딩 구현
        if(checkSecret == 4) result++;

        for (int i = P; i < S; i++) {
            int j = i - P;
            Add(A[i]);
            remove(A[j]);
            if(checkSecret == 4) result++;
        }
        System.out.println(result);
    }
    private static void Add(char c){
        switch (c) {
            case 'A' : 
                myArr[0]++;
                if(myArr[0] == Check_Arr[0]) checkSecret++;
                break;
            case 'C' : 
                myArr[1]++;
                if(myArr[1] == Check_Arr[1]) checkSecret++;
                break;
            case 'G' : 
                myArr[2]++;
                if(myArr[2] == Check_Arr[2]) checkSecret++;
                break;
            case 'T' : 
                myArr[3]++;
                if(myArr[3] == Check_Arr[3]) checkSecret++;
                break;
        }
    }
    private static void remove(char c){
        switch (c) {
            case 'A' : 
                if(myArr[0] == Check_Arr[0]) checkSecret--;
                myArr[0]--;
                break;
            case 'C' : 
                if(myArr[1] == Check_Arr[1]) checkSecret--;
                myArr[1]--;
                break;
            case 'G' : 
                if(myArr[2] == Check_Arr[2]) checkSecret--;
                myArr[2]--;
                break;
            case 'T' : 
                if(myArr[3] == Check_Arr[3]) checkSecret--;
                myArr[3]--;
                break;
        }
    }
}
