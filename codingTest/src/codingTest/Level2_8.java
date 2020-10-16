package codingTest;

public class Level2_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Solution2_8 sol = new Solution2_8();
		String skill = "CBD";
		String[] skill_trees = {"BACDE", "CBADF", "AECB", "BDA"};
		sol.solution(skill, skill_trees);
	}
}

class Solution2_8 {
    public int solution(String skill, String[] skill_trees) {
        int answer = 0;
        
        char[] skills = skill.toCharArray();
        
        for(int i = 0; i < skill_trees.length; i++) {
        	char[] tmp = skill_trees[i].toCharArray();
        	int index = 0, count = 0;

        	for(char j : skill_trees[i].toCharArray() ) {
        		for(int x = 0; x < skills.length; x++) {
        			
        			if(skills[x] == j) {
        				count++;
        				if(x == index)
        					index++;
        			}
        		}
        	}
        	if(count == index) {
        		answer++;
        	}
        	System.out.println("count " + count + " index " +index);
        }
        System.out.println(answer);
        return answer;
    }
    
}