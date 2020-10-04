package codingTest;

public class Level2_2 {

	public static void main(String[] args) {
		// 주식가격
		Solution2_2 sol = new Solution2_2();
		int[] prices = { 23, 4445, 123, 1, 3, 4, 24, 34, 35, 455, 23411 };
		sol.solution(prices);
	}
}

class Solution2_2 {
	public int[] solution(int[] prices) {

		  int len = prices.length; int[] answer = new int[len];
		  
		  for(int i = 0; i < len-1; i++) { 
			  
			  for(int j = i+1; j < len; j++) {
				  
				  if(prices[i] > prices[j]) { 
					  
					  answer[i] = j- i; 
					  break;
				  }
				  else 
					  answer[i] = j-i;
				  }
			  }
		  
		  answer[len-1] = 0;
		  
		  return answer;
	}
}