import java.util.Arrays;

public class 괄호변환 {
	

    public String solution(String p) {
        String answer = "";
        int count = 0; 
        
        for(int i=0; i<p.length(); i++) {
        	if(p.charAt(i)=='(') {
        		count++; 
        	}
        }
        
        if(p.charAt(p.length()-1)=='(') {
        	 
        }else {        	
        	for(int i=0; i<p.length(); i++) {
        		
        	}
        }
        return answer;
    }


	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		괄호변환 s = new 괄호변환();
//		int[] a = {93,30,55};
//		int[] b = {1,30,5};
		String a = "(()())()";
		String b = ")(";
		String c = "()))((()";
		System.out.println(s.solution(a));

	}
}
