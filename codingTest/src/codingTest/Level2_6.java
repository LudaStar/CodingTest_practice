package codingTest;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Level2_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Solution2_6 sol = new Solution2_6();
		int[] progresses = {95,30,55};
		int[] speeds = {1,30,5};
		sol.solution(progresses, speeds);
		
		//int[] progresses = {95, 90, 99, 99, 80, 99};
		//int[] speeds = {1, 1, 1, 1, 1, 1};

	}

}
class Solution2_6 {
    public int[] solution(int[] progresses, int[] speeds) {
        
    	int[] answer = {};
        List<Integer> result = new ArrayList<>();
        boolean flag = true;
        int deployCount = 0;
        
        while(flag) {
        	//큐에 progresses와 speeds를 더해서 넣어주자
        	 Queue<Integer> queue = doTask(progresses, speeds);
        	 
        	 if(checkQueue(queue)) {
        		 deploy(queue, result);
        		 
        		 progresses = swapData(progresses, result.get(deployCount));
        		 speeds = swapData(speeds, result.get(deployCount));
        		 
        		 deployCount++;
        		 	 
        	 }
        	 
    		 if(queue.size() == 0) {
    			 flag = false;
    		 }

        }
        answer = getResult(result);
        return answer;
    }
    
    //배포기능
    private void deploy(Queue<Integer> queue, List<Integer> result) {
    	int count = 0;
    	while(queue.size() > 0 && queue.peek() >= 100) {
    		queue.poll();
    		count++;
    	}
    	result.add(count);
    }
    
    //큐의 첫번째 데이터가 배포가능한지 체크
    private boolean checkQueue(Queue<Integer> queue) {
    	if(queue.peek() >= 100) {
    		return true;
    	}
    	return false;
    }
    
    //작업 (작업에 speeds값을 더함)
    private Queue<Integer> doTask(int[] progresses, int[] speeds) {
    	
    	Queue<Integer> queue = new LinkedList();
    	
    	for(int i = 0; i < progresses.length; i++) {
    		if(progresses[i] < 100) {
    			progresses[i] += speeds[i];
    		}
    		queue.add(progresses[i]);
    	}
    	return queue;
    }
    
    //여기서 삭제된 애들을 지우고 새로운 배열을 만들어서 내보냄
    private int[] swapData(int[] source, int reduceCount) {
    	
    	int[] temp = new int[source.length - reduceCount];
    	
    	for(int i = 0; i < temp.length; i++) {
    		temp[i] = source[i + reduceCount];
    	}
    	return temp;
    }
    
    //배열로 변환
    private int[] getResult(List<Integer> result) {
    	
    	int[] answer = new int[result.size()];
    	
    	for(int i = 0; i < answer.length; i++) {
    		answer[i] = result.get(i);
    	}
    	return answer;
    }

}


