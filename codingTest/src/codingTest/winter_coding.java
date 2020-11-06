package codingTest;

public class winter_coding {

	public static void main(String[] args) {

		Solution_WC sol = new Solution_WC();
		int n = 6;
		int[][] delivery = {{1,3,1},{3,5,0},{5,4,0},{2,5,0}};
 		
 		int[][] delivery2 = {{5,6,0},{1,3,1},{1,5,0},{7,6,0},{3,7,1},{2,5,0}};
 		int n2 = 7;
 		sol.solution(n2, delivery2);
	}

}
class Solution_WC {
    public String solution(int n, int[][] delivery) {
        String answer = "";
        char[] result = new char[n];
        
        for(int i = 0; i < result.length; i++) {
        	result[i] = '?';
        }


         
        for(int i = 0; i < delivery.length; i++) {
        	if(delivery[i][2] == 1) {
        		result[delivery[i][0] - 1] = 'O';
        		result[delivery[i][1] - 1] = 'O';
        	}
    

        } 
        for(int i = 0; i < delivery.length; i++) {
        	if(result[delivery[i][0] - 1] == 'O' && result[delivery[i][1] - 1] == '?') {
        		result[delivery[i][1] - 1] = 'X';
        	}
        	if(result[delivery[i][0] - 1] == '?' && result[delivery[i][1] - 1] == 'O') {
        		result[delivery[i][0] - 1] = 'X';
        	}
        }
        
        
        
        for(int i = 0; i < result.length; i++) {
        	answer += result[i];
        }
        System.out.println(answer);
        return answer;
    }
}