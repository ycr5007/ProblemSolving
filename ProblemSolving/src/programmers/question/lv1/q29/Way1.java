package programmers.question.lv1.q29;

/*
	문제 설명
		문자열 s의 길이가 4 혹은 6이고, 숫자로만 구성돼있는지 확인해주는 함수, solution을 완성하세요. 
		예를 들어 s가 "a234"이면 False를 리턴하고 "1234"라면 True를 리턴하면 됩니다.
		
	제한 사항
		s는 길이 1 이상, 길이 8 이하인 문자열입니다.
	
	입출력 예
		s		return
		"a234"	false
		"1234"	true
*/

public class Way1 {
	public static boolean solution(String s) {
		try {
			if(s.length() == 4 || s.length() == 6) {
				Integer.parseInt(s);
			}else {
				return false;
			}
		} catch (Exception e) {
			return false;
		}
		return true;
	}
	
	public static void main(String[] args) {
		System.out.println(solution("a234"));
		System.out.println(solution("1234"));
		System.out.println(solution("12341521"));
		Integer.parseInt("a1234");
	}
}

/*
	정확성  테스트
		테스트 1 〉	통과 (0.03ms, 71.3MB)
		테스트 2 〉	통과 (0.02ms, 79.3MB)
		테스트 3 〉	통과 (0.05ms, 71.8MB)
		테스트 4 〉	통과 (0.03ms, 72.5MB)
		테스트 5 〉	통과 (0.03ms, 72.4MB)
		테스트 6 〉	통과 (0.02ms, 71MB)
		테스트 7 〉	통과 (0.01ms, 75.8MB)
		테스트 8 〉	통과 (0.02ms, 79.2MB)
		테스트 9 〉	통과 (0.03ms, 78.3MB)
		테스트 10 〉	통과 (0.03ms, 66.9MB)
		테스트 11 〉	통과 (0.05ms, 73.3MB)
		테스트 12 〉	통과 (0.02ms, 83.3MB)
		테스트 13 〉	통과 (0.01ms, 77.8MB)
		테스트 14 〉	통과 (0.02ms, 77MB)
		테스트 15 〉	통과 (0.02ms, 74.9MB)
		테스트 16 〉	통과 (0.02ms, 76.7MB)
		
	채점 결과
		정확성: 100.0
		합계: 100.0 / 100.0
*/
