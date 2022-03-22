package programmers.question.lv1.q27;
/*
	소수 찾기
	
	문제 설명
		1부터 입력받은 숫자 n 사이에 있는 소수의 개수를 반환하는 함수, solution을 만들어 보세요.
		
		소수는 1과 자기 자신으로만 나누어지는 수를 의미합니다.
		(1은 소수가 아닙니다.)
		
	제한 조건
		n은 2이상 1000000이하의 자연수입니다.
		
	입출력 예
		n	result
		10	4
		5	3
	
	입출력 예 설명
		입출력 예 #1
			1부터 10 사이의 소수는 [2,3,5,7] 4개가 존재하므로 4를 반환
		
		입출력 예 #2
			1부터 5 사이의 소수는 [2,3,5] 3개가 존재하므로 3를 반환
*/
public class Way1 {

	public static boolean isPrimeNumber(int num) {
		for(int i = num - 1; i > 1; i--) {
			if(num % i == 0) {
				return false;
			}
		}
		return true;
	}
	
	public static int solution(int n) {
		int answer = 0;
		for(int i = 2; i <= n; i++) {
			if(isPrimeNumber(i)) {
				answer++;
			}
		}
		return answer;
	}
	
	public static void main(String[] args) {
		long start = System.currentTimeMillis();
		System.out.println(solution(100000));
		long end = System.currentTimeMillis();
		System.out.println(end - start);
	}
}

/*
	정확성  테스트
		테스트 1 〉	통과 (0.02ms, 84.1MB)
		테스트 2 〉	통과 (0.16ms, 77MB)
		테스트 3 〉	통과 (0.81ms, 76MB)
		테스트 4 〉	통과 (3.06ms, 78.4MB)
		테스트 5 〉	통과 (1.43ms, 80.7MB)
		테스트 6 〉	통과 (88.32ms, 95.4MB)
		테스트 7 〉	통과 (9.58ms, 75.3MB)
		테스트 8 〉	통과 (29.28ms, 76.3MB)
		테스트 9 〉	통과 (93.22ms, 74.7MB)
		테스트 10 〉	실패 (시간 초과)
		테스트 11 〉	실패 (시간 초과)
		테스트 12 〉	실패 (시간 초과)
	
	효율성  테스트
		테스트 1 〉	실패 (시간 초과)
		테스트 2 〉	실패 (시간 초과)
		테스트 3 〉	실패 (시간 초과)
		테스트 4 〉	실패 (시간 초과)
	
	채점 결과
		정확성: 56.3
		효율성: 0.0
		합계: 56.3 / 100.0
*/
