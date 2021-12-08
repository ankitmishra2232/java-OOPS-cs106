
import com.Ankit.cs106.ex12.MyQueue;

public class Main {

	public static void main(String[] args) {
	MyQueue que=new MyQueue();
		que.enqueue("A");
		que.dequeue();
		que.enqueue("boat");
		que.count();
		que.peek();
		que.enqueue("none");
		que.peek();
		System.out.println(que.getQueueList());
	}

}
