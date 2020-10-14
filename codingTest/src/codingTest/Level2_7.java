package codingTest;

public class Level2_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Solution2_7 sol = new Solution2_7();
		sol.solution("ababcdcdababcdcd");
		
	}

}
class Solution2_7 {
    public int solution(String s) {
    	
    	if(s.length() == 1) return 1;
    	
        int answer = 1001;

        //문자열을 자르는 단위가 최대 s.length의 절반이면 된다.
        for(int i = 1; i <= s.length() /2; i++) {
        	String now, next = "", result = "";
        	int hit = 1;
        	
        	for(int j = 0; j <= s.length() / i; j++) {
        		int start = j * i;
        		int end = i * (j + 1) > s.length() ? s.length() : i * (j + 1);
        		
        		if(j == 0) {
        			now = s.substring(start, end);
        			next = s.substring(1 * i, i*2 > s.length() ? s.length() : i *2);
        		}
        		else {
            		now = next;
            		next = s.substring(start,end);
        		}

        		if(now.equals(next)) {
        			hit++;
        		}
        		else {
        			result += (processHit(hit) + now);
        			hit = 1;
        		}
        	}
        	result += (processHit(hit) + next);
        	
        	answer = Math.min(answer, result.length());
        	
        }
        System.out.println(answer);
        return answer;
    }
    
    private static String processHit(int hit) {
        return hit > 1 ? String.valueOf(hit) : "";
    }
}


