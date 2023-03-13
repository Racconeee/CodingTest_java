import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class 10818 {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		StringTokenizer st;

		int count = Integer.parseInt(br.readLine());
		int min = 100000;
		int max = -1000001;
		st = new StringTokenizer(br.readLine(), " ");
		for (int i = 0; i < count; i++) {
			int number = Integer.parseInt(st.nextToken());
			if (min > number) {
				min = number;
			}
			if (max < number) {
				max = number;
			}
		}

		System.out.println(min + " 123123123 " + max);

	}
}