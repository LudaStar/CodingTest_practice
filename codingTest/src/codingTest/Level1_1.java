package codingTest;

import java.util.ArrayList;
import java.util.Arrays;

public class Level1_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//두 개 뽑아서 더하기, 정숫 배열 numbers에서 서로 다른 인덱스에 있는 두 개의 수를 뽑아 더해서 만들 수 있는 모든 수를 배열에 오름차순으로 return
		
		Solution sol = new Solution();
		int[] numbers = {2,1,3,4,1};
		sol.solution(numbers);
	}

}

class Solution {
	public int[] solution(int[] numbers) {
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		for(int i = 0; i < numbers.length; i++) {
			for(int j = i+1; j < numbers.length; j++) {
				int sum = numbers[i] + numbers[j];
				System.out.println("sum : " + sum + "  list.indexOf(sum) : "+list.indexOf(sum));
				if(list.indexOf(sum) < 0) //indexOf - 지정된 객체의 위치를 반환, List의 첫 번째 요소부터 순방향으로 찾는다.
					list.add(sum);
			}
		}
		int[] answer = new int[list.size()];
		
		for(int i = 0; i < list.size(); i++) {
			answer[i] = list.get(i);
		}
		Arrays.sort(answer);
		
		return answer;
	}
}