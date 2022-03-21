package programmers.question.lv1.q04;
/*
	문제 설명
		자연수 n이 매개변수로 주어집니다. n을 3진법 상에서 앞뒤로 뒤집은 후, 이를 다시 10진법으로 표현한 수를 return 하도록 solution 함수를 완성해주세요.
		
	제한사항
		n은 1 이상 100,000,000 이하인 자연수입니다.
	
	입출력 예
		n		result
		45		7
		125		229
	
	입출력 예 설명
		입출력 예 #1
	
			답을 도출하는 과정은 다음과 같습니다.
			n (10진법)	n (3진법)			앞뒤 반전(3진법)	10진법으로 표현
			45			1200			0021			7
			따라서 7을 return 해야 합니다.
		입출력 예 #2
	
			답을 도출하는 과정은 다음과 같습니다.
			n (10진법)	n (3진법)			앞뒤 반전(3진법)	10진법으로 표현
			125			11122			22111			229
			따라서 229를 return 해야 합니다.
*/
public class Way1 {
	public static int solution(int n) {
		int answer = 0;
		String str = "";
		for(int i = n;i >= 1; i /= 3) {
			str = str + i % 3;
		}
		int pow = 1;
		for(int i = str.length() - 1; i >= 0; i--) {
			answer = answer + (Character.getNumericValue(str.charAt(i)) * pow);
			pow *= 3;
		}
		return answer;
	}
	
	public static void main(String[] args) {
		System.out.println(solution(125));
	}
	
	/*
		정확성  테스트
			테스트 1 〉	통과 (13.33ms, 74.3MB)
			테스트 2 〉	통과 (9.65ms, 76MB)
			테스트 3 〉	통과 (8.56ms, 69.3MB)
			테스트 4 〉	통과 (13.59ms, 75.4MB)
			테스트 5 〉	통과 (14.25ms, 82.8MB)
			테스트 6 〉	통과 (8.67ms, 75.1MB)
			테스트 7 〉	통과 (11.02ms, 78.7MB)
			테스트 8 〉	통과 (9.01ms, 75.5MB)
			테스트 9 〉	통과 (11.14ms, 78MB)
			테스트 10 〉	통과 (10.99ms, 77.5MB)
			
		채점 결과
			정확성: 100.0
			합계: 100.0 / 100.0
	*/
}
