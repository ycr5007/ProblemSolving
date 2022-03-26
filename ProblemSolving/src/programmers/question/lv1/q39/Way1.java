package programmers.question.lv1.q39;

/*
	시저 암호
	
	문제 설명
		어떤 문장의 각 알파벳을 일정한 거리만큼 밀어서 다른 알파벳으로 바꾸는 암호화 방식을 시저 암호라고 합니다. 
		예를 들어 "AB"는 1만큼 밀면 "BC"가 되고, 3만큼 밀면 "DE"가 됩니다. "z"는 1만큼 밀면 "a"가 됩니다. 
		문자열 s와 거리 n을 입력받아 s를 n만큼 민 암호문을 만드는 함수, solution을 완성해 보세요.
		
	제한 조건
		공백은 아무리 밀어도 공백입니다.
		s는 알파벳 소문자, 대문자, 공백으로만 이루어져 있습니다.
		s의 길이는 8000이하입니다.
		n은 1 이상, 25이하인 자연수입니다.
	
	입출력 예
		s			n		result
		"AB"		1		"BC"
		"z"			1		"a"
		"a B z"		4		"e F d"
*/

public class Way1 {
	/*
		A ~ Z : 65 ~ 90
		a ~ z : 97 ~ 122
		" "(Space) : 32
	*/
	
	public static String solution(String s, int n) {
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < s.length(); i++) {
			if(s.charAt(i) >= 65 && s.charAt(i) <= 90) {
				if((int)s.charAt(i) + n > 90) {
					sb.append((char)((s.charAt(i) + n) - 26));
				}else {
					sb.append((char)(s.charAt(i) + n));
				}
			}else if(s.charAt(i) >= 97 && s.charAt(i) <= 122) {
				if((int)s.charAt(i) + n > 122) {
					sb.append((char)((s.charAt(i) + n) - 26));
				}else {
					sb.append((char)(s.charAt(i) + n));
				}
			}else {
				sb.append(" ");
			}
		}
		return new String(sb);
	}
	
	public static void main(String[] args) {
		System.out.println(solution("AB", 1));
		System.out.println(solution("z", 1));
		System.out.println(solution("a B z", 4));
	}
}

/*
	정확성  테스트
		테스트 1 〉	통과 (0.03ms, 77.8MB)
		테스트 2 〉	통과 (0.04ms, 75.4MB)
		테스트 3 〉	통과 (0.05ms, 66.3MB)
		테스트 4 〉	통과 (0.05ms, 72.9MB)
		테스트 5 〉	통과 (0.04ms, 72.7MB)
		테스트 6 〉	통과 (0.06ms, 73.3MB)
		테스트 7 〉	통과 (0.09ms, 76.7MB)
		테스트 8 〉	통과 (0.05ms, 76MB)
		테스트 9 〉	통과 (0.05ms, 76.4MB)
		테스트 10 〉	통과 (0.04ms, 74.3MB)
		테스트 11 〉	통과 (0.06ms, 77.2MB)
		테스트 12 〉	통과 (0.05ms, 76.8MB)
		테스트 13 〉	통과 (1.50ms, 67MB)
		
	채점 결과
		정확성: 100.0
		합계: 100.0 / 100.0
*/
