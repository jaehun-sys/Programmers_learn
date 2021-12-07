public class 타겟넘버 {

	public int solution(int[] numbers, int target) {
        int answer = 0;

        answer = dfs(numbers, target, 0,0);
        
        return answer;
    }
    
    public int dfs(int[] numbers, int target, int sum, int idx){
        if(idx == numbers.length){
            if(sum == target){
                return 1;
            }
            else
                return 0;
        }
        else{
            return dfs(numbers, target, sum+numbers[idx], idx+1)
                + dfs(numbers, target, sum-numbers[idx], idx+1);
        }
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Queue<Integer> queue = new LinkedList<>();

		
//		Stack<Integer> stack = new Stack<>();
//		stack.push(4);
//		stack.push(3);
//		stack.push(2);
//		stack.push(5);
//		System.out.println(stack);
//		stack.pop();
//		System.out.println(stack);

	}

}