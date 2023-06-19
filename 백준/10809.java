import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 10809{
	public static void main(String[] args) throws IOException {
        //throws을 선언함으로써 콘솔에서 입력을 읽는 문제,입출력 오류들에 대해서 처리할수있다. 
        //indexOf("문자,문자열") : 문자열 내에서 지정된 문자가 처음 나타나는 인덱스를 반환하고, 찾을수 없다면 -1을반환한다.
        //BufferedReader 을 통해서 문자열을 읽어온다.
        //System.in은 표준 입력 스트림을 나타내며 InputStreamReader는 바이트 기반 System.in을 문자 기반 Reader로 변환하는 데 사용한다.

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		
		
		for(int i = 'a'; i <= 'z'; i++) {		
			System.out.print(str.indexOf(i) + " ");
		}
	}
}