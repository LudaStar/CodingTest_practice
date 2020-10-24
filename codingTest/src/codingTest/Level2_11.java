package codingTest;

import java.util.Iterator;
import java.util.LinkedHashSet;


public class Level2_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] words = {"tank", "kick", "know", "wheel", "land","dream","mother","robot","tank"};
		int n = 3;
		
		String[] words2 = {"hello", "one", "even", "never","now","world","draw"};
		int n2 = 2;
		
		Solution2_11 sol = new Solution2_11();
		sol.solution(n,words);
	}

}
class Solution2_11 {
    public int[] solution(int n, String[] words) {
        int[] answer = new int[2];
        
        int count = 0;

    	LinkedHashSet<String> set = new LinkedHashSet<>();
    	for(int i = 0; i < words.length; i++) {
    		set.add(words[i]);
    	}
    
    	if(set.size() == words.length) {
            for(int i = 0; i < words.length - 1; i++) {
            	String word = words[i];
            	
            	if (words[i].charAt(word.length() - 1) == words[i+1].charAt(0)) {
            		continue;
            	}
            	else {
            		count = i + 1;
            		break;
            	}	
            }

    	}
    	
    	else {
    		Iterator<String> iter = set.iterator();
    		
        	String[] tmp = new String[set.size()];
        	
        	
        	for(int i = 0; i < set.size(); i++) {
        		tmp[i] = iter.next();
        		
        	}
        	
        	for(int i = 0; i < tmp.length; i++) {
        		if(tmp[i].equals(words[i])) {
        			
        			continue;
        		}
        		else {
        			count = i;
        			break;
        		}
        	}
        	
        	if(count == 0) {
        		count = words.length - 1;
        	}
		}
    	System.out.println(count);
    	
    	if((count + 1)% n == 0) {
    		
        	answer[0] = (count+1) % n == 0 ? n : (count+1) % n;
        	answer[1] = (count+1) / n ;	    		
    	}
    	else if(count == 0) {
    		answer[0] = 0;
    		answer[1] = 0;
    	}
    	else {

        	answer[0] = (count+1) % n;
        	answer[1] = (count+1) / n + 1;	
    	}
    	
    	for(int i = 0; i < answer.length; i++) {
    		System.out.print(answer[i]);
    	}

        return answer;
    }
}