
public class ����ä�ù� {
	
	public String[] solution(String[] record) {
        String[] answer = {};

        String[][] recordArr = new String[record.length][];
        for(int i=0; i<record.length; i++) {
        	recordArr[i] = record[i].split(" ");
        	for(int k=0; k<recordArr[i].length; k++) {
        		System.out.print(recordArr[i][k] + " ");
        	}
        	System.out.println();

        	//ù �ܾ� Ȯ��
        	if(recordArr[i][0].equals("Enter")) {
        		for(int j=0; j<recordArr.length; j++) {
//        			if(recordArr[i][1].equals(recordArr[j][1])) {
//        				recordArr[j][2] = recordArr[i][2];	//�̸� �ٲٱ�
//        			}
        		}
        	}
        	else if(recordArr[i][0].equals("Leave")) {
        		
        	}
        	else {	//change
        		for(int j=0; j<record.length; j++) {
        			if(recordArr[i][1].equals(recordArr[j][1])) {
        				recordArr[j][2] = recordArr[i][2];	//�̸� �ٲٱ�
        			}
        		}
        	}

        } 
        for(int i=0; i<recordArr.length; i++) {
        	for(int j=0; j<recordArr[i].length; j++) {
        		System.out.print(recordArr[i][j] + " ");
        	}
        	System.out.println();
        }
        return answer;
    }
	
	public static void main(String[] args) {
		String[] record = {"Enter uid1234 Muzi", "Enter uid4567 Prodo",
				"Leave uid1234","Enter uid1234 Prodo","Change uid4567 Ryan"};
		
		����ä�ù� s = new ����ä�ù�();
		s.solution(record);

	}
}
