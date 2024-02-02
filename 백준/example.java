import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Stack;

public class example {
    public static void main(String[] args){

        int[] prices = {1,2,3,2,3};

        Stack<Integer> stack = new Stack<>();
        

        for (int i = 0; i < prices.length-2; i++) {
            int count = 0;
            System.out.println(c);
            while (true) {
                if(prices[i+count] < prices[i+count+1]){
                    count++;
                }else{
                    count++;
                    stack.push(count);
                    System.out.println(count);
                    break;
                }
            }
        }
        System.out.println(stack);
    }
}