import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class example {
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();
        int n = Integer.parseInt(br.readLine()); 
        int[] array = new int[n];
        int index = 1;
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < n; i++) {
            array[i] = Integer.parseInt(br.readLine()); 
        }

        for (int i = 0; i < array.length; i++) {
            if(array[i] >= index){
                while (array[i] > index) {
                    stack.push(index++);
                    sb.append("+\n");
                }
                stack.pop();
                sb.append("-\n");
            }else{
                int out = stack.pop();
                if(out > array[i]){
                    System.out.println("NO");
                    sb.append("-\n");
                }
            }
        }    
    }
}