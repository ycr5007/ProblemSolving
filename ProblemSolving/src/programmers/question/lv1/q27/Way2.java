package programmers.question.lv1.q27;

public class Way2 {
	
	public static boolean isPrimeNumber(int num) {
		for(int i = 2; i <= (int)Math.sqrt(num); i++) {
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
		System.out.println(solution(1000000));
		long end = System.currentTimeMillis();
		System.out.println(end - start);
	}
}
/*
	정확성  테스트
		테스트 1 〉	통과 (0.04ms, 76.9MB)
		테스트 2 〉	통과 (0.04ms, 75.9MB)
		테스트 3 〉	통과 (0.09ms, 75.7MB)
		테스트 4 〉	통과 (0.24ms, 78MB)
		테스트 5 〉	통과 (0.12ms, 78MB)
		테스트 6 〉	통과 (1.01ms, 74.2MB)
		테스트 7 〉	통과 (0.35ms, 77.2MB)
		테스트 8 〉	통과 (0.74ms, 71.8MB)
		테스트 9 〉	통과 (1.19ms, 74.1MB)
		테스트 10 〉	통과 (31.28ms, 85MB)
		테스트 11 〉	통과 (140.73ms, 73.5MB)
		테스트 12 〉	통과 (35.96ms, 88.8MB)
		
	효율성  테스트
		테스트 1 〉	통과 (175.20ms, 52.2MB)
		테스트 2 〉	통과 (158.95ms, 51.9MB)
		테스트 3 〉	통과 (146.42ms, 51.9MB)
		테스트 4 〉	통과 (148.67ms, 53.1MB)
		
	채점 결과
		정확성: 75.0
		효율성: 25.0
		합계: 100.0 / 100.0
*/
