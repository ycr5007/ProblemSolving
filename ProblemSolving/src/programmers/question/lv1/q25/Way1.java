package programmers.question.lv1.q25;

/*
	약수의 합
	
	문제 설명
		정수 n을 입력받아 n의 약수를 모두 더한 값을 리턴하는 함수, solution을 완성해주세요.
		
	제한 사항
		n은 0 이상 3000이하인 정수입니다.
	
	입출력 예
		n	return
		12	28
		5	6

	입출력 예 설명
		입출력 예 #1
			12의 약수는 1, 2, 3, 4, 6, 12입니다. 이를 모두 더하면 28입니다.
		
		입출력 예 #2
			5의 약수는 1, 5입니다. 이를 모두 더하면 6입니다.
*/

public class Way1 {
	
	public static int solution(int n) {
		int answer = 0;
		int sq = (int)Math.sqrt(n);
		for(int i = 1; i <= sq; i++) {
			if(n % i == 0) {
				answer += i;
				if(n / i != i) {
					answer += n / i;
				}
			}
		}
		return answer;
	}
	
	public static void main(String[] args) {
		System.out.println(solution(10));
	}
}

/*
	정확성  테스트
		테스트 1 〉	통과 (0.02ms, 75.9MB)
		테스트 2 〉	통과 (0.03ms, 77.4MB)
		테스트 3 〉	통과 (0.03ms, 69.6MB)
		테스트 4 〉	통과 (0.04ms, 73.1MB)
		테스트 5 〉	통과 (0.03ms, 79.3MB)
		테스트 6 〉	통과 (0.03ms, 77.4MB)
		테스트 7 〉	통과 (0.04ms, 72.6MB)
		테스트 8 〉	통과 (0.04ms, 67.6MB)
		테스트 9 〉	통과 (0.03ms, 76.7MB)
		테스트 10 〉	통과 (0.02ms, 77.4MB)
		테스트 11 〉	통과 (0.03ms, 79.2MB)
		테스트 12 〉	통과 (0.02ms, 72.9MB)
		테스트 13 〉	통과 (0.03ms, 79.2MB)
		테스트 14 〉	통과 (0.03ms, 72.5MB)
		테스트 15 〉	통과 (0.03ms, 77.9MB)
		테스트 16 〉	통과 (0.02ms, 70.5MB)
		테스트 17 〉	통과 (0.03ms, 76.5MB)
		
	채점 결과
		정확성: 100.0
		합계: 100.0 / 100.0
*/
