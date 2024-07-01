import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class example {
    public static void main(String[] args){
        

        int[] arrays = {1,1,3,3,0,1,1};


        Queue<Integer> queue = new LinkedList<>();


        queue.add(arrays[0]);
        for (int i = 1; i < arrays.length; i++) {
            if (arrays[i-1] != arrays[i]) {
                queue.add(arrays[i]);
            }
            System.out.println(queue.peek());
        }
        
        int[] answer = new int[queue.size()];
        int index = 0;
        while (queue.size() >= 1) {
            answer[index++] = queue.poll();
        }
    }
}