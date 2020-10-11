package codingTest;

import java.util.LinkedList;
import java.util.Queue;

public class Level2_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution2_5 sol = new Solution2_5();
		int bridge_length = 2;
		int weight = 10;
		int[] truck_weights = {7,4,5,6};
		sol.solution(bridge_length, weight, truck_weights);
	}

}
class Solution2_5 {
    public int solution(int bridge_length, int weight, int[] truck_weights) {
        int answer = 0;
        
        Queue<Integer> bridge = new LinkedList<>();
        int[] endTime = new int[truck_weights.length];
        
        int time = 0, cur = 0;
        
        while(true) {
        	//다리에서 내려감
        	if(!bridge.isEmpty() && endTime[bridge.peek()] == time) {
        		//endTime에 적어놓은 트럭이 내려갈 시간이 되면 내려가는 것
        		weight += truck_weights[bridge.poll()];

        	}
        	//다리위에 올라감
        	if(cur < truck_weights.length && truck_weights[cur] <= weight) {
        		bridge.add(cur);
        		//bridge에는 직접 트럭의 무게를 넣는 것이 아니라 배열 인덱스를 넣었음
        		endTime[cur] = time + bridge_length;
        		//endTime배열은 트럭이 언제 내려가는 지를 입력
        		weight -= truck_weights[cur];
        		cur++;
        	}
        	
        	time++;

            if(bridge.isEmpty()) {
            	break;
            }
        }
        
        answer = time;
        return answer; 
    }
}