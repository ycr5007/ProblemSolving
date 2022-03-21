package programmers.question.lv1.q09;

/*
	문제 설명
		행렬의 덧셈은 행과 열의 크기가 같은 두 행렬의 같은 행, 같은 열의 값을 서로 더한 결과가 됩니다. 
		2개의 행렬 arr1과 arr2를 입력받아, 행렬 덧셈의 결과를 반환하는 함수, solution을 완성해주세요.
		
	제한 조건
		행렬 arr1, arr2의 행과 열의 길이는 500을 넘지 않습니다.
		
	입출력 예
		arr1			arr2			return
		[[1,2],[2,3]]	[[3,4],[5,6]]	[[4,6],[7,9]]
		[[1],[2]]		[[3],[4]]		[[4],[6]]
*/

public class Way1 {
	
	public static int[][] solution(int[][] arr1, int[][] arr2) {
		for(int i = 0; i < arr1.length; i++) {
			for(int j = 0; j < arr1[i].length; j++) {
				arr1[i][j] = arr1[i][j] + arr2[i][j];
			}
		}
		return arr1;
	}
	
	public static void main(String[] args) {
		int[][] arr1 = {{1, 2}, {2, 3}};
		int[][] arr2 = {{3, 4}, {5, 6}};
		for(int[] i : solution(arr1, arr2)) {
			for(int j : i) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}
}

/*
	정확성  테스트
		테스트 1 〉	통과 (0.02ms, 71.5MB)
		테스트 2 〉	통과 (0.04ms, 67.1MB)
		테스트 3 〉	통과 (0.07ms, 75.8MB)
		테스트 4 〉	통과 (0.04ms, 75.2MB)
		테스트 5 〉	통과 (0.03ms, 77.2MB)
		테스트 6 〉	통과 (0.04ms, 79.4MB)
		테스트 7 〉	통과 (0.02ms, 74.1MB)
		테스트 8 〉	통과 (0.03ms, 73.7MB)
		테스트 9 〉	통과 (0.40ms, 85.1MB)
		테스트 10 〉	통과 (0.18ms, 80.2MB)
		테스트 11 〉	통과 (0.12ms, 91.2MB)
		테스트 12 〉	통과 (0.15ms, 84.4MB)
		테스트 13 〉	통과 (0.19ms, 85.5MB)
		테스트 14 〉	통과 (0.15ms, 80.5MB)
		테스트 15 〉	통과 (0.16ms, 84.6MB)
		테스트 16 〉	통과 (0.16ms, 85.4MB)
		테스트 17 〉	통과 (3.26ms, 132MB)
		
	채점 결과
		정확성: 100.0
		합계: 100.0 / 100.0
*/
