package programmers.question.lv1.q40;

import java.util.HashMap;


// https://stackoverflow.com/questions/3870064/performance-considerations-for-keyset-and-entryset-of-map
public class Answer {
	
	public static String solution1(String[] participant, String[] completion) {
        String answer = "";
        HashMap<String, Integer> hm = new HashMap<>();
        for (String player : participant) hm.put(player, hm.getOrDefault(player, 0) + 1);
        for (String player : completion) hm.put(player, hm.get(player) - 1);

        for (String key : hm.keySet()) {
            if (hm.get(key) != 0){
                answer = key;
            }
        }
        return answer;
    }
	
	public static String solution2(String[] participant, String[] completion) { 
		HashMap<String, Integer> map = new HashMap<>(); 
		for (int i = 0; i < participant.length ; i++) { 
			map.compute(participant[i], (k, v) -> v != null ? null : 1); 
			if (i < completion.length) 
				map.compute(completion[i], (k,v) -> v != null ? null : 1); 
			} 
		return map.keySet().iterator().next(); 
	}
	
	public static void main(String[] args) {
		String[] participant1 = {"leo", "kiki", "eden"};
		String[] completion1 = {"eden", "kiki"};
		
		String[] participant2 = {"mislav", "stanko", "mislav", "ana"};
		String[] completion2 = {"stanko", "ana", "mislav"};
		
		String[] participant3 = {"marina", "josipa", "nikola", "vinko", "filipa"};
		String[] completion3 = {"josipa", "filipa", "marina", "nikola"};
		System.out.println(solution2(participant1, completion1));
		System.out.println(solution2(participant2, completion2));
		System.out.println(solution2(participant3, completion3));
	}
}
