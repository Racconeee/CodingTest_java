import java.io.IOException;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class example {
    public static void main(String[] args) throws IOException {
        
        int[] n = {1,1,3,3,0,1,1};

        System.out.println(Arrays.toString(n));
        Queue<Integer> queue = new LinkedList<>();
        queue.add(n[0]);
        for (int i = 1; i < n.length; i++) {
            if(n[i-1] != n[i]){
                queue.add(n[i]);
            }
        }
        System.out.println();
        System.out.println(queue);
        int[] answer = new int[queue.size()];
        int index = 0;
        while (queue.size() >= 1) {
            System.out.println("1");
            answer[index++] = queue.poll();
        }

        System.out.println(Arrays.toString(answer));
    }
}