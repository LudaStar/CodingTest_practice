package codingTest;

import java.util.Arrays;

public class Level2_14 {

	public static void main(String[] args) {
	
		Solution2_14 sol = new Solution2_14();
		int[] citations = {3,0,6,1,5};
		sol.solution(citations);

	}
}
class Solution2_14 {
    public int solution(int[] citations) {
    	
        Arrays.sort(citations);
        
        int ans = -1;
        for(int i = 0 ; i < citations.length ;i++) {
            ans = Math.max(ans, Math.min(citations[i], citations.length - i));
        }
        
        return ans;
        
    }
}