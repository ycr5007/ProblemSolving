package programmers.question.lv1.q19;

/*
	제일 작은 수 제거하기

	문제 설명
		정수를 저장한 배열, arr 에서 가장 작은 수를 제거한 배열을 리턴하는 함수, solution을 완성해주세요. 단, 리턴하려는 배열이 빈 배열인 경우엔 배열에 -1을 채워 리턴하세요. 예를들어 arr이 [4,3,2,1]인 경우는 [4,3,2]를 리턴 하고, [10]면 [-1]을 리턴 합니다.
		
	제한 조건
		arr은 길이 1 이상인 배열입니다.
		인덱스 i, j에 대해 i ≠ j이면 arr[i] ≠ arr[j] 입니다.
	
	입출력 예
		arr			return
		[4,3,2,1]	[4,3,2]
		[10]		[-1]
*/
public class Way1 {

	public static int searchMin(int[] arr) {
		int min = arr[0];
		for(int i = 0; i < arr.length; i++) {
			if(min > arr[i]) {
				min = arr[i];
			}
		}
		return min;
	}
	
	public static int[] solution(int[] arr) {
		int[] answer;
		if(arr.length <= 1) {
			answer = new int[1];
			answer[0] = -1;
		}else {
			answer = new int[arr.length - 1];
			for(int i = 0, j = 0; i < arr.length;) {
				if(arr[i] == searchMin(arr)) {
					i++;
				}else {
					answer[j] = arr[i];
					j++;
					i++;
				}
			}
		}
		return answer;
	}
	
	public static void main(String[] args) {
		int[] arr = {4, 3, 2, 1, 5, 7};
		
		for(int i : solution(arr)) {
			System.out.println(i);
		}
	}
}

/*
	정확성  테스트
		테스트 1 〉	통과 (686.67ms, 90.1MB)
		테스트 2 〉	통과 (1.14ms, 78.6MB)
		테스트 3 〉	통과 (2.78ms, 81.5MB)
		테스트 4 〉	통과 (0.75ms, 74.1MB)
		테스트 5 〉	통과 (0.32ms, 72.1MB)
		테스트 6 〉	통과 (3.19ms, 68.7MB)
		테스트 7 〉	통과 (5.22ms, 73.4MB)
		테스트 8 〉	통과 (0.02ms, 75.6MB)
		테스트 9 〉	통과 (0.07ms, 84MB)
		테스트 10 〉	통과 (0.02ms, 72.5MB)
		테스트 11 〉	통과 (0.03ms, 76.4MB)
		테스트 12 〉	통과 (0.05ms, 75MB)
		테스트 13 〉	통과 (0.33ms, 74.7MB)
		테스트 14 〉	통과 (3.53ms, 79MB)
		테스트 15 〉	통과 (1.24ms, 77.5MB)
		테스트 16 〉	통과 (3.85ms, 80.1MB)
		
	채점 결과
		정확성: 100.0
		합계: 100.0 / 100.0
*/
