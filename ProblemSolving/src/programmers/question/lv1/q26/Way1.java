package programmers.question.lv1.q26;

/*
	문자열을 정수로 바꾸기
	
	문제 설명
		문자열 s를 숫자로 변환한 결과를 반환하는 함수, solution을 완성하세요.
		
	제한 조건
		s의 길이는 1 이상 5이하입니다.
		s의 맨앞에는 부호(+, -)가 올 수 있습니다.
		s는 부호와 숫자로만 이루어져있습니다.
		s는 "0"으로 시작하지 않습니다.

	입출력 예
		예를들어 str이 "1234"이면 1234를 반환하고, "-1234"이면 -1234를 반환하면 됩니다.
		str은 부호(+,-)와 숫자로만 구성되어 있고, 잘못된 값이 입력되는 경우는 없습니다.
*/

public class Way1 {
	
	public static int solution(String s) {
		return s.startsWith("-")? 0 - Integer.parseInt(s.substring(1)): s.startsWith("+")? Integer.parseInt(s.substring(1)) : Integer.parseInt(s);
	}
	
	public static void main(String[] args) {
		System.out.println(solution("1234"));
		System.out.println(solution("+1234"));
		System.out.println(solution("-1234"));
	}
}

/*
	정확성  테스트
		테스트 1 〉	통과 (0.03ms, 75MB)
		테스트 2 〉	통과 (0.03ms, 71.4MB)
		테스트 3 〉	통과 (0.04ms, 78.5MB)
		테스트 4 〉	통과 (0.03ms, 74.1MB)
		테스트 5 〉	통과 (0.02ms, 78.5MB)
		테스트 6 〉	통과 (0.02ms, 75.2MB)
		테스트 7 〉	통과 (0.03ms, 65.6MB)
		테스트 8 〉	통과 (0.02ms, 73.8MB)
		테스트 9 〉	통과 (0.02ms, 80MB)
		테스트 10 〉	통과 (0.02ms, 74.4MB)
		테스트 11 〉	통과 (0.03ms, 75.8MB)
		테스트 12 〉	통과 (0.03ms, 75.8MB)
		테스트 13 〉	통과 (0.03ms, 73.8MB)
		테스트 14 〉	통과 (0.04ms, 73.8MB)
		테스트 15 〉	통과 (0.02ms, 77.6MB)
	
	채점 결과
		정확성: 100.0
		합계: 100.0 / 100.0
*/
