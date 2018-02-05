package basic_1402;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
/**
 * Stack과 Queue
 * @author SangJun
 *
 */
public class StackQueueTest {
	public static void main(String[] args) {
		Stack<String> st = new Stack<String>();
		
		st.push("0");
		st.push("1");
		st.push("2");
		
		System.out.println("============= stack ==============");
		while(!st.empty()){
			System.out.println(st.pop());
		}
		
		Queue<String> que = new LinkedList<String>();
		que.offer("0");
		que.offer("1");
		que.offer("2");
		System.out.println("============= queue ==============");
		do{
			System.out.println(que.poll());
		}while(!que.isEmpty());
	}
}
