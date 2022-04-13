import java.util.Random;

public class 괄호변환 {
    public String solution(String p) {
        String answer = "";
        //int count = 0;       
        return answer;
    }
	
	public static void main(String[] args) { 
		괄호변환 s = new 괄호변환();
//		int[] a = {93,30,55};
//		int[] b = {1,30,5};
		
		String a = "(()())()";
		String b = ")(";
		String c = "()))((()";
		
		System.out.println(s.solution(a));
		
		Random random = new Random();
		int leftLimit = 97; // numeral '0'
	    int rightLimit = 122; // letter 'z'
	    int targetStringLength = 10;
	    
		for(int i=0; i<141; i++) {
			String randomStr = random.ints(leftLimit, rightLimit + 1)
                    .filter(k -> (k <= 57 || k >= 65) && (k <= 90 || k >= 97))
                    .limit(targetStringLength)
                    .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
                    .toString(); 
			System.out.println(randomStr +  random.nextInt(9999) + "@metanet.co.kr");
		}
	}
}
