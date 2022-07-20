package String;

import java.util.HashSet;
import java.util.Set;

public class JewelsAndStones_solution {

	public static void main(String[] args) {
		String J = "aA", S = "aAAbbbb";
		//String J = "z", S = "ZZ";
		System.out.println(solve(J, S));
	}
	
	private static int solve(String J, String S) {
		Set<Character> set = new HashSet<>(); // 보석이 중복되지 않게 저장해줘야 함
		
		for(char jew : J.toCharArray()) {
			set.add(jew);
		}
		
		int count = 0;
		for(char stone : S.toCharArray()) {
			if(set.contains(stone)) {
				count++;
			}
		}
		
		return count;
	}
}
