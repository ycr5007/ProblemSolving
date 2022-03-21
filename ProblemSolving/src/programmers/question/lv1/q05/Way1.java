package programmers.question.lv1.q05;

/*
	문제 설명
		두 정수 a, b가 주어졌을 때 a와 b 사이에 속한 모든 정수의 합을 리턴하는 함수, solution을 완성하세요.
		예를 들어 a = 3, b = 5인 경우, 3 + 4 + 5 = 12이므로 12를 리턴합니다.
	
	제한 조건
		a와 b가 같은 경우는 둘 중 아무 수나 리턴하세요.
		a와 b는 -10,000,000 이상 10,000,000 이하인 정수입니다.
		a와 b의 대소관계는 정해져있지 않습니다.
	
	입출력 예
		a	b	return
		3	5	12
		3	3	3
		5	3	12
*/

public class Way1 {
	
	public static long solution(int a, int b) {
        long answer = 0;
        for(int i = (a > b? b : a); i <= (a > b? a : b); i++) {
        	answer += i;
        }
        return answer;
    }
	
	public static void main(String[] args) {
		System.out.println(solution(5, 3));
	}
}

/*
	정확성  테스트
		테스트 1 〉	통과 (0.07ms, 73.1MB)
		테스트 2 〉	통과 (0.08ms, 72.6MB)
		테스트 3 〉	통과 (0.07ms, 75.3MB)
		테스트 4 〉	통과 (12.76ms, 77.1MB)
		테스트 5 〉	통과 (10.58ms, 78.6MB)
		테스트 6 〉	통과 (15.58ms, 79.5MB)
		테스트 7 〉	통과 (5.19ms, 70.8MB)
		테스트 8 〉	통과 (13.33ms, 80.9MB)
		테스트 9 〉	통과 (6.56ms, 74.9MB)
		테스트 10 〉	통과 (3.86ms, 74.7MB)
		테스트 11 〉	통과 (0.28ms, 85.7MB)
		테스트 12 〉	통과 (0.40ms, 72MB)
		테스트 13 〉	통과 (0.23ms, 75.2MB)
		테스트 14 〉	통과 (0.10ms, 73.5MB)
		테스트 15 〉	통과 (0.07ms, 75.2MB)
		테스트 16 〉	통과 (0.09ms, 76.3MB)
		
	채점 결과
		정확성: 100.0
		합계: 100.0 / 100.0
*/
