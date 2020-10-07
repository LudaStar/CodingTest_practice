package codingTest;

public class Level2_3 {

	public static void main(String[] args) {
		// 124 나라의 숫자
		
		Solution2_3 sol = new Solution2_3();
		sol.solution(28);
	
	}

}

class Solution2_3 {
    public String solution(int n) {
    	String answer = "";
    	String[] numbers = {"4", "1", "2"};
    	
        int num = n;
        
        while(num > 0){
            int remainder = num % 3;
            num /= 3;
            
            if(remainder == 0) num--;
            //3으로 나눈 나머지가 0일 때는 -1을 해주어야 한다.
            
            answer = numbers[remainder] + answer;
            System.out.println(answer);
        }
        
        return answer;
    }
}