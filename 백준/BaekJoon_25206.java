import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//너의 평점은
public class BaekJoon_25206 {
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        double sum = 0;
        double score = 0;
        String blank;
        
        for (int i = 0; i < 20; i++) {
            String str = br.readLine();
            StringTokenizer st = new StringTokenizer(str);
            blank = st.nextToken();
            score = Double.parseDouble(st.nextToken());
            String PorF = st.nextToken();
            System.out.println(PorF);
            if(PorF.equals("P") || PorF.equals("F") ){
                sum+=0;
            }else{
                sum+=score;
            }
        }
        System.out.println(sum/20);
    }
}
