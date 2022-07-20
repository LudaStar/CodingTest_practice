package String;

public class JewelsAndStones {

	public static void main(String[] args) {
		//String J = "aA", S = "aAAbbbb";
		String J = "z", S = "ZZ";
		System.out.println(solve(J, S));
	}

	private static int solve(String J, String S) {
		char[] ch = J.toCharArray();
		int count = 0;
		
		for(int i = 0; i < S.length(); i++) {
			for(int j = 0; j < ch.length; j++) {
				if(S.charAt(i) == ch[j]) 
					count++;
			}
		}
		return count;
  }
}
