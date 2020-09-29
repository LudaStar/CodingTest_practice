package codingTest;

public class Level2_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution2_1 sol = new Solution2_1();
		sol.solution(52000000, 22453878);
	}

}

class Solution2_1 {
    public long solution(int w, int h) {
    	
    	long greatestCommon = 1;
    	
    	long w2 = Long.valueOf(w);
    	long h2 = Long.valueOf(h);
    	//long으로 변환 안 하고 풀면 통과 안 되는 테스트케이스들이 있다.
    	
    	for (long i = 1; i <= w; i++) {
    		if(w2%i == 0 && h2%i == 0) {
    			greatestCommon = i;
    		}
    		else 
    			continue;
    	}
    	
        //long totalnum = greatestCommon * (w2/greatestCommon + h2/greatestCommon -1);
    	long totalnum =  w2 + h2 -greatestCommon ;
        long answer = w2*h2 - totalnum;
        
        System.out.println(answer);
        return answer;
    }
}