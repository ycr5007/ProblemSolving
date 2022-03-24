package programmers.question.lv1.q34;

/*
	2016년
	
	문제 설명
		2016년 1월 1일은 금요일입니다. 2016년 a월 b일은 무슨 요일일까요? 두 수 a ,b를 입력받아 2016년 a월 b일이 무슨 요일인지 리턴하는 함수, 
		solution을 완성하세요. 요일의 이름은 일요일부터 토요일까지 각각 SUN,MON,TUE,WED,THU,FRI,SAT
		
		입니다. 예를 들어 a=5, b=24라면 5월 24일은 화요일이므로 문자열 "TUE"를 반환하세요.
		
	제한 조건
		2016년은 윤년입니다.
		2016년 a월 b일은 실제로 있는 날입니다. (13월 26일이나 2월 45일같은 날짜는 주어지지 않습니다)
	
	입출력 예
		a	b	result
		5	24	"TUE"
*/

public class Way1 {
	public static String solution(int a, int b) {
		String[] week = {"SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT"};
		int day = b;
		for(int i = 0; i < a; i++) {
			switch(i) {
				case 1 : case 3 : case 5 : case 7 : case 8 : case 10 : case 12 :
					day += 31;
					break;
				case 2 :
					day += 29;
					break;
				default :
					day += 30;
					break;
			}
		}
		return week[(day + 2) % 7];
	}
	
	public static void main(String[] args) {
		System.out.println(solution(5, 24));
		System.out.println();
	}
}
/*
	정확성  테스트
		테스트 1 〉	통과 (0.02ms, 77.5MB)
		테스트 2 〉	통과 (0.02ms, 80.8MB)
		테스트 3 〉	통과 (0.03ms, 84.3MB)
		테스트 4 〉	통과 (0.02ms, 75.7MB)
		테스트 5 〉	통과 (0.02ms, 75.5MB)
		테스트 6 〉	통과 (0.02ms, 79.5MB)
		테스트 7 〉	통과 (0.03ms, 76.9MB)
		테스트 8 〉	통과 (0.02ms, 73.8MB)
		테스트 9 〉	통과 (0.03ms, 79.9MB)
		테스트 10 〉	통과 (0.02ms, 72.9MB)
		테스트 11 〉	통과 (0.02ms, 77.1MB)
		테스트 12 〉	통과 (0.02ms, 75.7MB)
		테스트 13 〉	통과 (0.03ms, 75.8MB)
		테스트 14 〉	통과 (0.02ms, 75.6MB)
		
	채점 결과
		정확성: 100.0
		합계: 100.0 / 100.0
*/
