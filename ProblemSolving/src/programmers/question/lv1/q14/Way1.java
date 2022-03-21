package programmers.question.lv1.q14;

/*
	평균 구하기
	
	문제 설명
		정수를 담고 있는 배열 arr의 평균값을 return하는 함수, solution을 완성해보세요.
	
	제한사항
		arr은 길이 1 이상, 100 이하인 배열입니다.
		arr의 원소는 -10,000 이상 10,000 이하인 정수입니다.
		
	입출력 예
		arr			return
		[1,2,3,4]	2.5
		[5,5]		5
*/

public class Way1 {
	
	public static double solution(int[] arr) {
		double answer = 0;
		for(int i = 0; i < arr.length; i++) {
			answer += arr[i];
		}
		return answer / arr.length;
	}
	
	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 4};
		System.out.println(solution(arr));
	}
}

/*
	정확성  테스트
		테스트 1 〉	통과 (0.02ms, 77.1MB)
		테스트 2 〉	통과 (0.02ms, 79.5MB)
		테스트 3 〉	통과 (0.08ms, 77.4MB)
		테스트 4 〉	통과 (0.02ms, 76MB)
		테스트 5 〉	통과 (0.03ms, 82.1MB)
		테스트 6 〉	통과 (0.04ms, 86.7MB)
		테스트 7 〉	통과 (0.02ms, 73.3MB)
		테스트 8 〉	통과 (0.02ms, 70.8MB)
		테스트 9 〉	통과 (0.02ms, 77.1MB)
		테스트 10 〉	통과 (0.02ms, 74.3MB)
		테스트 11 〉	통과 (0.02ms, 77MB)
		테스트 12 〉	통과 (0.06ms, 74.9MB)
		테스트 13 〉	통과 (0.02ms, 77.8MB)
		테스트 14 〉	통과 (0.03ms, 78.5MB)
		테스트 15 〉	통과 (0.02ms, 75.6MB)
		테스트 16 〉	통과 (0.06ms, 76.5MB)
		
	채점 결과
		정확성: 100.0
		합계: 100.0 / 100.0
*/
