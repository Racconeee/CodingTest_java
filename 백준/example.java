import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Stack;

public class example {
    public static void main(String[] args){

        int[] priorities = {2,1,3,2};
        int location = 2;
        int answer = 0;
        PriorityQueue<Integer> queue = new PriorityQueue<>(Collections.reverseOrder());

        for (int n : priorities) {
            queue.offer(n);
        }
        while (!queue.isEmpty()) {
            for (int i = 0; i < priorities.length; i++) {
                if(queue.peek() == priorities[i]){
                    queue.poll();
                    answer++;
                    if(i == location){
                        // return answer;
                        System.out.println(answer);
                    }
                }
            }
        }
        System.out.println(answer);
        // return answer;
    }
}