package programmers.question.lv1.q17;

import java.util.ArrayList;
import java.util.List;

/*
	같은 숫자는 싫어
		
	문제 설명
		배열 arr가 주어집니다. 배열 arr의 각 원소는 숫자 0부터 9까지로 이루어져 있습니다. 이때, 배열 arr에서 연속적으로 나타나는 숫자는 하나만 남기고 전부 제거하려고 합니다. 
		단, 제거된 후 남은 수들을 반환할 때는 배열 arr의 원소들의 순서를 유지해야 합니다. 예를 들면,
		
		arr = [1, 1, 3, 3, 0, 1, 1] 이면 [1, 3, 0, 1] 을 return 합니다.
		arr = [4, 4, 4, 3, 3] 이면 [4, 3] 을 return 합니다.
		배열 arr에서 연속적으로 나타나는 숫자는 제거하고 남은 수들을 return 하는 solution 함수를 완성해 주세요.
		
	제한사항
		배열 arr의 크기 : 1,000,000 이하의 자연수
		배열 arr의 원소의 크기 : 0보다 크거나 같고 9보다 작거나 같은 정수
		
	입출력 예
		arr				answer
		[1,1,3,3,0,1,1]	[1,3,0,1]
		[4,4,4,3,3]		[4,3]
	입출력 예 설명
	
		입출력 예 #1,2
			문제의 예시와 같습니다.
*/

public class Way1 {
	public static Object[] solution(int[] arr) {
		Object[] answer = {};
		List<Integer> list = new ArrayList<Integer>();
		list.add(arr[0]);
		for(int i = 0; i < arr.length - 1; i++) {
			int j = i + 1;
			if(arr[i] != arr[j]) {
				list.add(arr[j]);
			}
		}
		answer = list.toArray();
		return answer;
	}
	
	public static void main(String[] args) {
		int[] arr = {1, 1, 3, 3, 0, 1, 1};
		
		for(Object i : solution(arr)) {
			System.out.println(i);
		}
	}
}

/*
	정확성  테스트
		테스트 1 〉	통과 (0.05ms, 73.9MB)
		테스트 2 〉	통과 (0.09ms, 69.2MB)
		테스트 3 〉	통과 (0.07ms, 72.9MB)
		테스트 4 〉	통과 (0.07ms, 72.9MB)
		테스트 5 〉	통과 (0.06ms, 75.3MB)
		테스트 6 〉	통과 (0.08ms, 73MB)
		테스트 7 〉	통과 (0.08ms, 74.8MB)
		테스트 8 〉	통과 (0.04ms, 73.6MB)
		테스트 9 〉	통과 (0.08ms, 73.5MB)
		테스트 10 〉	통과 (0.04ms, 74.6MB)
		테스트 11 〉	통과 (0.04ms, 76.3MB)
		테스트 12 〉	통과 (0.04ms, 76.8MB)
		테스트 13 〉	통과 (0.08ms, 74.2MB)
		테스트 14 〉	통과 (0.06ms, 74.7MB)
		테스트 15 〉	통과 (0.08ms, 79.4MB)
		테스트 16 〉	통과 (0.07ms, 72.6MB)
		테스트 17 〉	통과 (0.02ms, 76MB)
		
	효율성  테스트
		테스트 1 〉	통과 (20.22ms, 109MB)
		테스트 2 〉	통과 (20.08ms, 110MB)
		테스트 3 〉	통과 (21.03ms, 111MB)
		테스트 4 〉	통과 (21.76ms, 126MB)
		
	채점 결과
		정확성: 71.9
		효율성: 28.1
		합계: 100.0 / 100.0
*/
