package programmers.question.lv1.q28;

/*
	서울에서 김서방 찾기
	문제 설명
		String형 배열 seoul의 element중 "Kim"의 위치 x를 찾아, "김서방은 x에 있다"는 String을 반환하는 함수, solution을 완성하세요.
		 seoul에 "Kim"은 오직 한 번만 나타나며 잘못된 값이 입력되는 경우는 없습니다.
		
	제한 사항
		seoul은 길이 1 이상, 1000 이하인 배열입니다.
		seoul의 원소는 길이 1 이상, 20 이하인 문자열입니다.
		"Kim"은 반드시 seoul 안에 포함되어 있습니다.
	
	입출력 예
		seoul			return
		["Jane", "Kim"]	"김서방은 1에 있다"
*/

public class Way1 {
	public static String solution(String[] seoul) {
		for(int i = 0; i < seoul.length; i++) {
			if(seoul[i].equals("Kim")) {
				return "김서방은 " + i + "에 있다";
			}
		}
		return null;
	}
	
	public static void main(String[] args) {
		String[] str = {"Jane", "Su", "Kim"};
		System.out.println(solution(str));
	}
}

/*
	정확성  테스트
		테스트 1 〉	통과 (5.67ms, 75.5MB)
		테스트 2 〉	통과 (6.81ms, 82.4MB)
		테스트 3 〉	통과 (5.86ms, 78.7MB)
		테스트 4 〉	통과 (8.28ms, 73.8MB)
		테스트 5 〉	통과 (8.44ms, 72.9MB)
		테스트 6 〉	통과 (7.38ms, 70.8MB)
		테스트 7 〉	통과 (6.01ms, 73.5MB)
		테스트 8 〉	통과 (6.78ms, 70MB)
		테스트 9 〉	통과 (8.66ms, 76.3MB)
		테스트 10 〉	통과 (8.06ms, 83.2MB)
		테스트 11 〉	통과 (7.19ms, 67.9MB)
		테스트 12 〉	통과 (8.09ms, 91.6MB)
		테스트 13 〉	통과 (5.67ms, 77.8MB)
		테스트 14 〉	통과 (7.63ms, 85.6MB)
		
	채점 결과
		정확성: 100.0
		합계: 100.0 / 100.0
*/
