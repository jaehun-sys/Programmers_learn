import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;

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
		기능개발 s = new 기능개발();
		int[] a = {93,30,55};
		int[] b = {1,30,5};
		System.out.println(Arrays.toString(s.solution(a, b)));

	}

}
