import java.util.ArrayDeque;
import java.util.Deque;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	
		Deque<String> stack = new ArrayDeque<>();
		
		stack.push("one");
		stack.push("Two");
		
		stack.push("Tree");
		stack.push("Fourth");
		
		int size = stack.size() -1;
		
		while(size >= 0) {
			System.out.println(stack.pop());
			size--;
		}
		
		

	}

}
