package programmers.question.lv1.q12;

/*
	문제 설명
		프로그래머스 모바일은 개인정보 보호를 위해 고지서를 보낼 때 고객들의 전화번호의 일부를 가립니다.
		전화번호가 문자열 phone_number로 주어졌을 때, 전화번호의 뒷 4자리를 제외한 나머지 숫자를 전부 *으로 가린 문자열을 리턴하는 함수, solution을 완성해주세요.
		
	제한 조건
		s는 길이 4 이상, 20이하인 문자열입니다.
		
	입출력 예
		phone_number	return
		"01033334444"	"*******4444"
		"027778888"		"*****8888"
*/

public class Way1 {
	
	public static String solution(String phone_number) {
		return "*".repeat(phone_number.length() - 4) + phone_number.substring(phone_number.length() - 4);
	}
	
	public static void main(String[] args) {
		System.out.println(solution("01033334444"));
		System.out.println(solution("027778888"));
	}
}


/*
	정확성  테스트
		테스트 1 〉	통과 (1.24ms, 75.5MB)
		테스트 2 〉	통과 (1.19ms, 71.1MB)
		테스트 3 〉	통과 (1.00ms, 72.9MB)
		테스트 4 〉	통과 (1.32ms, 75.4MB)
		테스트 5 〉	통과 (0.97ms, 77.5MB)
		테스트 6 〉	통과 (1.27ms, 74.6MB)
		테스트 7 〉	통과 (1.12ms, 73.3MB)
		테스트 8 〉	통과 (1.52ms, 77.1MB)
		테스트 9 〉	통과 (1.89ms, 77.2MB)
		테스트 10 〉	통과 (1.18ms, 75.2MB)
		테스트 11 〉	통과 (1.19ms, 73.8MB)
		테스트 12 〉	통과 (1.06ms, 73.3MB)
		테스트 13 〉	통과 (1.10ms, 71.9MB)
		
	채점 결과
		정확성: 100.0
		합계: 100.0 / 100.0
*/