import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class 1546 {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer st;

		int count = Integer.parseInt(br.readLine());
		int[] array = new int[count];
		st = new StringTokenizer(br.readLine(), " ");
		for (int i = 0; i < count; i++) {
			array[i] = Integer.parseInt(st.nextToken());
		}
		Arrays.sort(array);
		float high = array[count - 1];
		float avg = 0;
		for (int i = 0; i < count; i++) {
			avg = avg + (array[i] / high * 100);
		}
		System.out.println(Math.round(avg / count * 100) * 0.01);
	}
}