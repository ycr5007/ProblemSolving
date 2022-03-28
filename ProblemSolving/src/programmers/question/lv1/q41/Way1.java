package programmers.question.lv1.q41;

/*
	약수의 개수와 덧셈
	
	문제 설명
		두 정수 left와 right가 매개변수로 주어집니다. left부터 right까지의 모든 수들 중에서, 약수의 개수가 짝수인 수는 더하고, 
		약수의 개수가 홀수인 수는 뺀 수를 return 하도록 solution 함수를 완성해주세요.
		
	제한사항
		1 ≤ left ≤ right ≤ 1,000
	
	입출력 예
		left	right	result
		13		17		43
		24		27		52
	
	입출력 예 설명
		입출력 예 #1
		
			다음 표는 13부터 17까지의 수들의 약수를 모두 나타낸 것입니다.
			수	약수							약수의 개수
			13	1, 13						2
			14	1, 2, 7, 14					4
			15	1, 3, 5, 15					4
			16	1, 2, 4, 8, 16				5
			17	1, 17						2
			따라서, 13 + 14 + 15 - 16 + 17 = 43을 return 해야 합니다.
		
	입출력 예 #2
		
			다음 표는 24부터 27까지의 수들의 약수를 모두 나타낸 것입니다.
			수	약수							약수의 개수
			24	1, 2, 3, 4, 6, 8, 12, 24	8
			25	1, 5, 25					3
			26	1, 2, 13, 26				4
			27	1, 3, 9, 27					4
			따라서, 24 - 25 + 26 + 27 = 52를 return 해야 합니다.
*/

public class Way1 {
	
	public static boolean aliquot(int n) {
		int aq = (int)Math.sqrt(n);
		int count = 0;
		for(int i = 1; i <= aq; i++) {
			if(n % i == 0) {
				count++;
				if(n / i != i) {
					count++;
				}
			}
		}
		return (count % 2) == 0;
	}
	
	public static int solution(int left, int right) {
		int answer = 0;
		for(int i = left; i <= right; i++) {
			if(aliquot(i)) {
				answer += i; 
			}else {
				answer -= i;
			}
		}
		return answer;
	}
	
	public static void main(String[] args) {
		System.out.println(aliquot(10));
		System.out.println(solution(13, 17));
	}
}

/*
	정확성  테스트
		테스트 1 〉	통과 (0.43ms, 71MB)
		테스트 2 〉	통과 (0.19ms, 68.7MB)
		테스트 3 〉	통과 (0.17ms, 74.5MB)
		테스트 4 〉	통과 (0.10ms, 76.9MB)
		테스트 5 〉	통과 (0.35ms, 75.1MB)
		테스트 6 〉	통과 (0.05ms, 78.7MB)
		테스트 7 〉	통과 (0.07ms, 75.7MB)
		
	채점 결과
		정확성: 100.0
		합계: 100.0 / 100.0
*/
