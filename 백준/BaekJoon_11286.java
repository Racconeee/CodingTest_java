import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

public class BaekJoon_11286 {
    static int i = 0;
    public static void main(String[] args) throws IOException{
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int n = Integer.parseInt(br.readLine());
        PriorityQueue<Integer> queue = new PriorityQueue<>((o1,o2) -> {
            
            int frist_abs = Math.abs(o1);
            int second_abs = Math.abs(o2);
            if(frist_abs == second_abs){
                return frist_abs > second_abs ? 1 : -1;
            }
            return  frist_abs - second_abs;
        });

        queue.add(6);
        queue.add(2);
        queue.add(10);
        queue.add(1);

        System.out.println(queue);
        System.out.println(queue.poll());
        System.out.println(queue);

    }
}
