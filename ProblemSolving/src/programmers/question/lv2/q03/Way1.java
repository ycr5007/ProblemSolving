package programmers.question.lv2.q03;

/*
	문제 설명
		0 또는 양의 정수가 주어졌을 때, 정수를 이어 붙여 만들 수 있는 가장 큰 수를 알아내 주세요.
		예를 들어, 주어진 정수가 [6, 10, 2]라면 [6102, 6210, 1062, 1026, 2610, 2106]를 만들 수 있고, 이중 가장 큰 수는 6210입니다.
		0 또는 양의 정수가 담긴 배열 numbers가 매개변수로 주어질 때, 순서를 재배치하여 만들 수 있는 가장 큰 수를 문자열로 바꾸어 return 하도록 solution 함수를 작성해주세요.
	제한 사항
		numbers의 길이는 1 이상 100,000 이하입니다.
		numbers의 원소는 0 이상 1,000 이하입니다.
		정답이 너무 클 수 있으니 문자열로 바꾸어 return 합니다.
*/

		// 참조 URL
		
		// https://minhamina.tistory.com/38															> 조합
		// https://marobiana.tistory.com/79															> 재귀함수
		// https://www.delftstack.com/ko/howto/java/how-to-add-new-elements-to-an-array-in-java/	> ArrayList
public class Way1 {
	// 선택하고자 하는 대상 집합.
	static int[] target;
	// 대상 숫자를 선택했는지를 알려주는 집합.
	static boolean[] visited;
	// 결과값 저장
	static String[] result_arr;
	// 배열 인덱스값
	static int temp;
	
	// result의 배열크기를 정하는 팩토리얼 값
	public static int fact(int num) {
		if(num <= 1) {
			return num;
		}else {
			return fact(num-1) * num;
		}
	}
	
	// 순열 메서드(cnt는 선택 횟수, result는 결과)
		private static void permutation(int cnt, String result) {
			// 2개를 선택했으므로, 결과를 출력하고 재귀를 종료한다.
			if (cnt == 0) {
				result_arr[temp] = result;
				temp++;
				return;
			}
			// 대상 집합을 순회하며 숫자를 하나 선택한다.
			for (int i = 0; i < target.length; i++) {
				// 이미 해당 숫자를 선택한 경우에는 스킵.
				if (visited[i]) {
					continue;
				}
				// 선택하지 않은경우, 선택했다는 표시를 해준다.
				visited[i] = true;
				// 자신을 재귀 호출한다.
				permutation(cnt - 1, result + target[i]);
				// 선택을 해제한다.
				visited[i] = false;
			}
		}
	
	public static String solution(int[] numbers) {
		target = numbers;
		visited = new boolean[numbers.length + 1];
		result_arr = new String[fact(numbers.length)];
		temp = 0;
		
		permutation(numbers.length, "");
		
		String answer = result_arr[0];
		
		for(int i = 0; i < result_arr.length; i++) {
			for(int j = 0; j < result_arr.length; j++) {
				if(Integer.parseInt(answer) < Integer.parseInt(result_arr[j])) {
					answer = result_arr[j];
				}
			}
		}
		
        return answer;
    }
	
	public static void main(String[] args) {
		int[] arr1 = {6, 10, 2};			// return : "6210"
		int[] arr2 = {3, 30, 34, 5, 9};		// return : "9534330"
		int[] arr3 = {0, 0, 0, 0};			// return : "0000"
		int[] arr4 = {1, 1, 1, 1};			// return : "1111"
		String result1 = solution(arr1);
		System.out.println("result1 : " + result1);
		String result2 = solution(arr2);
		System.out.println("result2 : " + result2);
		String result3 = solution(arr3);
		System.out.println("result3 : " + result3);
		String result4 = solution(arr4);
		System.out.println("result3 : " + result4);
	}
	
	
	/*
		채점 결과 
			테스트 1 〉	실패 (메모리 초과)
			테스트 2 〉	실패 (메모리 초과)
			테스트 3 〉	실패 (메모리 초과)
			테스트 4 〉	실패 (런타임 에러)
			테스트 5 〉	실패 (메모리 초과)
			테스트 6 〉	실패 (메모리 초과)
			테스트 7 〉	실패 (메모리 초과)
			테스트 8 〉	실패 (메모리 초과)
			테스트 9 〉	실패 (메모리 초과)
			테스트 10 〉	실패 (메모리 초과)
			테스트 11 〉	실패 (런타임 에러)
			테스트 12 〉	통과 (13.54ms, 76.3MB)
			테스트 13 〉	통과 (10.46ms, 76.1MB)
			테스트 14 〉	실패 (런타임 에러)
			테스트 15 〉	통과 (12.02ms, 73MB)
			
			정확성: 20.0
			합계: 20.0 / 100.0
	 */
	
}
