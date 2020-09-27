package codingTest;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class Level1_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 전체 스테이지의 개수 N, 
		//게임을 이용하는 사용자가 현재 멈춰있는 스테이지의 번호가 담긴 배열 stages가 매개변수로 주어질 때, 
		//실패율이 높은 스테이지부터 내림차순으로 스테이지의 번호가 담겨있는 배열을 return 
		
		Solution1_2 sol = new Solution1_2();
		int N = 5;
		int[] stages = {2,1,2,6,2,4,3,3};
		sol.solution(N, stages);
	}

}
class Solution1_2 {
    public int[] solution(int N, int[] stages) {

    	
    	int len = stages.length;
    	
    	HashMap<Integer, Double> map = new HashMap<>();
    	
/* !!!!  HashMap은 저장순서와 상관없이 key값을 기준으로 오름차순으로 저장된다!!!!!!!*/
    	
    
    	//key는 stage, value는 각 stage의 갯수
    	for(int i = 0; i < len; i++) {
    		int key = stages[i];
    		double value;
    		
    		if(key <= N) {
    			if(!map.containsKey(key))
    				value = 0;
    			else
    				value = map.get(stages[i]);
    			
    			map.put(key, ++value);
    		}
    	} //(1, 1.0) (2, 3.0), (3, 2.0), (4, 1.0) 저장되어 있음

    	for(int key = 1; key <= N; key++) {
    		if(map.containsKey(key)) {
    			double value = map.get(key);
    			map.put(key, value/len);
    			len -= value;
    		}
    		else
    			map.put(key, 0.0);
    	}
    	
    	
    	/*value로 Key를 정렬하는 법
    	 
    	ArrayList를 만들어 Map.entrySet(),을 활용해 List의 인자로 넘겨준다.
    	List를 정렬하는데 오름차순일 땐 Map.EntrycomparingByValue()를 comparator로 넘겨주고
    	내린차순일땐, Collection.reverse(Map.EntrycomparingByValue())를 넘겨준다. */
    	
    	int[] answer = new int[N];
    	
    	List<Map.Entry<Integer, Double>> list = new ArrayList<>(map.entrySet()); //entrySet - 키와 값을 엔트리의 형태로 Set에 저장해서 반환
    	list.sort(Collections.reverseOrder(Map.Entry.comparingByValue())); 
    	
    	/*for(int i = 0; i < list.size(); i++) {
    		System.out.println(list.get(i));
    	} */
    	
    	Map<Integer, Double> result = new LinkedHashMap<>(); //그냥 HashMap하면 오류
    	for(Map.Entry<Integer, Double> entry : list) {
    		result.put(entry.getKey(), entry.getValue());
    	} 
    	
    	//System.out.println(result.values());
    	
    	int n = 0;
    	
 	    for(int key : result.keySet()) {
 			answer[n] = key;
 			n++;
 	    } 
 	    
 	    
 	    
 	    //가장 큰 key값을 지워가면서 answer에 저장하는 법
    	int[] answer2 = new int[N];
    	
    	
    	for(int i =0; i< N; i++) {
    		double max = -1;
    		int maxkey = 0;
    		for(Integer key : map.keySet()) { //키가 object로 저장되어 있으므로 Integer로 캐스팅?해줘야 함
    			if(max < map.get(key)) {
    				max = map.get(key);
    				maxkey = key;
    			}
    		}
    		answer2[i] = maxkey;

    		map.remove(maxkey);
    		
    	}

    	return answer;
    }
}