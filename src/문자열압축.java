
public class 문자열압축 {
	
	public int solution(String s) {
        int answer = 0;
        
        for(int i=1; i<s.length()/2; i++) {
        	String unit = s.substring(0,i);
        	int count = 1;
        	if(unit.equals(s.substring(i+1, 2*i+1))) {
        		System.out.println(i + "번째 규칙 하나 찾음");
        		count++;
        	}
        	
        }
        return answer;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "abcabcabcabcdedededede";
		String s2 = "aabbaccc";
		
		문자열압축 c = new 문자열압축();
		System.out.println(c.solution(s1));
		System.out.println(c.solution(s2));
	}

}
