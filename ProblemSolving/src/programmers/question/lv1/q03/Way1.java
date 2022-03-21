package programmers.question.lv1.q03;
/*
	문제 설명
		주어진 숫자 중 3개의 수를 더했을 때 소수가 되는 경우의 개수를 구하려고 합니다. 숫자들이 들어있는 배열 nums가 매개변수로 주어질 때,
		nums에 있는 숫자들 중 서로 다른 3개를 골라 더했을 때 소수가 되는 경우의 개수를 return 하도록 solution 함수를 완성해주세요.
		
	제한사항
		absolutes의 길이는 1 이상 1,000 이하입니다.
		absolutes의 모든 수는 각각 1 이상 1,000 이하입니다.
		signs의 길이는 absolutes의 길이와 같습니다.
		signs[i] 가 참이면 absolutes[i] 의 실제 정수가 양수임을, 그렇지 않으면 음수임을 의미합니다.

	입출력 예
		absolutes		signs					result
		[4,7,12]		[true,false,true]		9
		[1,2,3]			[false,false,true]		0
		
	입출력 예 설명
		입출력 예 #1
		
			signs가 [true,false,true] 이므로, 실제 수들의 값은 각각 4, -7, 12입니다.
			따라서 세 수의 합인 9를 return 해야 합니다.
	
		입출력 예 #2
	
			signs가 [false,false,true] 이므로, 실제 수들의 값은 각각 -1, -2, 3입니다.
			따라서 세 수의 합인 0을 return 해야 합니다.
*/
public class Way1 {
	public static int solution(int[] absolutes, boolean[] signs) {
		int answer = 0;
		for(int i = 0; i < absolutes.length; i++) {
			if(!signs[i]) {
				answer = answer - absolutes[i];
			}else {
				answer = answer + absolutes[i];
			}
		}
		return answer;
	}
	
	public static void main(String[] args) {
		int[] absolutes = {4, 7, 12};
		boolean[] signs = {true, false, true};
		System.out.println(solution(absolutes, signs));
	}
	
/*
	정확성  테스트
		테스트 1 〉	통과 (0.04ms, 67.7MB)
		테스트 2 〉	통과 (0.04ms, 79.9MB)
		테스트 3 〉	통과 (0.04ms, 76.7MB)
		테스트 4 〉	통과 (0.07ms, 74.5MB)
		테스트 5 〉	통과 (0.04ms, 80.6MB)
		테스트 6 〉	통과 (0.04ms, 78MB)
		테스트 7 〉	통과 (0.04ms, 74.3MB)
		테스트 8 〉	통과 (0.04ms, 83.9MB)
		테스트 9 〉	통과 (0.04ms, 77.9MB)

	채점 결과
		정확성: 100.0
		합계: 100.0 / 100.0

*/
}
