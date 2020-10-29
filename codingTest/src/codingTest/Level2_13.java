package codingTest;

import java.util.HashSet;

public class Level2_13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Solution2_13 sol = new Solution2_13();
		String numbers = "011";
		System.out.println(sol.solution(numbers));
	}

}
class Solution2_13 {
	
	public int solution(String numbers) {
		
    HashSet<Integer> set = new HashSet<>();
    permutation("", numbers, set);
    int count = 0;
    
    while(set.iterator().hasNext()){
        int a = set.iterator().next();
        System.out.println(a);
        set.remove(a);
        if(a==2) count++;
        if(a%2!=0 && isPrime(a)){
            count++;
        }
    }        
    return count;
	}

	public boolean isPrime(int n){
	    if(n==0 || n==1) return false;
	    
	    for(int i=3; i<=(int)Math.sqrt(n); i+=2){
	        if(n%i==0) return false;
	    }
	    return true;
	}

    public void permutation(String prefix, String str, HashSet<Integer> set) {
    int n = str.length();
    //if (n == 0) System.out.println(prefix);
    if(!prefix.equals("")) set.add(Integer.valueOf(prefix));
    
    for (int i = 0; i < n; i++)
    	
      permutation(prefix + str.charAt(i), str.substring(0, i) + str.substring(i+1, n), set);

    }	

}

