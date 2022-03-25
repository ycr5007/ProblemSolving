package programmers.question.lv1.q35;
/*
	나머지가 1이 되는 수 찾기
	
	문제 설명
		자연수 n이 매개변수로 주어집니다. n을 x로 나눈 나머지가 1이 되도록 하는 가장 작은 자연수 x를 return 하도록 solution 함수를 완성해주세요. 
		답이 항상 존재함은 증명될 수 있습니다.
		
	제한사항
		3 ≤ n ≤ 1,000,000
	
	입출력 예
		n		result
		10		3
		12		11
	
	입출력 예 설명
		입출력 예 #1
			10을 3으로 나눈 나머지가 1이고, 3보다 작은 자연수 중에서 문제의 조건을 만족하는 수가 없으므로, 3을 return 해야 합니다.
		
		입출력 예 #2
			12를 11로 나눈 나머지가 1이고, 11보다 작은 자연수 중에서 문제의 조건을 만족하는 수가 없으므로, 11을 return 해야 합니다.
*/
public class Way1 {
	public static int solution(int n) {
		for(int i = 1; i < n; i++) {
			if(n % i == 1) {
				return i;
			}
		}
		return 0;
	}
	
	public static void main(String[] args) {
		System.out.println(solution(10));
	}
}

/*
	정확성  테스트
		테스트 1 〉	통과 (4.21ms, 78.7MB)
		테스트 2 〉	통과 (0.03ms, 80.3MB)
		테스트 3 〉	통과 (0.02ms, 73.8MB)
		테스트 4 〉	통과 (0.02ms, 78.2MB)
		테스트 5 〉	통과 (0.02ms, 75MB)
		테스트 6 〉	통과 (0.04ms, 73.6MB)
		테스트 7 〉	통과 (0.03ms, 75.8MB)
		테스트 8 〉	통과 (0.03ms, 80.7MB)
		테스트 9 〉	통과 (0.01ms, 76.1MB)
		테스트 10 〉	통과 (0.01ms, 74.5MB)
		테스트 11 〉	통과 (0.02ms, 76.5MB)
		
	채점 결과
		정확성: 100.0
		합계: 100.0 / 100.0
*/
