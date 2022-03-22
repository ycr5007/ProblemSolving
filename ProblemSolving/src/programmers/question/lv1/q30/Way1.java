package programmers.question.lv1.q30;

/*
	문자열 내 p와 y의 개수
	문제 설명
		대문자와 소문자가 섞여있는 문자열 s가 주어집니다. s에 'p'의 개수와 'y'의 개수를 비교해 같으면 True, 다르면 False를 return 하는 solution를 완성하세요.
		'p', 'y' 모두 하나도 없는 경우는 항상 True를 리턴합니다. 단, 개수를 비교할 때 대문자와 소문자는 구별하지 않습니다.
		
		예를 들어 s가 "pPoooyY"면 true를 return하고 "Pyy"라면 false를 return합니다.
		
	제한사항
		문자열 s의 길이 : 50 이하의 자연수
		문자열 s는 알파벳으로만 이루어져 있습니다.
		
	입출력 예
		s	answer
		"pPoooyY"	true
		"Pyy"	false
	
	입출력 예 설명
		입출력 예 #1
			'p'의 개수 2개, 'y'의 개수 2개로 같으므로 true를 return 합니다.
		
		입출력 예 #2
			'p'의 개수 1개, 'y'의 개수 2개로 다르므로 false를 return 합니다.
		
			※ 공지 - 2021년 8월 23일 테스트케이스가 추가되었습니다.
*/

public class Way1 {
	
	public static boolean solution(String s) {
		int count = 0;
		for(int i = 0; i < s.length(); i++) {
			String str = "" + s.charAt(i);
			if(str.equalsIgnoreCase("p")) {
				count++;
			}else if(str.equalsIgnoreCase("y")) {
				count--;
			}
		}
		return count == 0 ? true : false;
	}
	
	
	
	public static void main(String[] args) {
		System.out.println(solution("pPoooyY"));
		System.out.println(solution("Pyy"));
	}
}
/*
	정확성  테스트
		테스트 1 〉	통과 (5.23ms, 77.5MB)
		테스트 2 〉	통과 (5.26ms, 75.7MB)
		테스트 3 〉	통과 (5.39ms, 77.1MB)
		테스트 4 〉	통과 (7.30ms, 83.7MB)
		테스트 5 〉	통과 (5.37ms, 73.9MB)
		테스트 6 〉	통과 (6.78ms, 79.3MB)
		테스트 7 〉	통과 (6.80ms, 74.1MB)
		테스트 8 〉	통과 (6.82ms, 73.5MB)
		테스트 9 〉	통과 (5.50ms, 74.2MB)
		테스트 10 〉	통과 (8.08ms, 78.4MB)
		테스트 11 〉	통과 (5.45ms, 74.1MB)
		테스트 12 〉	통과 (5.30ms, 72.2MB)
		테스트 13 〉	통과 (8.13ms, 79.7MB)
		테스트 14 〉	통과 (6.32ms, 75.9MB)
		테스트 15 〉	통과 (5.67ms, 82.6MB)
		테스트 16 〉	통과 (7.78ms, 75.8MB)
		테스트 17 〉	통과 (7.74ms, 73.7MB)
		테스트 18 〉	통과 (7.89ms, 76.3MB)
		테스트 19 〉	통과 (5.33ms, 74MB)
		테스트 20 〉	통과 (5.42ms, 83.4MB)
		테스트 21 〉	통과 (5.51ms, 77MB)
		테스트 22 〉	통과 (5.49ms, 77.5MB)
		테스트 23 〉	통과 (5.42ms, 78.2MB)
		테스트 24 〉	통과 (8.02ms, 84.9MB)
		테스트 25 〉	통과 (5.29ms, 76.8MB)
		테스트 26 〉	통과 (5.76ms, 79.7MB)
		테스트 27 〉	통과 (7.50ms, 79.3MB)
		테스트 28 〉	통과 (7.88ms, 79.4MB)
		테스트 29 〉	통과 (5.66ms, 82.5MB)
		테스트 30 〉	통과 (7.23ms, 77.6MB)
		
	채점 결과
		정확성: 100.0
		합계: 100.0 / 100.0
*/