package programmers.question.lv1.q38;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
	나누어 떨어지는 숫자 배열
	
	문제 설명
		array의 각 element 중 divisor로 나누어 떨어지는 값을 오름차순으로 정렬한 배열을 반환하는 함수, solution을 작성해주세요.
		divisor로 나누어 떨어지는 element가 하나도 없다면 배열에 -1을 담아 반환하세요.
		
	제한사항
		arr은 자연수를 담은 배열입니다.
		정수 i, j에 대해 i ≠ j 이면 arr[i] ≠ arr[j] 입니다.
		divisor는 자연수입니다.
		array는 길이 1 이상인 배열입니다.
	
	입출력 예
		arr				divisor		return
		[5, 9, 7, 10]	5			[5, 10]
		[2, 36, 1, 3]	1			[1, 2, 3, 36]
		[3,2,6]			10			[-1]
	
	입출력 예 설명
		입출력 예#1
			arr의 원소 중 5로 나누어 떨어지는 원소는 5와 10입니다. 따라서 [5, 10]을 리턴합니다.
		
		입출력 예#2
			arr의 모든 원소는 1으로 나누어 떨어집니다. 원소를 오름차순으로 정렬해 [1, 2, 3, 36]을 리턴합니다.
		
		입출력 예#3
			3, 2, 6은 10으로 나누어 떨어지지 않습니다. 나누어 떨어지는 원소가 없으므로 [-1]을 리턴합니다.
*/
public class Way1 {
	public static Object[] solution(int[] arr, int divisor) {
		List<Integer> list = new ArrayList<Integer>();
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] % divisor == 0) {
				list.add(arr[i]);
			}
		}
		if(!list.isEmpty()) {
			Collections.sort(list);
			return list.toArray();
		}else {
			list.add(-1);
			return list.toArray();
		}
	}
	
	public static void main(String[] args) {
		int[] arr = {5, 9, 7, 10};
		
		Object[] result = solution(arr, 5);
		for(Object res : result) {
			System.out.println(res);
		}
	}
}

/*
	정확성  테스트
		테스트 1 〉	통과 (0.22ms, 83.5MB)
		테스트 2 〉	통과 (0.20ms, 77.6MB)
		테스트 3 〉	통과 (0.26ms, 87.3MB)
		테스트 4 〉	통과 (0.22ms, 73.7MB)
		테스트 5 〉	통과 (0.26ms, 75MB)
		테스트 6 〉	통과 (1.29ms, 78.6MB)
		테스트 7 〉	통과 (0.09ms, 85.6MB)
		테스트 8 〉	통과 (0.03ms, 72.6MB)
		테스트 9 〉	통과 (0.25ms, 77.6MB)
		테스트 10 〉	통과 (0.58ms, 73MB)
		테스트 11 〉	통과 (0.23ms, 78.1MB)
		테스트 12 〉	통과 (0.26ms, 76.1MB)
		테스트 13 〉	통과 (0.11ms, 74.1MB)
		테스트 14 〉	통과 (0.39ms, 82.8MB)
		테스트 15 〉	통과 (0.35ms, 73.2MB)
		테스트 16 〉	통과 (0.26ms, 79.2MB)
		
	채점 결과
		정확성: 100.0
		합계: 100.0 / 100.0
*/
