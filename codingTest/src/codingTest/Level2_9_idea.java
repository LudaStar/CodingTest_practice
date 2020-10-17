package codingTest;

public class Level2_9_idea {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Solution2_9_idea sol = new Solution2_9_idea();
		int n = 5000;
		sol.solution(n);
	}

}

class Solution2_9_idea {
	public int solution(int n) {
		
		int answer = 0;
		
        while(n != 0 ){
        	
            if(n%2==0){
                n /= 2;
                
            }else{
                n -= 1;
                answer++;
            }
        }

        return answer;
	}
}