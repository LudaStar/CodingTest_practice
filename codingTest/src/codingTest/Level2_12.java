package codingTest;

import java.util.Arrays;
import java.util.Comparator;

public class Level2_12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Solution2_12 sol = new Solution2_12();
		int[] numbers = {6 , 10 , 2};
		int[] numbers2 = {3, 30, 34, 5, 9, 999, 1, 10, 100, 1000, 0};
		//sol.solution(numbers);
		sol.solution(numbers2);

	}

}
class Solution2_12 {
    public String solution(int[] numbers) {
        String answer = "";
        
        String[] sarr = new String[numbers.length];
        for(int i = 0; i < sarr.length; i++) {
        	sarr[i] = String.valueOf(numbers[i]);
        }
        
        Arrays.sort(sarr, new Comparator<String>() {
        	@Override
        	public int compare(String str1, String str2) {
        		return (str2+str1).compareTo(str1+str2);
        	} //문자열로 비교하면 9가 가장 크고, 포함될 때는 문자열 길이가 짧은것이 우선이다
        	//3과 30 비교할 때는 330과 303중에 뭐가 큰지 비교하는 것
        });

        return sarr[0].equals("0") ? sarr[0] : String.join("", sarr);
    }
}