import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class 27866 {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer st;

		String s = br.readLine();
		int number = Integer.parseInt(br.readLine());

		System.out.println(s.charAt(number - 1));

	}
}