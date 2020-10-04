package codingTest;

import java.util.Stack;

public class Level2_2_idea {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Solution2_2 sol = new Solution2_2();
		int[] prices = {23,4445,123,1,3,4,24,34,35,455,23411};
		sol.solution(prices);
	}

}
class Solution2_2_idea {
    public int[] solution(int[] prices) {
    	
    	Stack<Integer> beginIdxs = new Stack<>();
    	int i=0;
    	int[] terms = new int[prices.length];

    	beginIdxs.push(i);
    	for (i=1; i<prices.length; i++) {
    		
    	    while (!beginIdxs.empty() && prices[i] < prices[beginIdxs.peek()]) {
    	    	
    	        int beginIdx = beginIdxs.pop();
    	        terms[beginIdx] = i - beginIdx;
    	    }
    	    
    	    beginIdxs.push(i);
    	}

    	while (!beginIdxs.empty()) {
    		
    	    int beginIdx = beginIdxs.pop();
    	    terms[beginIdx] = i - beginIdx - 1;
    	}
    	return terms;
    }
}
