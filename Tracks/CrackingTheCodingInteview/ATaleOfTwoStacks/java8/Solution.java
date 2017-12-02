import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
	public static void main(String[] args) {
		MyQueue<Integer> queue = new MyQueue<Integer>();
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();

		for (int i = 0; i < n; i++) {
			int operation = scan.nextInt();
			if (operation == 1) { // enqueue
				queue.enqueue(scan.nextInt());
			} else if (operation == 2) { // dequeue
				queue.dequeue();
			} else if (operation == 3) { // print/peek
				System.out.println(queue.peek());
			}
		}
		scan.close();
	}

	private static class MyQueue<T> {
		private Stack<T> popQueue = new Stack();
		private Stack<T> pushQueue = new Stack();

		public void enqueue(T item) {
			pushQueue.push(item);
		}

		public T dequeue() {
			sync();
			return popQueue.pop();
		}

		public T peek() {
			sync();
			return popQueue.peek();
		}

		private void sync() {
			if (popQueue.empty()) {
				while(!pushQueue.empty()) popQueue.push(pushQueue.pop());
			}
		}
	}
}
