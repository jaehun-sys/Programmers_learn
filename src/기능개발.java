import java.util.Stack;
import java.util.ArrayList;

public class 기능개발 {
	
	public int[] solution(int[] progresses, int[] speeds) {
		Stack<Integer> stack = new Stack<>();
		for (int i = progresses.length - 1; i >= 0; i--)
			stack.add((100 - progresses[i]) / speeds[i] + ((100 - progresses[i]) % speeds[i] > 0 ? 1 : 0));

		ArrayList<Integer> s = new ArrayList<Integer>();

		while (!stack.isEmpty()) {
			int cnt = 1;

			int top = stack.pop();

			while (!stack.isEmpty() && stack.peek() <= top) {
				cnt++;
				stack.pop();
			}

			s.add(cnt);
		}

		int[] answer = new int[s.size()];

		for (int i = 0; i < answer.length; i++) {
			answer[i] = s.get(i);
		}

		return answer;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

	}

}
