package programmers.question.lv1.q37;

/*
	내적
	
	문제 설명
		길이가 같은 두 1차원 정수 배열 a, b가 매개변수로 주어집니다. a와 b의 내적을 return 하도록 solution 함수를 완성해주세요.
		
		이때, a와 b의 내적은 a[0]*b[0] + a[1]*b[1] + ... + a[n-1]*b[n-1] 입니다. (n은 a, b의 길이)
		
	제한사항
		a, b의 길이는 1 이상 1,000 이하입니다.
		a, b의 모든 수는 -1,000 이상 1,000 이하입니다.
	
	입출력 예
		a			b			result
		[1,2,3,4]	[-3,-1,0,2]	3
		[-1,0,1]	[1,0,-1]	-2
*/

public class Way1 {
	public static int solution(int[] a, int[] b) {
		int answer = 0;
		for(int i = 0; i < a.length; i++) {
			answer += a[i] * b[i];
		}
		return answer;
	}
	
	public static void main(String[] args) {
		int[] a = {1,2,3,4};
		int[] b = {-3,-1,0,2};
		System.out.println(solution(a, b));
	}
}
/*
	정확성  테스트
		테스트 1 〉	통과 (0.03ms, 74.8MB)
		테스트 2 〉	통과 (0.02ms, 77.8MB)
		테스트 3 〉	통과 (0.02ms, 72.5MB)
		테스트 4 〉	통과 (0.02ms, 74.3MB)
		테스트 5 〉	통과 (0.02ms, 82.2MB)
		테스트 6 〉	통과 (0.02ms, 77.5MB)
		테스트 7 〉	통과 (0.05ms, 71.6MB)
		테스트 8 〉	통과 (0.04ms, 78MB)
		테스트 9 〉	통과 (0.03ms, 76.4MB)
		
	채점 결과
		정확성: 100.0
		합계: 100.0 / 100.0
*/
