package programmers.question.lv1.q23;

/*
	자연수 뒤집어 배열로 만들기

	문제 설명
		자연수 n을 뒤집어 각 자리 숫자를 원소로 가지는 배열 형태로 리턴해주세요. 예를들어 n이 12345이면 [5,4,3,2,1]을 리턴합니다.
		
	제한 조건
		n은 10,000,000,000이하인 자연수입니다.

	입출력 예
		n		return
		12345	[5,4,3,2,1]
*/

public class Way1 {
	
	public static int[] solution(long n) {
        StringBuilder str = new StringBuilder(String.valueOf(n));
        str.reverse();
        int[] answer = new int[str.length()];
        for(int i = 0; i < answer.length; i++) {
        	answer[i] = str.charAt(i) - 48;
        }
        return answer;
    }
	
	public static void main(String[] args) {
		for(int i : solution(123416234)) {
			System.out.println(i);
		}
	}
}

/*
	정확성  테스트
		테스트 1 〉	통과 (0.06ms, 68.3MB)
		테스트 2 〉	통과 (0.06ms, 76.6MB)
		테스트 3 〉	통과 (0.03ms, 71.2MB)
		테스트 4 〉	통과 (0.05ms, 74.3MB)
		테스트 5 〉	통과 (0.05ms, 77.1MB)
		테스트 6 〉	통과 (0.05ms, 76.3MB)
		테스트 7 〉	통과 (0.05ms, 73.9MB)
		테스트 8 〉	통과 (0.07ms, 73.1MB)
		테스트 9 〉	통과 (0.05ms, 65.5MB)
		테스트 10 〉	통과 (0.06ms, 78.4MB)
		테스트 11 〉	통과 (0.10ms, 78.4MB)
		테스트 12 〉	통과 (0.04ms, 75.4MB)
		테스트 13 〉	통과 (0.07ms, 78.4MB)
		
	채점 결과
		정확성: 100.0
		합계: 100.0 / 100.0
*/
