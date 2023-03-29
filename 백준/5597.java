import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 5597 {
public static void main(String[] args) throws IOException {

BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
int[] array = new int[31];

for (int i = 1; i <= 30; i++) {
array[i] = 1;
}

for (int i = 1; i <= 28; i++) {
int number = Integer.parseInt(br.readLine());
array[number] = 0;
}

for (int i = 1; i <= 30; i++) {
if (array[i] == 1) {
System.out.println(i);
}
}

}
}
