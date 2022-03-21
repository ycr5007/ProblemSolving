package programmers.question.lv1.q20;

import java.util.Arrays;
import java.util.Comparator;

/*
	정수 내림차순으로 배치하기
	
	문제 설명
		함수 solution은 정수 n을 매개변수로 입력받습니다. n의 각 자릿수를 큰것부터 작은 순으로 정렬한 새로운 정수를 리턴해주세요. 예를들어 n이 118372면 873211을 리턴하면 됩니다.
		
	제한 조건
		n은 1이상 8000000000 이하인 자연수입니다.
	
	입출력 예
		n		return
		118372	873211
*/
public class Way1 {
	
	public static long solution(long n) {
		String answer = "";
		String str = String.valueOf(n);
		Integer[] arr = new Integer[str.length()];
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = Character.getNumericValue(str.charAt(i));
		}
		Arrays.sort(arr, Comparator.reverseOrder());
		for(Integer i : arr) {
			answer += i;
		}
		return Long.parseLong(answer);
	}
	
	public static void main(String[] args) {
		System.out.println(solution(118372));
	}
}

/*
	정확성  테스트
		테스트 1 〉	통과 (2.06ms, 75.3MB)
		테스트 2 〉	통과 (1.55ms, 76.2MB)
		테스트 3 〉	통과 (1.59ms, 71.4MB)
		테스트 4 〉	통과 (1.39ms, 74.4MB)
		테스트 5 〉	통과 (1.39ms, 63.4MB)
		테스트 6 〉	통과 (2.53ms, 72.9MB)
		테스트 7 〉	통과 (1.41ms, 73.7MB)
		테스트 8 〉	통과 (1.60ms, 82.9MB)
		테스트 9 〉	통과 (1.72ms, 73.7MB)
		테스트 10 〉	통과 (1.47ms, 74.8MB)
		테스트 11 〉	통과 (1.74ms, 75.6MB)
		테스트 12 〉	통과 (2.06ms, 79.8MB)
		테스트 13 〉	통과 (1.83ms, 71.7MB)
		테스트 14 〉	통과 (2.59ms, 73.6MB)
		테스트 15 〉	통과 (2.27ms, 76.4MB)
		테스트 16 〉	통과 (1.43ms, 74.8MB)
		
	채점 결과
		정확성: 100.0
		합계: 100.0 / 100.0
*/


