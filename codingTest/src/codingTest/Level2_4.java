package codingTest;

import java.util.LinkedList;
import java.util.Queue;

public class Level2_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Solution2_4 sol = new Solution2_4();
		int[] priorities = {2,1,3,2,3};
		int location = 4;
		sol.solution(priorities, location);
	}

}
class Solution2_4 {
    public int solution(int[] priorities, int location) {
        int answer = 0;
        Queue<Printer> q = new LinkedList<>();

		for (int i = 0; i < priorities.length; i++) { // print큐에 인덱스번호, 우선순위 삽입
			q.offer(new Printer(i, priorities[i]));
		}

		while (!q.isEmpty()) {

			boolean flag = false;
			int com = q.peek().prior;
			for (Printer p : q) { //큐는 인덱스를 쓸 수 없으므로 이렇게!!
				if (com < p.prior) { // 맨앞의 수보다 큰 숫자가 존재하면 
					flag = true;
				}
			}System.out.println(flag);

			if (flag) {
				q.offer(q.poll());

			} else {// 현재 맨앞의 숫자가 가장 클 때
				if (q.poll().location == location) {
					answer = priorities.length - q.size();
				}
			}
		}
        return answer;
    }
        
class Printer {
	int location;
	int prior;

	Printer(int location, int prior) {
		this.location = location;
		this.prior = prior;
	}
}
}