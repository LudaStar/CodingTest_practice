package codingTest;

import java.util.LinkedList;
import java.util.Queue;
public class Level2_5_idea {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Solution2_5_idea sol = new Solution2_5_idea();
		int bridge_length = 2;
		int weight = 10;
		int[] truck_weights = {7,4,5,6};
		sol.solution(bridge_length, weight, truck_weights);

	}

}

class Solution2_5_idea {
	public int solution(int bridge_length, int weight, int[] truck_weights) {
		
		int answer = 0;
		int curWeight = 0;
		
		Queue<Truck> waitQ = new LinkedList<>();
        Queue<Truck> moveQ = new LinkedList<>();
        
        for(int t : truck_weights) {
        	waitQ.offer(new Truck(t));
        }
        //waitQ에는 truck_weights를 weight으로 1을 move로 가지고 있다.
        
        while(!waitQ.isEmpty() || !moveQ.isEmpty()) {
        	answer++;
        	
        	if(moveQ.isEmpty()) {
        		Truck t = waitQ.poll();
        		//클래스 Truck 사용을 이렇게 해도 되는 구나 깨달음
        		curWeight += t.weight;
        		moveQ.offer(t);
        		continue;
        	}
        	
        	for(Truck t : moveQ) {
        		t.moving();
        	}
        	//한칸씩 이동하는것을 의미
        	if(moveQ.peek().move > bridge_length) {
        		//move가 다리의 길이보다 커지면 moveQ에서 삭제해줌
        		Truck t = moveQ.poll();
        		curWeight -= t.weight;
        	}
        	
        	if(!waitQ.isEmpty() && curWeight + waitQ.peek().weight <= weight) {
        		//waitQ의 peek()과 move에 들어있는 무게를 합쳐서 계산
        		Truck t = waitQ.poll();
        		curWeight += t.weight;
        		moveQ.offer(t);
        	}
        }

        System.out.println(answer);
		return answer;

	}
	
	class Truck {
		int weight;
		int move;
		
		public Truck(int weight) {
			this.weight = weight;
			this.move = 1;
		}
		public void moving() {
			move++;
		}
	}
	
}

