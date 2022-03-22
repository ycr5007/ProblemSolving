package programmers.question.lv1.q31;

/*
	문자열 내림차순으로 배치하기
	문제 설명
		문자열 s에 나타나는 문자를 큰것부터 작은 순으로 정렬해 새로운 문자열을 리턴하는 함수, solution을 완성해주세요.
		s는 영문 대소문자로만 구성되어 있으며, 대문자는 소문자보다 작은 것으로 간주합니다.
		
	제한 사항
		str은 길이 1 이상인 문자열입니다.
	
	입출력 예
		s			return
		"Zbcdefg"	"gfedcbZ"
*/

public class Way1 {
	public static String solution(String s) {
		char[] ch = s.toCharArray();
		char temp;
		for(int i = 0; i < s.length(); i++) {
			for(int j = 0; j < s.length(); j++) {
				if(ch[i] > ch[j]) {
					temp = ch[i];
					ch[i] = ch[j];
					ch[j] = temp;
				}
			}
		}
		return new String(ch);
	}
	
	public static void main(String[] args) {
		System.out.println(solution("Zbcdefg"));
	}
}

/*
	정확성  테스트
		테스트 1 〉	통과 (0.10ms, 74.7MB)
		테스트 2 〉	통과 (0.06ms, 77.1MB)
		테스트 3 〉	통과 (0.07ms, 72.7MB)
		테스트 4 〉	통과 (0.07ms, 73.5MB)
		테스트 5 〉	통과 (4.26ms, 77.2MB)
		테스트 6 〉	통과 (3.00ms, 81.8MB)
		테스트 7 〉	통과 (0.11ms, 71.6MB)
		테스트 8 〉	통과 (0.24ms, 72MB)
		테스트 9 〉	통과 (0.52ms, 74.6MB)
		테스트 10 〉	통과 (0.35ms, 78.4MB)
		테스트 11 〉	통과 (0.09ms, 77.3MB)
		테스트 12 〉	통과 (0.14ms, 77.3MB)
		테스트 13 〉	통과 (0.14ms, 74.1MB)
		테스트 14 〉	통과 (0.04ms, 76.4MB)
		테스트 15 〉	통과 (0.02ms, 76.1MB)
		테스트 16 〉	통과 (0.03ms, 75.7MB)
		
	채점 결과
		정확성: 100.0
		합계: 100.0 / 100.0
*/
