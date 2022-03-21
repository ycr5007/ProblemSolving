package programmers.question.lv1.q11;

/*

	문제 설명
		배열 array의 i번째 숫자부터 j번째 숫자까지 자르고 정렬했을 때, k번째에 있는 수를 구하려 합니다.
		예를 들어 array가 [1, 5, 2, 6, 3, 7, 4], i = 2, j = 5, k = 3이라면
		
		array의 2번째부터 5번째까지 자르면 [5, 2, 6, 3]입니다.
		1에서 나온 배열을 정렬하면 [2, 3, 5, 6]입니다.
		2에서 나온 배열의 3번째 숫자는 5입니다.
		배열 array, [i, j, k]를 원소로 가진 2차원 배열 commands가 매개변수로 주어질 때, commands의 모든 원소에 대해 앞서 설명한 연산을 적용했을 때 나온 결과를 배열에 담아 return 하도록 solution 함수를 작성해주세요.

	제한사항
		array의 길이는 1 이상 100 이하입니다.
		array의 각 원소는 1 이상 100 이하입니다.
		commands의 길이는 1 이상 50 이하입니다.
		commands의 각 원소는 길이가 3입니다.

	입출력 예 설명
		[1, 5, 2, 6, 3, 7, 4]를 2번째부터 5번째까지 자른 후 정렬합니다. [2, 3, 5, 6]의 세 번째 숫자는 5입니다.
		[1, 5, 2, 6, 3, 7, 4]를 4번째부터 4번째까지 자른 후 정렬합니다. [6]의 첫 번째 숫자는 6입니다.
		[1, 5, 2, 6, 3, 7, 4]를 1번째부터 7번째까지 자릅니다. [1, 2, 3, 4, 5, 6, 7]의 세 번째 숫자는 3입니다.

 * */

public class Way1 {
	public static int[] solution(int[] array, int[][] commands) {
	    int result[] = new int[commands.length];	// 정답 배열
	    
	    for(int i = 0 ; i < commands.length; i++) {
	    	int[] sort = new int[(commands[i][1] - commands[i][0]) + 1];	// 정렬된 배열
	    	
	    	for(int j = (commands[i][0] - 1); j < commands[i][1]; j++) {
	    		int temp = 0;
	    		
	    		// 정렬
	    		for(int p = (commands[i][0] - 1); p < commands[i][1]; p++) {
	    			if(array[j] > array[p]) {
	    				temp++;
	    			}
	    		}
	    		sort[temp] = array[j];
	    	}
	    	result[i] = sort[commands[i][2] - 1];
	    }
	    return result;
	}
	
	public static void main(String[] args) {
		int[] arr1 = {1, 5, 2, 6, 3, 7, 4};
		int[][] arr2 = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};
		int[] result = solution(arr1, arr2);				// return : [5, 6, 3]
		
		System.out.println();
		for(int i = 0; i < result.length; i++) {
			System.out.print(result[i] + "\t");
		}
	}
	
	/*
		채점 결과 
			테스트 1 〉	통과 (0.02ms, 71.5MB)
			테스트 2 〉	통과 (0.02ms, 76.5MB)
			테스트 3 〉	통과 (0.01ms, 77.2MB)
			테스트 4 〉	실패 (0.02ms, 76.6MB)
			테스트 5 〉	실패 (0.01ms, 75.6MB)
			테스트 6 〉	통과 (0.01ms, 72.8MB)
			테스트 7 〉	통과 (0.02ms, 76.5MB)
			
			정확성: 71.4
			합계: 71.4 / 100.0
	 */
	
}
