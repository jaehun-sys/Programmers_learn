import java.util.Arrays;

public class �ζ����ְ�������������� {

	public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = new int[2];
        int count = 0;  //��ġ�ϴ� ��ȣ ����
        int zeroCount = 0;  //0 ����
        
        for(int i=0; i<lottos.length; i++){
            for(int j=0; j<win_nums.length; j++){
                if(win_nums[j] == lottos[i]){
                    count++;
                }
            }
            if(lottos[i]==0){
                zeroCount++;
            }
        }
        
        int rank = 7-count; //���� ����
        if(rank>6){
            rank = 6;
        }
        int maxRank = 7-count-zeroCount;    //�ְ� ����
        if(maxRank>6){
            maxRank=6;
        }
        answer[0] = maxRank;
        answer[1] = rank;
        
        return answer;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] lottos = {44,1,0,0,31,25};
		int[] win_nums = {31,10,45,1,6,19};
		//��:3,5
		
		�ζ����ְ�������������� s = new �ζ����ְ��������������();
		System.out.println(Arrays.toString(s.solution(lottos, win_nums)));

	}

}
