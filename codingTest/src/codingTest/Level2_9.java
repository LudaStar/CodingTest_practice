package codingTest;

public class Level2_9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution2_9 sol = new Solution2_9();
		int n = 5000;
		sol.solution(n);
	}

}
//값은 알맞게 나왔지만 효율성테스트는 통과하지 못하였다.
class Solution2_9 {
    public int solution(int n) {
        int ans = 0, chk = 0;
        
        if(n == 1) return 1;
        
        while (n > 3) {
        	
            if(n % 2 == 0) {
            	n /= 2;
            }
            else {
            	n -= 1;
            	chk++;
            }
        }

        if(n == 3) {
        	ans = 2 + chk;
        }
        else if(n == 2) {
        	ans = 1 + chk;
        }

        return ans;
    }
}