public class 없는숫자더하기 {
	

    public int solution(int[] numbers) {
        int answer = -1;
        
        int[] numeral = {0,1,2,3,4,5,6,7,8,9};
        
        for(int i=0; i<numbers.length; i++){    //하나하나 비교.. 시간복잡도는??
            for(int j=0; j<numeral.length; j++){
                if(numbers[i]==numeral[j]){
                    numeral[j] = 0;
                }
            }
        }
        
        int sum = 0;
        for(int i=0; i<numeral.length; i++){
            sum += numeral[i];
        }
        answer = sum;
        
        return answer;
    }


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		없는숫자더하기 s = new 없는숫자더하기();
		int[] numbers = {1,2,3,4,6,7,8,0};	//답 : 14
		System.out.println(s.solution(numbers));

	}

}