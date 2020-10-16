package codingTest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
public class Level2_8_idea {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Solution2_8_idea sol = new Solution2_8_idea();
		String skill = "CBD";
		String[] skill_trees = {"BACDE", "CBADF", "AECB", "BDA"};
		sol.solution(skill, skill_trees);
	}

}

class Solution2_8_idea {
    public int solution(String skill, String[] skill_trees) {
        int answer = 0;
        ArrayList<String> skillTrees = new ArrayList<String>(Arrays.asList(skill_trees));
        //Array.asList - 일반 배열을 ArrayList로 반환, 원본 배열의 주소값을 가져오는 것
        
        Iterator<String> it = skillTrees.iterator();
        //iterator를 이용해서 반복 사용할 수 있음. iterator의 메소드로는 hasNext, next, remove가 있다.

        while (it.hasNext()) {
            if (skill.indexOf(it.next().replaceAll("[^" + skill + "]", "")) != 0) {
            	//indexOf 메소드는 특정 문자나 문자열이 앞에서부터 처음 발견되는 인덱스를 반환 없으면 -1을 반환
            	//replaceAll(정규식, 바꿀 문자) 정규식 - skill이 아닌 문자는 ""로 바꿈
                it.remove();
            }
        }
        answer = skillTrees.size();
        return answer;
    }
}