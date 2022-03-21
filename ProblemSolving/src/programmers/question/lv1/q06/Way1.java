package programmers.question.lv1.q06;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/*
	문제 설명
		정수 배열 numbers가 주어집니다. numbers에서 서로 다른 인덱스에 있는 두 개의 수를 뽑아 더해서 만들 수 있는 모든 수를 배열에 오름차순으로 담아
		return 하도록 solution 함수를 완성해주세요.
		
		제한사항
			numbers의 길이는 2 이상 100 이하입니다.
			numbers의 모든 수는 0 이상 100 이하입니다.
		
		입출력 예
			numbers			result
			[2,1,3,4,1]		[2,3,4,5,6,7]
			[5,0,2,7]		[2,5,7,9,12]
		
		입출력 예 설명
			입출력 예 #1
			
				2 = 1 + 1 입니다. (1이 numbers에 두 개 있습니다.)
				3 = 2 + 1 입니다.
				4 = 1 + 3 입니다.
				5 = 1 + 4 = 2 + 3 입니다.
				6 = 2 + 4 입니다.
				7 = 3 + 4 입니다.
				따라서 [2,3,4,5,6,7] 을 return 해야 합니다.
		
			입출력 예 #2
			
				2 = 0 + 2 입니다.
				5 = 5 + 0 입니다.
				7 = 0 + 7 = 5 + 2 입니다.
				9 = 2 + 7 입니다.
				12 = 5 + 7 입니다.
				따라서 [2,5,7,9,12] 를 return 해야 합니다.
*/

public class Way1 {
	public static Object[] solution(int[] numbers) {
		Set<Integer> set = new HashSet<Integer>();
	    for(int i = 0; i < numbers.length - 1; i++) {
	    	for(int j = i + 1; j < numbers.length; j++) {
	    		set.add(numbers[i] + numbers[j]);
	    	}
	    }
	    List<Integer> list = new ArrayList<Integer>(set);
		Collections.sort(list);
	    return list.toArray();
		}
	
	public static void main(String[] args) {
		int[] arr = {2,1,3,4,1};
		System.out.println(solution(arr));
	}
}

/*
	정확성  테스트
		테스트 1 〉	통과 (0.34ms, 70.7MB)
		테스트 2 〉	통과 (0.29ms, 72.8MB)
		테스트 3 〉	통과 (0.32ms, 75.1MB)
		테스트 4 〉	통과 (0.29ms, 77.8MB)
		테스트 5 〉	통과 (0.35ms, 79.1MB)
		테스트 6 〉	통과 (0.45ms, 73.8MB)
		테스트 7 〉	통과 (1.24ms, 77.4MB)
		테스트 8 〉	통과 (1.03ms, 75.2MB)
		테스트 9 〉	통과 (1.29ms, 77.7MB)
		
	채점 결과
		정확성: 100.0
		합계: 100.0 / 100.0
*/
