import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class 오픈채팅방 {
	
	public String[] solution(String[] record) {
		/*
		 * String[] answer = {};
		 * 
		 * String[][] recordArr = new String[record.length][]; for(int i=0;
		 * i<record.length; i++) { recordArr[i] = record[i].split(" ");//단어별로 저장 for(int
		 * k=0; k<recordArr[i].length; k++) { System.out.print(recordArr[i][k] + " "); }
		 * System.out.println(); //첫 단어 확인 if(recordArr[i][0].equals("Enter")) { for(int
		 * j=0; j<recordArr.length; j++) {
		 * 
		 * 
		 * } } else if(recordArr[i][0].equals("Leave")) {
		 * 
		 * } else { //change for(int j=0; j<record.length; j++) {
		 * if(recordArr[i][1].equals(recordArr[j][1])) { recordArr[j][2] =
		 * recordArr[i][2]; //이름 바꾸기 } } }
		 * 
		 * } System.out.println("바뀐후"); for(int i=0; i<recordArr.length; i++) { for(int
		 * j=0; j<recordArr[i].length; j++) { System.out.print(recordArr[i][j] + " "); }
		 * System.out.println(); } return answer;
		 */
		ArrayList<String> arr = new ArrayList();
		HashMap<String, String> map = new HashMap();
		for (int i = 0; i < record.length; i++) {
			String[] command = record[i].split(" ");

			if (command[0].equals("Enter")) {
				arr.add(command[1] + "님이 들어왔습니다.");
				map.put(command[1], command[2]);
			} else if (command[0].equals("Change")) {
				map.put(command[1], command[2]);
			} else {
				arr.add(command[1] + "님이 나갔습니다.");
			}
		}
		String[] answer = new String[arr.size()];
		for (int i = 0; i < arr.size(); i++) {
			int idx = arr.get(i).indexOf("님");
			String id = arr.get(i).substring(0, idx);
			String[] temp = arr.get(i).split(" ");
			answer[i] = map.get(id) + "님이 " + temp[1];
		}
        return answer;
    }
	
	public static void main(String[] args) {
		String[] record = {"Enter uid1234 Muzi", "Enter uid4567 Prodo",
				"Leave uid1234","Enter uid1234 Prodo","Change uid4567 Ryan"};
		
		오픈채팅방 s = new 오픈채팅방();
		System.out.println(Arrays.toString(s.solution(record)));

	}
}
