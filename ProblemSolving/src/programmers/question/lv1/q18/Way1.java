package programmers.question.lv1.q18;
/*
	짝수와 홀수
	
	문제 설명
		정수 num이 짝수일 경우 "Even"을 반환하고 홀수인 경우 "Odd"를 반환하는 함수, solution을 완성해주세요.
		
	제한 조건
		num은 int 범위의 정수입니다.
		0은 짝수입니다.

	입출력 예
		num		return
		3		"Odd"
		4		"Even"
	
*/
public class Way1 {
	
	public static String solution(int num) {
		return ((num % 2) == 0 ?"Even" : "Odd");
	}
	
	public static void main(String[] args) {
		System.out.println(solution(3));
		System.out.println(solution(4));
	}
}
/*
	정확성  테스트
		테스트 1 〉	통과 (0.02ms, 72.1MB)
		테스트 2 〉	통과 (0.03ms, 76.8MB)
		테스트 3 〉	통과 (0.02ms, 86.8MB)
		테스트 4 〉	통과 (0.03ms, 78.7MB)
		테스트 5 〉	통과 (0.02ms, 78.7MB)
		테스트 6 〉	통과 (0.01ms, 80.1MB)
		테스트 7 〉	통과 (0.03ms, 73.7MB)
		테스트 8 〉	통과 (0.02ms, 72.7MB)
		테스트 9 〉	통과 (0.02ms, 78MB)
		테스트 10 〉	통과 (0.02ms, 71.3MB)
		테스트 11 〉	통과 (0.04ms, 75MB)
		테스트 12 〉	통과 (0.03ms, 72.2MB)
		테스트 13 〉	통과 (0.02ms, 68.7MB)
		테스트 14 〉	통과 (0.02ms, 72.4MB)
		테스트 15 〉	통과 (0.04ms, 75.2MB)
		테스트 16 〉	통과 (0.02ms, 72.5MB)
		
	채점 결과
		정확성: 100.0
		합계: 100.0 / 100.0
*/