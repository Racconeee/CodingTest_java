import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class 2562 {
public static void main(String[] args) throws IOException {

BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

StringTokenizer st;
int[] array = new int[9];
int high = 0, level = 0;

for (int i = 0; i < 9; i++) {
int number = Integer.parseInt(br.readLine());
array[i] = number;
if (number > high) {
high = number;
level = i + 1;
}

}

System.out.println(high);
System.out.println(level);
}
}
