package programmers.question.lv1.q21;

/*
	자릿수 더하기
	
	문제 설명
		자연수 N이 주어지면, N의 각 자릿수의 합을 구해서 return 하는 solution 함수를 만들어 주세요.
		예를들어 N = 123이면 1 + 2 + 3 = 6을 return 하면 됩니다.
		
	제한사항
		N의 범위 : 100,000,000 이하의 자연수

	입출력 예
		N		answer
		123		6
		987		24

	입출력 예 설명
		입출력 예 #1
			문제의 예시와 같습니다.
		
		입출력 예 #2
			9 + 8 + 7 = 24이므로 24를 return 하면 됩니다.
*/

public class Way1 {
	
	public static int solution(int n) {
		String str = String.valueOf(n);
		int answer = 0;
		for(int i = 0; i < str.length(); i++) {
			answer += (int)str.charAt(i) - 48;
		}
		return answer;
	}
	
	public static void main(String[] args) {
		System.out.println(solution(123456));
	}
}
/*
	정확성  테스트
		테스트 1 〉	통과 (0.05ms, 65.9MB)
		테스트 2 〉	통과 (0.03ms, 74.9MB)
		테스트 3 〉	통과 (0.03ms, 72.9MB)
		테스트 4 〉	통과 (0.02ms, 76.1MB)
		테스트 5 〉	통과 (0.03ms, 78.8MB)
		테스트 6 〉	통과 (0.02ms, 82.9MB)
		테스트 7 〉	통과 (0.02ms, 75.4MB)
		테스트 8 〉	통과 (0.05ms, 77.7MB)
		테스트 9 〉	통과 (0.02ms, 73.6MB)
		테스트 10 〉	통과 (0.05ms, 77.6MB)
		테스트 11 〉	통과 (0.03ms, 76.4MB)
		테스트 12 〉	통과 (0.04ms, 71.4MB)
		테스트 13 〉	통과 (0.03ms, 72MB)
		테스트 14 〉	통과 (0.04ms, 78.5MB)
		테스트 15 〉	통과 (0.02ms, 76.5MB)
		테스트 16 〉	통과 (0.03ms, 93.4MB)
		테스트 17 〉	통과 (0.03ms, 76.4MB)
		테스트 18 〉	통과 (0.03ms, 74.1MB)
		테스트 19 〉	통과 (0.04ms, 73.8MB)
		테스트 20 〉	통과 (0.04ms, 72.5MB)
		테스트 21 〉	통과 (0.03ms, 86.3MB)
		
	채점 결과
		정확성: 100.0
		합계: 100.0 / 100.0
*/
