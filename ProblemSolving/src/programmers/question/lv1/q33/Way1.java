package programmers.question.lv1.q33;

/*
	가운데 글자 가져오기
	
	문제 설명
		단어 s의 가운데 글자를 반환하는 함수, solution을 만들어 보세요. 단어의 길이가 짝수라면 가운데 두글자를 반환하면 됩니다.
		
	재한사항
		s는 길이가 1 이상, 100이하인 스트링입니다.
	
	입출력 예
		s		return
		"abcde"	"c"
		"qwer"	"we"
*/

public class Way1 {
	public static String solution(String s) {
		boolean evenOdd = s.length() % 2 == 0 ? true : false;
		if(evenOdd) {
			return s.substring((s.length() / 2) - 1, (s.length() / 2) + 1);
		}else {
			return Character.toString(s.charAt(s.length() / 2));
		}
	}
	
	public static void main(String[] args) {
		System.out.println(solution("abcde"));
		System.out.println(solution("qwer"));
	}
}
/*
	정확성  테스트
		테스트 1 〉	통과 (0.03ms, 72.9MB)
		테스트 2 〉	통과 (0.04ms, 82.2MB)
		테스트 3 〉	통과 (0.04ms, 78.5MB)
		테스트 4 〉	통과 (0.03ms, 70.4MB)
		테스트 5 〉	통과 (0.03ms, 82.2MB)
		테스트 6 〉	통과 (0.02ms, 76.5MB)
		테스트 7 〉	통과 (0.06ms, 72.4MB)
		테스트 8 〉	통과 (0.03ms, 75.3MB)
		테스트 9 〉	통과 (0.04ms, 72.7MB)
		테스트 10 〉	통과 (0.03ms, 72.8MB)
		테스트 11 〉	통과 (0.04ms, 72.4MB)
		테스트 12 〉	통과 (0.03ms, 72.3MB)
		테스트 13 〉	통과 (0.02ms, 77.5MB)
		테스트 14 〉	통과 (0.02ms, 75.4MB)
		테스트 15 〉	통과 (0.01ms, 76.1MB)
		테스트 16 〉	통과 (0.01ms, 78.7MB)
		
	채점 결과
		정확성: 100.0
		합계: 100.0 / 100.0
*/
