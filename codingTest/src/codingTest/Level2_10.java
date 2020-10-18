package codingTest;

public class Level2_10 {

	public static void main(String[] args) {
		
		Solution2_10 sol = new Solution2_10();
		int[] nums = {1,2,7,6,4,36,67,13,26,388,12};
		sol.solution(nums);
	}

}
class Solution2_10 {
    public int solution(int[] nums) {
        int answer = 0;
        
    	for(int i = 0; i < nums.length; i++) {
    		for(int j = i+1; j < nums.length; j++) {
    			for(int x = j+1; x < nums.length; x++) {
    				
    				int sum = nums[i] + nums[j] + nums[x];
    				
    				if(checkPrimeNumber(sum)) {
    					answer++;
    				}
    			}
    		}
    	}
        System.out.println(answer);
        return answer;
    }
    
    private boolean checkPrimeNumber(int sum) {
    	
    	int n = 2;
    	boolean flag = true;
    	while(n <  sum) {
    		if(sum % n == 0) {
    			flag = false;
    			break;
    		}
    		n++;
    	}
    	
    	if(flag)  {
    		return true;
    	}
    	else
    		return false;
    }
    
}


